package guru.springframework.sfgdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.GenericApplicationContext;

import guru.springframework.sfgdi.controllers.ConstructorInjectedController;
import guru.springframework.sfgdi.controllers.I18nController;
import guru.springframework.sfgdi.controllers.MyController;
import guru.springframework.sfgdi.controllers.PropertyInjectedController;
import guru.springframework.sfgdi.controllers.SetterInjectedController;

/**
 * @author Bruno S. Alessi <bruno_alessi@yahoo.com.br>
 * @since 2020-06-28
 */
@SpringBootApplication
public class SfgDiApplication {
	
	public static void main(String[] args) {
		try (GenericApplicationContext ctx = 
				(GenericApplicationContext) SpringApplication.run(SfgDiApplication.class, args)) {

			// Getting a controller bean ref from the context, calling a service
			// and printing the lifecycle of a bean (LifeCycleDemoBean)
			MyController cntr = (MyController) ctx.getBean("myController");
			System.out.printf("\nMyController.sayHello() returned: %s", cntr.sayHello());
			
			// Bean profile demo illustrated through i18n
			I18nController i18nController = (I18nController) ctx.getBean("i18nController");
			System.out.printf("\nI18nController.sayHello() returned: %s", i18nController.sayHello());
			
			// Demonstrating types of injection
			diRoutines(ctx);
		}
	}

	// Dependency Injection types
	private static void diRoutines(final GenericApplicationContext ctx) {
		// 1 - Injection by property - AVOID THIS ONE
		System.out.println("\n\n-----------Property ");
		PropertyInjectedController prop = (PropertyInjectedController)ctx.getBean("propertyInjectedController");
		System.out.println(prop.greeting());
		
		// 2 - Injection by Setter - OK, but the next one is better
		System.out.println("\n-----------Setter ");
		SetterInjectedController sett = (SetterInjectedController)ctx.getBean("setterInjectedController");
		System.out.println(sett.greeting());
		
		// 3 - Injection by Constructor - Use this, it is the best option
		System.out.println("\n-----------Constructor ");
		ConstructorInjectedController cons =  (ConstructorInjectedController)ctx.getBean("constructorInjectedController");
		System.out.println(cons.greeting());
	}

}
