package com.org.model;

import com.org.utility.constants.BookingStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TrainReservation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long reservationId;
    @ManyToOne(cascade = CascadeType.ALL )
    private TrainSchedule trainSchedule;
    private LocalDate bookingDate;
    private BookingStatus bookingStatus;
    @OneToMany(cascade = CascadeType.ALL )
    @JoinTable(name = "customer_train_seat",
            joinColumns = {@JoinColumn(name = "reservation_id", referencedColumnName ="reservationId")},
            inverseJoinColumns = {@JoinColumn(name = "train_seat", referencedColumnName = "seatId")})
    @MapKeyJoinColumn(name = "customerId")
    private Map<Customer,TrainSeat> bookedSeats = new HashMap<Customer , TrainSeat>();

}
