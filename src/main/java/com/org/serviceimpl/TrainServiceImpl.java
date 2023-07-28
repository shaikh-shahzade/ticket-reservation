package com.org.serviceimpl;

import com.org.model.Train;
import com.org.repository.TrainRepo;
import com.org.service.TrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TrainServiceImpl implements TrainService {
    @Autowired
    private TrainRepo trainRepo;
    @Override
    public List<Train> getAllTrains() {
        return trainRepo.findAll();
    }

    @Override
    public Train getTrainById(Long id) {
        return trainRepo.findById(id).get();
    }

    @Override
    public Train addTrain(Train train) {
        return trainRepo.save(train);
    }

    @Override
    public Train updateTrainDetails(Train train) {
        return null;
    }

    @Override
    public Train deleteTrain(Long id) {
        trainRepo.deleteById(id);
        return null;
    }
}
