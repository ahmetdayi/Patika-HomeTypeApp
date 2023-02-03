package com.ahmetdayi.hometypeapp.entity.request;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateVillaRequest {

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
