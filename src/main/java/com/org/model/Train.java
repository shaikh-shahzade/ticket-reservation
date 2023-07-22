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
public class Train {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long trainId;
    private Long trainNum;
    @ManyToOne(cascade = CascadeType.ALL)
    private Station departure;
    @ManyToOne(cascade = CascadeType.ALL)
    private Station arrival;
    @OneToMany(cascade = CascadeType.ALL , mappedBy = "train")
    private List<Seat> seats;

}
