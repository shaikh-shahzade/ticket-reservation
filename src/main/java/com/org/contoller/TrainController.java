package com.org.contoller;

import com.org.model.Train;
import com.org.model.TrainSchedule;
import com.org.service.TrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("train")
public class TrainController {
    @Autowired
    private TrainService trainService;

    @GetMapping()
    public List<Train> getAllTrains()
    {
        return trainService.getAllTrains();
    }
    @GetMapping("{id}")
    public Train getTrainById(@PathVariable Long id)
    {
        return trainService.getTrainById(id);
    }
    @PostMapping()
    public Train addTrain(@RequestBody Train train)
    {
        return trainService.addTrain(train);
    }
    @PutMapping()
    public Train updateTrainDetails(@RequestBody Train train)
    {
        return trainService.updateTrainDetails(train);
    }
    @DeleteMapping()
    public Train deleteTrain(@RequestBody Long id)
    {
        return trainService.deleteTrain(id);
    }
}
