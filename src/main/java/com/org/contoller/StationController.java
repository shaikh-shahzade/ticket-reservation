package com.org.contoller;

import com.org.model.Station;
import com.org.service.StationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("station")
public class StationController {
    @Autowired
    private StationService stationService;
    @GetMapping("{id}")
    public Station getStationById(@PathVariable Long id)
    {
        return stationService.getStationById(id);
    }
    @GetMapping()
    public List<Station> getAllStations()
    {
        return stationService.getAllStation();
    }
    @PostMapping
    public Station addStation(@RequestBody Station station)
    {
        return stationService.addStatioon(station);
    }

    @PutMapping
    public Station updateStation(@RequestBody Station station)
    {
        return stationService.updateStation(station);
    }

    @DeleteMapping("{id]")
    public Station deleteStation(@PathVariable Long id)
    {
        return stationService.deleteStation(id);
    }
}
