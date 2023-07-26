package com.org.service;

import com.org.model.Train;

import java.util.List;

public interface TrainService {



    List<Train> getAllTrains();

    Train getTrainById(Long id);

    Train addTrain(Train train);

    Train updateTrainDetails(Train train);
    Train deleteTrain(Long id);
}
