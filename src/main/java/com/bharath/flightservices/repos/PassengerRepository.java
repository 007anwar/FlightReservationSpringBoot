package com.bharath.flightservices.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bharath.flightservices.entities.Passenger;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface PassengerRepository extends JpaRepository<Passenger, Integer> {

    @Query( value ="SELECT * FROM passenger where id in(SELECT passenger_id FROM reservation WHERE id=:id)", nativeQuery = true)
    Optional<Passenger> findPassengerByReservationId(@Param("id") int id);
    @Query( value ="SELECT * FROM passenger WHERE email=:email", nativeQuery = true)
    Optional<Passenger> findByCustomEmail(String email);
}
