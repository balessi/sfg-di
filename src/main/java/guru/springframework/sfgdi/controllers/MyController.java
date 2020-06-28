package guru.springframework.sfgdi.controllers;

import org.springframework.stereotype.Controller;

/**
 * @author Bruno S. Alessi <bruno_alessi@yahoo.com.br>
 * @since 2020-06-28
 */
@Controller
public class MyController {

	@SuppressWarnings("static-method")
	public String sayHello() {
		System.out.println("\nRunning MyController.sayHello() ...");
		return "Hello, world!";
	}
	
}
