package com.ahmetdayi.hometypeapp.entity;

import jakarta.persistence.Entity;
import lombok.NoArgsConstructor;


//Lombok


@NoArgsConstructor
//persistence
@Entity
public class Villa extends BaseHome {

    public Villa(double price, double houseSize, int roomCount, int livingRoomCount) {
        super(price, houseSize, roomCount, livingRoomCount);
    }
}
