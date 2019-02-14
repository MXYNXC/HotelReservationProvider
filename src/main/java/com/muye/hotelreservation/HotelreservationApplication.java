package com.muye.hotelreservation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient //标记这是一个Eureka的客户端 实现服务端的发布
public class HotelreservationApplication {

    public static void main(String[] args) {
        SpringApplication.run(HotelreservationApplication.class, args);
    }

}

