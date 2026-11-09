package com.example.erukea_server;

import org.springframework.stereotype.Service;
import io.micrometer.observation.Observation;
import io.micrometer.observation.ObservationRegistry;

@Service
public class ComputerService {

    private final ObservationRegistry observationRegistry;

    public ComputerService(ObservationRegistry observationRegistry) {
        this.observationRegistry = observationRegistry;
    }

    public String testObservation() {

        return Observation
                .createNotStarted("computer.test", observationRegistry)
                .observe(() -> "Observation is working!");
    }
}