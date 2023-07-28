package com.org.repository;

import com.org.model.TrainSchedule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrainScheduleRepo extends JpaRepository<TrainSchedule,Long> {
}
