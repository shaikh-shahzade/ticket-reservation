package com.org.model;

import com.org.utility.constants.TrainStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
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
    @ManyToOne()
    private Train train;
    private LocalDate trainTime;
    private TrainStatus trainStatus;
    @OneToMany(cascade = CascadeType.ALL , mappedBy = "trainSchedule")
    private List<TrainSeat> trainSeats;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "trainSchedule")
    private List<TrainSchedule> trainSchedules;
}
