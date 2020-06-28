package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;

/**
 * @author Bruno S. Alessi <bruno_alessi@yahoo.com.br>
 * @since 2020-06-28
 */
public class PropertyInjectedController {

	public GreetingService greetingService;
	
	public String greeting() {
		
		return this.greetingService.sayGreeting();
	}
	
}
