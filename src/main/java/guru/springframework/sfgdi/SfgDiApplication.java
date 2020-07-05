package guru.springframework.sfgdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.GenericApplicationContext;

import guru.springframework.sfgdi.controllers.ConstructorInjectedController;
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
			MyController cntr = (MyController) ctx.getBean("myController");
			System.out.printf("MyController.sayHello() returned: %s\n", cntr.sayHello());
			
			System.out.println("\n-----------Property ");
			PropertyInjectedController prop = (PropertyInjectedController)ctx.getBean("propertyInjectedController");
			System.out.println(prop.greeting());
			
			System.out.println("\n-----------Setter ");
			SetterInjectedController sett = (SetterInjectedController)ctx.getBean("setterInjectedController");
			System.out.println(sett.greeting());
			
			System.out.println("\n-----------Constructor ");
			ConstructorInjectedController cons =  (ConstructorInjectedController)ctx.getBean("constructorInjectedController");
			System.out.println(cons.greeting());
		}
	}

}
