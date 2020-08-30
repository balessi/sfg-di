package guru.springframework.sfgdi.services;

/**
 * @author Bruno S. Alessi <bruno_alessi@yahoo.com.br>
 * @since 2020-06-28
 */
//@Profile({"default"})
//@Service("i18nService")
public class DefaultGreetingService implements GreetingService {

	@Override
	public String sayGreeting() {
		return "Hello World";
	}

}
