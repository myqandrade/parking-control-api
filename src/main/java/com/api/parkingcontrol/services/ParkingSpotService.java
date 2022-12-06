package com.api.parkingcontrol.services;

import com.api.parkingcontrol.models.ParkingSpotModel;
import com.api.parkingcontrol.repositories.ParkingSpotRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParkingSpotService {
    @Autowired
    static ParkingSpotRepository parkingSpotRepository;

    public static boolean existsByCarLicensePlate(String carLicensePlate) {
        return parkingSpotRepository.existsByCarLicensePlate(carLicensePlate);
    }

    public static boolean existByParkingSpotNumber(String parkingSpotNumber) {
        return parkingSpotRepository.existByParkingSpotNumber(parkingSpotNumber);
    }

    public static boolean existByApartmentAndBlock(String apartment, String block) {
        return parkingSpotRepository.existByApartmentAndBlock(apartment, block);
    }

    @Transactional
    public ParkingSpotModel save(ParkingSpotModel parkingSpotModel){
       return parkingSpotRepository.save(parkingSpotModel);
    }

    public List<ParkingSpotModel> findAll(){
        return parkingSpotRepository.findAll();
    }
}
