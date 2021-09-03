package com.example.rsocketdemo;

import com.example.rsocketdemo.model.Airport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.messaging.rsocket.RSocketConnectorConfigurer;
import org.springframework.messaging.rsocket.RSocketRequester;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

@Component
public class ClientRsocket {
   private final Mono<RSocketRequester> requesterMono;

    public ClientRsocket(RSocketRequester.Builder builder) {
        this.requesterMono = builder
                .dataMimeType(MediaType.APPLICATION_CBOR)
                .connectTcp("localhost", 9898).retry(5).cache();
    }

    public Mono<Airport> findRadar(String code) {
        return this.requesterMono.flatMap(req ->
                req.route("find.radar.{code}", code)
                        .retrieveMono(Airport.class));
    }
}
