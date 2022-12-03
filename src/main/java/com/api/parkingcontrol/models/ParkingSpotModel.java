package com.api.parkingcontrol.models;

import jakarta.persistence.*;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

@Table(name = "TB_PARKING_SPOT")
@Entity
public class ParkingSpotModel implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Column(nullable = false, unique = true, length = 10)
    private String parkingSpotNumber;
    @Column(nullable = false, unique = true, length = 7)
    private String carLicensePlate;
    @Column(nullable = false, length = 70)
    private String carBrand;
    @Column(nullable = false, length = 70)
    private String carModel;
    @Column(nullable = false, length = 70)
    private String carColor;
    @Column(nullable = false)
    private LocalDateTime registrationDate;
    private String responsibleName;
}
