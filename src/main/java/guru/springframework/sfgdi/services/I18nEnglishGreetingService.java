package guru.springframework.sfgdi.services;

/**
 * @author Bruno S. Alessi <bruno_alessi@yahoo.com.br>
 * @since 2020-07-08
 */
//@Profile("en")
//@Service("i18nService")
public class I18nEnglishGreetingService implements GreetingService {
	
	@Override
	public String sayGreeting() {
		return "Hello, world!";
	}

}
