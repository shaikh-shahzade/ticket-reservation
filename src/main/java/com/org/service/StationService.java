package com.org.service;

import com.org.model.Station;

import java.util.List;

public interface StationService {
    Station getStationById(Long id);

    List<Station> getAllStation();

    Station addStatioon(Station station);

    Station updateStation(Station station);

    Station deleteStation(Station station);
}
