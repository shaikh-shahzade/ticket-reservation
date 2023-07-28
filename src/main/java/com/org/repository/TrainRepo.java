package com.org.repository;

import com.org.model.Train;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrainRepo extends JpaRepository<Train,Long> {
}
