package com.vgb.reroute;

import com.vgb.reroute.data.Location;
import com.vgb.reroute.data.Route;
import com.vgb.reroute.service.DestinationService;
import com.vgb.reroute.service.DynamicRoutingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.UUID;
import java.util.stream.IntStream;

@SpringBootApplication
public class AddressReroutingApplication implements ApplicationRunner {

    public static void main(String[] args) {
        SpringApplication.run(AddressReroutingApplication.class, args);
    }

    @Autowired
    private DynamicRoutingService dynamicRoutingService;

    @Autowired
    private DestinationService destinationService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.err.println("TODO");
        final String id = UUID.randomUUID().toString();
        final Location destination = new Location(10, 10);
        destinationService.create(id, destination);

		IntStream.range(0,10).forEach(value -> {{
			Route optimalRoute = dynamicRoutingService.getOptimalRoute(id);
			System.err.println("current optimal route");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		});

    }
}
