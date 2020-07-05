package guru.springframework.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import guru.springframework.sfgdi.services.GreetingService;

/**
 * @author Bruno S. Alessi <bruno_alessi@yahoo.com.br>
 * @since 2020-06-28
 */
@Controller
public class PropertyInjectedController {

	@Autowired
	public GreetingService greetingService;
	
	public String greeting() {
		
		return this.greetingService.sayGreeting();
	}
	
}
