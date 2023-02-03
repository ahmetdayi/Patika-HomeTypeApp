package com.ahmetdayi.hometypeapp.entity;

import jakarta.persistence.Entity;

import lombok.NoArgsConstructor;


//Lombok

@NoArgsConstructor

//persistence
@Entity
public class Home extends BaseHome {

    public Home(double price, double houseSize, int roomCount, int livingRoomCount) {
        super(price, houseSize, roomCount, livingRoomCount);
    }
}
