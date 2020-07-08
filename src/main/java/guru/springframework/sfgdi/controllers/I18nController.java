package guru.springframework.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import guru.springframework.sfgdi.services.GreetingService;

/**
 * @author Bruno S. Alessi <bruno_alessi@yahoo.com.br>
 * @since 2020-07-08
 */
@Controller
public class I18nController {
	
	private final GreetingService greetSvc;

	public I18nController(@Qualifier("i18nService") final GreetingService svc) {
		super();
		this.greetSvc = svc;
	}
	
	public String sayHello() {
		return this.greetSvc.sayGreeting();
	}
	
}
