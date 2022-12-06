package com.api.parkingcontrol.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;
@Data
public class ParkingSpotDto {

    @NotBlank
    private String parkingSpotNumber;
    @NotBlank
    @Size(max = 7)
    private String carLicensePlate;
    @NotBlank
    private String carBrand;
    @NotBlank
    private String carModel;
    @NotBlank
    private String carColor;
    @NotBlank
    private String responsibleName;
    @NotBlank
    private String apartment;
    @NotBlank
    private String block;
}
