package com.org.serviceimpl;

import com.org.model.TrainSchedule;
import com.org.service.TrainScheduleService;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
@Service
public class TrainScheduleServiceImpl implements TrainScheduleService {
    @Override
    public List<TrainSchedule> getAllTrains() {
        return null;
    }

    @Override
    public TrainSchedule geTrain(String arrivalStation, String departureStation, LocalDate trainTime, boolean showAvailable) {
        return null;
    }

    @Override
    public TrainSchedule addSchedule(TrainSchedule trainSchedule) {
        return null;
    }

    @Override
    public TrainSchedule removeSchedule(long trainScheduleId) {
        return null;
    }

    @Override
    public TrainSchedule updateSchedule(TrainSchedule trainSchedule) {
        return null;
    }
}
