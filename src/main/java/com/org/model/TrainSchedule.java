package com.org.model;

import com.org.utility.constants.TrainStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TrainSchedule {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long trainScheduleId;
    private Train train;
    private LocalDate trainTime;
    private TrainStatus trainStatus;
    private List<TrainSeat> trainSeats;
}
