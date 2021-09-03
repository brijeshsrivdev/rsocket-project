package com.example.rsocketdemo.config;

import io.rsocket.DuplexConnection;
import io.rsocket.core.RSocketConnector;
import io.rsocket.transport.ClientTransport;
import io.rsocket.transport.netty.client.TcpClientTransport;
import org.springframework.context.annotation.Bean;
import org.springframework.http.MediaType;
import org.springframework.http.codec.cbor.Jackson2CborDecoder;
import org.springframework.http.codec.cbor.Jackson2CborEncoder;
import org.springframework.messaging.rsocket.RSocketConnectorConfigurer;
import org.springframework.messaging.rsocket.RSocketRequester;
import org.springframework.messaging.rsocket.RSocketStrategies;
import reactor.core.publisher.Mono;
import reactor.util.retry.Retry;

import java.time.Duration;

public class RSocketConfig {
//    @Bean
//    public RSocketStrategies rSocketStrategies() {
//        return RSocketStrategies.builder()
//                .encoders(encoders -> encoders.add(new Jackson2CborEncoder()))
//                .decoders(decoders -> decoders.add(new Jackson2CborDecoder()))
//                .build();
//    }
//
//
//
//    @Bean
//    public Mono<RSocketRequester> getRSocketRequester(RSocketRequester.Builder builder){
//        return builder
//                .rsocketConnector(rSocketConnector -> rSocketConnector.reconnect(Retry.fixedDelay(2, Duration.ofSeconds(2))))
//                .dataMimeType(MediaType.APPLICATION_CBOR)
//                .connectTcp("localhost", 9898).retry(5).cache();
//    }
}
