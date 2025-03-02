package com.example.demo.repository;

import com.example.demo.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long> {
    List<Booking> findByShowtimeId(Long showtimeId); // ✅ Fetch bookings by showtime
    List<Booking> findByUserId(Long userId);

}
