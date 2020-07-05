package guru.springframework.sfgdi.controllers;

import org.springframework.stereotype.Controller;

import guru.springframework.sfgdi.services.GreetingService;

/**
 * @author Bruno S. Alessi <bruno_alessi@yahoo.com.br>
 * @since 2020-06-28
 */
@Controller
public class ConstructorInjectedController {

	private final GreetingService greetingService;

	//@Autowired - not required for constructors since Spring 4.2
	public ConstructorInjectedController(final GreetingService greetingService1) {
		this.greetingService = greetingService1;
	}

	public String greeting() {
		return this.greetingService.sayGreeting();
	}

}
