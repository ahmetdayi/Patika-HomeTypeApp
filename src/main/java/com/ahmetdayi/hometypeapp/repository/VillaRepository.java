package com.ahmetdayi.hometypeapp.repository;

import com.ahmetdayi.hometypeapp.entity.Villa;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface VillaRepository extends JpaRepository<Villa, UUID> {
}
