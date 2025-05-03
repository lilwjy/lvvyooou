package com.example.dongli.repository;

import com.example.dongli.model.Attraction;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface AttractionRepository extends JpaRepository<Attraction, Long> {
    List<Attraction> findTop4ByOrderByIdDesc();
}