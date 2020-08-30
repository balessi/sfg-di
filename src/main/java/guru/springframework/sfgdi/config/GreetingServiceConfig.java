package guru.springframework.sfgdi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import guru.springframework.sfgdi.services.GreetingService;
import guru.springframework.sfgdi.services.GreetingServiceFactory;

/**
 * @author Bruno S. Alessi <bruno_alessi@yahoo.com.br>
 * @since 2020-08-29
 */
@Configuration
@SuppressWarnings("static-method")
public class GreetingServiceConfig {

	@Bean
	public GreetingServiceFactory qreetingServiceFactory() {
		return new GreetingServiceFactory();
	}
	
	@Bean
	@Profile("default")	
	public GreetingService defaultGreetingService(GreetingServiceFactory greetingServiceFactory) {
		return englishGreetingService(greetingServiceFactory);
	}
	
	@Bean
	@Profile("en")	
	public GreetingService englishGreetingService(GreetingServiceFactory greetingServiceFactory) {
		return greetingServiceFactory.createGreetingService("en");
	}
	
	@Bean
	@Profile("et")	
	public GreetingService estonianGreetingService(GreetingServiceFactory greetingServiceFactory) {
		return greetingServiceFactory.createGreetingService("et");
	}
	
	@Bean
	@Profile("de")	
	public GreetingService germanGreetingService(GreetingServiceFactory greetingServiceFactory) {
		return greetingServiceFactory.createGreetingService("de");
	}
	
}
