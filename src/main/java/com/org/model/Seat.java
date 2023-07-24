package com.org.model;

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
public class Seat {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long seatId;
    private Long  seatNumber;
    private String seatClass;

    @ManyToOne(cascade = CascadeType.ALL )
    private Train train;
}
