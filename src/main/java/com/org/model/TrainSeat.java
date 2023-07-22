package com.org.model;

import com.org.utility.constants.BookingStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TrainSeat extends Seat{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long trainSeatId;
    private Long fare;
    private BookingStatus bookingStatus;
    @ManyToOne(cascade = CascadeType.ALL)
    private List<TrainSchedule> trainSchedule;

    @OneToMany(cascade =CascadeType.ALL , mappedBy = "bookedSeats")
    private TrainReservation trainReservation;
}
