package com.ahmetdayi.hometypeapp.service;

import com.ahmetdayi.hometypeapp.entity.Home;

import com.ahmetdayi.hometypeapp.entity.request.CreateHomeRequest;
import com.ahmetdayi.hometypeapp.repository.HomeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;



@Service
@RequiredArgsConstructor
public class HomeService {

    private final HomeRepository homeRepository;

    public Home create(CreateHomeRequest request){
        Home home = new Home
                (
                        request.getPrice(),
                        request.getHouseSize(),
                        request.getRoomCount(),
                        request.getLivingRoomCount()
                );
        return homeRepository.save(home);
    }


    public Double averageHomeSize(){
        return homeRepository
                .findAll()
                .stream()
                .mapToDouble(Home::getHouseSize)
                .average()
                .orElseThrow();
    }

    public Double sumOfHomePrice() {
        return homeRepository.findAll().stream().mapToDouble(Home::getPrice).sum();
    }



}
