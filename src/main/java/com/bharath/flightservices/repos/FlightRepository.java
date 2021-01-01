package com.bharath.flightservices.repos;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.bharath.flightservices.entities.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.bharath.flightservices.entities.Flight;

public interface FlightRepository extends JpaRepository<Flight, Integer> {
	
	@Query("from Flight where departureCity=:departureCity and arrivalCity=:arrivalCity and dateOfDeparture=:dateOfDeparture")
	Optional<List<Flight>> findFlighcdfts(@Param("departureCity") String from,@Param("arrivalCity") String to, @Param("dateOfDeparture") Date departureDate);

	@Query(value = "select * from FLIGHT where id=:id",nativeQuery = true)
	Optional<Flight> findFightByid(@Param("id") int id);

	@Query(value = "select * from FLIGHT where id=:id",nativeQuery = true)
	Optional<Object> findByCustomId(@Param("id") int id);

	@Query(value = "select * from  FLIGHT where DEPARTURE_CITY=:dc and ARRIVAL_CITY=:ac",nativeQuery = true)
	Optional<List<Flight>> findFlights(@Param("dc") String departureCity,@Param("ac") String arrivalCity);

	@Query(value = "select * from  FLIGHT where DEPARTURE_CITY=:dc and ARRIVAL_CITY=:ac and DATE_OF_DEPARTURE=:dod",nativeQuery = true)
	Optional<List<Flight>> findFlights(@Param("dc") String departureCity,@Param("ac") String arrivalCity, @Param("dod") Date departureDate);

	@Query(value = "select * from FLIGHT",nativeQuery = true)
	Optional<List<Flight>> findAllFlights();

	@Query( value ="SELECT * FROM FLIGHT where ID IN (SELECT flight_id FROM reservation WHERE id=:id);", nativeQuery = true)
	Optional<Flight> findFlightByReservationId(@Param("id") int id);
}
