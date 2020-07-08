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
 * @since 2020-06-28
 */
@ExtendWith(SpringExtension.class)
@SpringBootTest
public class PropertyInjectedControllerTest {

	PropertyInjectedController controller;
	
	@BeforeEach
	void setUp() {
		this.controller = new PropertyInjectedController();
		this.controller.greetingService = new DefaultGreetingService();
	}
	
	@Test
	void getGreeting() {
		assertNotNull(this.controller.greeting());
		System.out.println("ok");
	}
	
}
