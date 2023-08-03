package com.org.serviceimpl;

import com.org.model.Station;
import com.org.service.StationService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StationServiceImpl implements StationService {
    @Override
    public Station getStationById(Long id) {
        return null;
    }

    @Override
    public List<Station> getAllStation() {
        return null;
    }

    @Override
    public Station addStatioon(Station station) {
        return null;
    }

    @Override
    public Station updateStation(Station station) {
        return null;
    }

    @Override
    public Station deleteStation(Station station) {
        return null;
    }
}
