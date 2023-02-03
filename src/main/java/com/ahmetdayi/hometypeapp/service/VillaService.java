package com.ahmetdayi.hometypeapp.service;


import com.ahmetdayi.hometypeapp.entity.Villa;
import com.ahmetdayi.hometypeapp.entity.request.CreateVillaRequest;
import com.ahmetdayi.hometypeapp.repository.VillaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class VillaService {

    private final VillaRepository villaRepository;

    public Villa create(CreateVillaRequest request){
        Villa villa = new Villa
                (
                        request.getPrice(),
                        request.getHouseSize(),
                        request.getRoomCount(),
                        request.getLivingRoomCount()
                );
        return villaRepository.save(villa);
    }


    public Double averageVillaSize(){
        return villaRepository
                .findAll()
                .stream()
                .mapToDouble(Villa::getHouseSize)
                .average()
                .orElseThrow();
    }

    public Double sumOfVillaPrice(){
        return villaRepository.findAll().stream().mapToDouble(Villa::getPrice).sum();
    }

}
