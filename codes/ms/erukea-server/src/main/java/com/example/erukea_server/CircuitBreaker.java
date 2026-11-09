package com.example.erukea_server;

public @interface CircuitBreaker {

	String name();

	String fallbackMethod();

}
