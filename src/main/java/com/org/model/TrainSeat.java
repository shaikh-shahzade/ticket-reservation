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

    private Long fare;
    private BookingStatus bookingStatus;
    @ManyToOne(cascade = CascadeType.ALL)
    private TrainSchedule trainSchedule;

    @ManyToOne(cascade =CascadeType.ALL)
    private TrainReservation trainReservation;
}
