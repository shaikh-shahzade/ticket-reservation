package com.org.model;

import com.org.utility.constants.BookingStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;
import java.util.Map;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TrainReservation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long reservationNum;
    private TrainSchedule trainSchedule;
    private Map<Customer,TrainSeat> bookedSeats;
    private LocalDate bookingDate;
    private BookingStatus bookingStatus;
}
