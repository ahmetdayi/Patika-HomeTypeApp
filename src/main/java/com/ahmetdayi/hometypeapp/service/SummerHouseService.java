package com.ahmetdayi.hometypeapp.service;


import com.ahmetdayi.hometypeapp.entity.SummerHouse;
import com.ahmetdayi.hometypeapp.entity.request.CreateSummerHouseRequest;
import com.ahmetdayi.hometypeapp.repository.SummerHouseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class SummerHouseService {
    private final SummerHouseRepository summerHouseRepository;


    public SummerHouse create(CreateSummerHouseRequest request){
        SummerHouse summerHouse = new SummerHouse
                (
                        request.getPrice(),
                        request.getHouseSize(),
                        request.getRoomCount(),
                        request.getLivingRoomCount()
                );
        return summerHouseRepository.save(summerHouse);
    }


    public Double averageSummerHouseSize(){
        return summerHouseRepository
                .findAll()
                .stream()
                .mapToDouble(SummerHouse::getHouseSize)
                .average()
                .orElseThrow();
    }

    public Double sumOfSummerHousePrice(){
        return summerHouseRepository.findAll().stream().mapToDouble(SummerHouse::getPrice).sum();
    }

}
