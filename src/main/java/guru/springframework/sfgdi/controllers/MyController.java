package guru.springframework.sfgdi.controllers;

import org.springframework.stereotype.Controller;

import guru.springframework.sfgdi.services.LifeCycleDemoBean;

/**
 * @author Bruno S. Alessi <bruno_alessi@yahoo.com.br>
 * @since 2020-06-28
 */
@Controller
public class MyController {

	@SuppressWarnings("unused")
	private final LifeCycleDemoBean lcdBean;
	
	public MyController(LifeCycleDemoBean bean) {
		super();
		this.lcdBean = bean;
	}

	@SuppressWarnings("static-method")
	public String sayHello() {
		System.out.println("\nRunning MyController.sayHello() ...");
		return "Hello, world!";
	}
	
}
