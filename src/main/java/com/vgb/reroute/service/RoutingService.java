package com.vgb.reroute.service;

import com.vgb.reroute.data.Location;
import com.vgb.reroute.data.Route;

public interface RoutingService {
    public Route getOptimalRoute(Location currentLocation, Location destination);
}
