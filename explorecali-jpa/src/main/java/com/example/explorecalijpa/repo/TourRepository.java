package com.example.explorecalijpa.repo;

import org.springframework.data.jpa.rep.JpaRepository;
import com.example.explorecalijpa.model.Tour;

public interface TourRepository extends JpaRepository<Tour, Integer> {

}
