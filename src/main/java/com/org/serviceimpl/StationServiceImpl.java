package com.org.serviceimpl;

import com.org.exception.ResourceNotFoundException;
import com.org.model.Station;
import com.org.repository.StationRepo;
import com.org.service.StationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StationServiceImpl implements StationService {
    @Autowired
    private StationRepo stationRepo;
    @Override
    public Station getStationById(Long id) {
        Station station = stationRepo.findById(id)
                .orElseThrow(()-> {throw new ResourceNotFoundException("Station","id",id);});
        return station;
    }

    @Override
    public List<Station> getAllStation() {
        return stationRepo.findAll();
    }

    @Override
    public Station addStatioon(Station station) {
        return stationRepo.save(station);
    }

    @Override
    public Station updateStation(Station station) {

        return null;
    }

    @Override
    public Station deleteStation(Long id) {
        Station station =stationRepo.findById(id)
                .orElseThrow(()-> {throw new ResourceNotFoundException("Station","id",id);});
        stationRepo.delete(station);
        return station;
    }
}
