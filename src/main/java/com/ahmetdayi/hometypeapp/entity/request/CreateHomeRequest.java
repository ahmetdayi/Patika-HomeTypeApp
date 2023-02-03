package com.ahmetdayi.hometypeapp.entity.request;

import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Data
public class CreateHomeRequest {

    @NotNull
    private double price;

    @Min(1)
    @NotNull
    private double houseSize;

    @NotNull
    private int roomCount;

    @NotNull
    private int livingRoomCount;


}
