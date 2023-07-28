package com.org.service;

import com.org.model.TrainSchedule;

import java.time.LocalDate;
import java.util.List;

public interface TrainScheduleService {
    List<TrainSchedule> getAllTrains();

    TrainSchedule geTrain(String arrivalStation, String departureStation, LocalDate trainTime, boolean showAvailable);

    TrainSchedule addSchedule(TrainSchedule trainSchedule);

    TrainSchedule removeSchedule(long trainScheduleId);

    TrainSchedule updateSchedule(TrainSchedule trainSchedule);
}
