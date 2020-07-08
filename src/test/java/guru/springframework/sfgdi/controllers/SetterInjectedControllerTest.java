package guru.springframework.sfgdi.controllers;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import guru.springframework.sfgdi.services.DefaultGreetingService;

/**
 * @author Bruno S. Alessi <bruno_alessi@yahoo.com.br>
 * @since 2020-07-01
 */
@ExtendWith(SpringExtension.class)
@SpringBootTest
public class SetterInjectedControllerTest {

	SetterInjectedController controller;
	
	@BeforeEach
	void setUp() {
		this.controller = new SetterInjectedController();
		this.controller.setGreetingService(new DefaultGreetingService());
	}
	
	@Test
	void getGreeting() {
		assertNotNull(this.controller.greeting());
		System.out.println("ok");
	}
	
}
