package com.vgb.reroute.service;

import com.vgb.reroute.data.Location;

import java.util.function.Supplier;

public interface CurrentLocationService {
    Location get(String id);
}

