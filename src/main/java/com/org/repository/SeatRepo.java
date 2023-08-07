package com.org.repository;

import com.org.model.Seat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeatRepo extends JpaRepository<Seat,Long> {
}
