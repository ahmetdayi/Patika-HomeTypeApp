package com.ahmetdayi.hometypeapp.repository;

import com.ahmetdayi.hometypeapp.entity.BaseHome;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface BaseHomeRepository extends JpaRepository<BaseHome, UUID> {

    List<BaseHome> findByRoomCountAndLivingRoomCount(int roomCount, int LivingRoom);
}
