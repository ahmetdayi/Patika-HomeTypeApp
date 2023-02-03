package com.ahmetdayi.hometypeapp.service;

import com.ahmetdayi.hometypeapp.entity.BaseHome;
import com.ahmetdayi.hometypeapp.repository.BaseHomeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BaseHomeService {

    private final BaseHomeRepository homeRepository;

    public Double averageAllHomeSize(){
        return homeRepository
                .findAll()
                .stream()
                .mapToDouble(BaseHome::getHouseSize)
                .average()
                .orElseThrow();
    }

    public Double sumOfAllHomePrice() {
        return homeRepository.findAll().stream().mapToDouble(BaseHome::getPrice).sum();
    }

    public List<BaseHome> filterByRoomCountAndLivingRoomCount(int roomCount,int livingRoomCount){
        return homeRepository.findByRoomCountAndLivingRoomCount(roomCount, livingRoomCount);
    }
}
