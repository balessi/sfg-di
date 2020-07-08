package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @author Bruno S. Alessi <bruno_alessi@yahoo.com.br>
 * @since 2020-07-08
 */
@Profile("et_EE")
@Service("i18nService")
public class I18nEstonianGreetingService implements GreetingService {

	@Override
	public String sayGreeting() {
		return "Tere, Maailm!";
	}

}
