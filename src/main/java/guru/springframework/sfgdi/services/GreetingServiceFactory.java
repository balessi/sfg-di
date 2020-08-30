package guru.springframework.sfgdi.services;

/**
 * @author Bruno S. Alessi <bruno_alessi@yahoo.com.br>
 * @since 2020-08-29
 */
public class GreetingServiceFactory {
	
	@SuppressWarnings("static-method")
	public GreetingService createGreetingService(final String lang) {
		switch(lang) {
			case "en" : return new I18nEnglishGreetingService();
			case "et" : return new I18nEstonianGreetingService();
			case "de" : return new I18nGermanGreetingService();
			default : return new I18nEnglishGreetingService();
		}
	}
	
}
