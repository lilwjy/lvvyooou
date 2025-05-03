package com.example.dongli.repository;
import com.example.dongli.model.TourismService;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface TourismServiceRepository extends JpaRepository<TourismService, Long> {
    List<TourismService> findByOwnerUsername(String username);
}