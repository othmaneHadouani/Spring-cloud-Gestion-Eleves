package org.sid;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer


public class ServerRegistreApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServerRegistreApplication.class, args);
    }

}
