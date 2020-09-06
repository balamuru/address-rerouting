package com.vgb.reroute.service;

import com.vgb.reroute.data.Location;
import org.springframework.stereotype.Repository;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
@Repository
public class DestinationServiceInMemoryImpl implements DestinationService{

    private Map<String, Location > locations = new ConcurrentHashMap<>();

    @Override
    public boolean create(String id, Location location) {
        return (null != locations.put(id, location));
    }

    @Override
    public Location get(String id) {
        return locations.get(id);
    }

}
