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
}
