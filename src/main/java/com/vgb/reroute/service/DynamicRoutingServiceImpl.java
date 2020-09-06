package com.vgb.reroute.service;

import com.vgb.reroute.data.Route;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DynamicRoutingServiceImpl implements DynamicRoutingService {

    @Autowired
    private RoutingService routingService;

    @Autowired
    private CurrentLocationService currentLocationService;

    @Autowired
    private DestinationService destinationService;

    @Override
    public Route getOptimalRoute(String id) {
        return routingService.getOptimalRoute(currentLocationService.get(id),
                destinationService.get(id));
    }
}
