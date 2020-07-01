package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;

/**
 * @author Bruno S. Alessi <bruno_alessi@yahoo.com.br>
 * @since 2020-06-28
 */
public class ConstructorInjectedController {

	private final GreetingService greetingService;

	public ConstructorInjectedController(final GreetingService greetingService) {
		this.greetingService = greetingService;
	}

	public String greeting() {
		return this.greetingService.sayGreeting();
	}

}
