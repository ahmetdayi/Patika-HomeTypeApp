package com.ahmetdayi.hometypeapp.repository;

import com.ahmetdayi.hometypeapp.entity.Home;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.UUID;

public interface HomeRepository extends JpaRepository<Home, UUID> {


}
