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
public class Station {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long stationId;
    private String stationName;
    private String address;
    private String stationCode;

    @OneToMany(cascade = CascadeType.ALL , mappedBy ="departure")
    private List<Train> departureTrain;

    @OneToMany(cascade = CascadeType.ALL , mappedBy ="arrival")
    private List<Train> ArrivalTrain;

}
