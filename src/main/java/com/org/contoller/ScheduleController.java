package com.org.contoller;

import com.org.model.TrainSchedule;
import com.org.service.TrainScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("schedule")
public class ScheduleController {
    @Autowired
    private TrainScheduleService trainScheduleService;
    @GetMapping
    public List<TrainSchedule> getAllSchedule()
    {
        return trainScheduleService.getAllTrains();
    }
    @GetMapping("search")
    public TrainSchedule getTrainSchedule(
            @RequestParam(defaultValue = "") String arrivalStation,
            @RequestParam(defaultValue = "") String departureStation,
            @RequestParam LocalDate trainTime,
            @RequestParam(defaultValue = "false") boolean showAvailable
            )
    {
        return trainScheduleService.geTrain(arrivalStation,departureStation,trainTime,showAvailable);

    }
    @PostMapping
    public TrainSchedule addTrainSchedule(@RequestBody TrainSchedule trainSchedule)
    {
        return trainScheduleService.addSchedule(trainSchedule);
    }
    @PutMapping
    public TrainSchedule updateTrainSchedule(@RequestBody TrainSchedule trainSchedule)
    {
        return trainScheduleService.updateSchedule(trainSchedule);
    }
    @DeleteMapping
    public TrainSchedule removeTrainSchedule(@RequestBody long trainScheduleId)
    {
        return trainScheduleService.removeSchedule(trainScheduleId);
    }

}
