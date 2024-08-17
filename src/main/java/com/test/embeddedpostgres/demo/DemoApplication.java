package com.test.embeddedpostgres.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.testcontainers.containers.GenericContainer;
import org.testcontainers.containers.Network;
import org.testcontainers.utility.DockerImageName;

import java.util.Optional;


import org.testcontainers.containers.GenericContainer;
import org.testcontainers.containers.Network;
import org.testcontainers.utility.DockerImageName;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
		System.out.println("starting");
        SpringApplication.run(DemoApplication.class, args);
        Network overlayNetwork = Network.builder()
                .driver("overlay")
                .createNetworkCmdModifier(cmd -> cmd.withAttachable(true))
                .build();
        try (
                GenericContainer<?> nginx = new GenericContainer<>(DockerImageName.parse("nginx:latest"))
                        .withNetwork(overlayNetwork)
                        .withExposedPorts(80);

                GenericContainer<?> ubuntu = new GenericContainer<>(DockerImageName.parse("ubuntu:latest"))
                        .withNetwork(overlayNetwork)
        ) {
            nginx.start();
            ubuntu.start();

            String curlResult = ubuntu.getLogs();

            while (true) {
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }
    }


}
