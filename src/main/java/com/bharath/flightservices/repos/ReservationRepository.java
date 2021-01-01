package com.bharath.flightservices.repos;

import com.bharath.flightservices.entities.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

import com.bharath.flightservices.entities.Reservation;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.Optional;

public interface ReservationRepository extends JpaRepository<Reservation, Integer> {

    @Query(value = "select * from reservation where id=:id",nativeQuery = true)
    Optional<Object> frdbi(@Param("id") int id);

    @Transactional
    @Modifying
    @Query(value = "update reservation set confirm=true where id=:id",nativeQuery = true)
    int confirmReservation(@Param("id") int id);




}
