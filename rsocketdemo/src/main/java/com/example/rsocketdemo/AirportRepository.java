package com.example.rsocketdemo;

import com.example.rsocketdemo.model.Airport;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

import java.util.Optional;

@Component
public class AirportRepository {
    Mono<Airport> findByCode(String code){
        Airport airport = new Airport();
        airport.setGate("GATE-4");
        return Mono.just(airport);
    }
}
