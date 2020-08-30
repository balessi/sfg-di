package guru.springframework.sfgdi.services;

/**
 * @author Bruno S. Alessi <bruno_alessi@yahoo.com.br>
 * @since 2020-07-08
 */
//@Profile("et")
//@Service("i18nService")
public class I18nEstonianGreetingService implements GreetingService {

	@Override
	public String sayGreeting() {
		return "Tere, Maailm!";
	}

}
