package com.ahmetdayi.hometypeapp.repository;


import com.ahmetdayi.hometypeapp.entity.SummerHouse;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.UUID;

public interface SummerHouseRepository extends JpaRepository<SummerHouse, UUID> {

}
