package com.ahmetdayi.hometypeapp.repository;

import com.ahmetdayi.hometypeapp.entity.Home;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface HomeRepository extends JpaRepository<Home,Integer> {

    List<Home> findByRoomCountAndLivingRoomCount(int roomCount,int LivingRoom);
}
