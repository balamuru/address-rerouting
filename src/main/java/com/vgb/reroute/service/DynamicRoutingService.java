package com.vgb.reroute.service;

import com.vgb.reroute.data.Route;

public interface DynamicRoutingService {
    Route getOptimalRoute(String id);
}
