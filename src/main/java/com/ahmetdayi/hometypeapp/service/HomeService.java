package com.ahmetdayi.hometypeapp.service;

import com.ahmetdayi.hometypeapp.entity.Home;
import com.ahmetdayi.hometypeapp.entity.request.CreateHomeRequest;
import com.ahmetdayi.hometypeapp.repository.HomeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class HomeService {

    private final HomeRepository homeRepository;

    public Home create(CreateHomeRequest request){
        return new Home
                (
                        request.getPrice(),
                        request.getHouseSize(),
                        request.getRoomCount(),
                        request.getLivingRoomCount()
                );
    }


    public Double averageHomeSize(){
        double sum = 0;
        List<Double> homeSizeList = homeRepository.findAll().stream().map(Home::getHouseSize).toList();
        for (Double homeSize :
                homeSizeList) {
            sum += homeSize;
        }
        return (sum/homeSizeList.size());
    }

    public Double SumOfHomePrice(){
        double sum = 0;
        List<Double> priceList = homeRepository.findAll().stream().map(Home::getPrice).toList();
        for (double price :
                priceList) {
            sum += price;
        }
        return sum;
    }

    public List<Home> filterByRoomAndLivingRoom(int room, int livingRoom){
        return homeRepository.findByRoomCountAndLivingRoomCount(room, livingRoom);
    }

}
