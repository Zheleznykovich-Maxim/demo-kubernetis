package com.example.demo_kubernetis;

import org.springframework.boot.SpringApplication;

public class TestDemoKubernetisApplication {

	public static void main(String[] args) {
		SpringApplication.from(DemoKubernetisApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
