package com.vgb.reroute.service;

import com.vgb.reroute.data.Location;
import com.vgb.reroute.data.Route;
import org.springframework.stereotype.Service;

@Service
public class RoutingServiceImpl implements RoutingService{
    @Override
    public Route getOptimalRoute(Location currentLocation, Location destination) {
        //TODO
        return null;
    }
}
