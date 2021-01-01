package com.bharath.flightservices;

import com.bharath.flightservices.dto.CreateReservationRequest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FlightservicesApplicationTests {

	@Test
	public void contextLoads() {
	}
@Test
public void print()
{
	CreateReservationRequest createReservationRequest = new CreateReservationRequest();
	createReservationRequest.setFlightId(1);
	System.out.println(createReservationRequest);
}
}
