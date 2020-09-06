package com.vgb.reroute.service;

import com.vgb.reroute.data.Location;
import org.springframework.stereotype.Service;

@Service
public class CurrentLocationServiceImpl implements CurrentLocationService{

    @Override
    public Location get(String id) {
        //TODO: impl
        return new Location(0, 0);
    }
}
