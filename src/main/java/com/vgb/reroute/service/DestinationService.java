package com.vgb.reroute.service;

import com.vgb.reroute.data.Location;

public interface DestinationService {
    boolean create(String id, Location location);

    Location get(String id);
}
