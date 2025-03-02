package com.example.demo.repository;

import com.example.demo.model.Showtime;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface ShowtimeRepository extends JpaRepository<Showtime, Long> {
    List<Showtime> findByMovieId(Long movieId);
    int countByShowtimeAfter(LocalDateTime now); // ✅ Count only upcoming showtimes
}
