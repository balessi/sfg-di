package guru.springframework.sfgdi.services;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @author Bruno S. Alessi <bruno_alessi@yahoo.com.br>
 * @since 2020-07-12
 */
@Component
public class LifeCycleDemoBean
		implements InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware, ApplicationContextAware {
	
	private static int seq;
	
	public LifeCycleDemoBean() {
		seq = 1;
		print("I'm in the LifeCycleDemoBean Bean Constructor");
	}

	@SuppressWarnings("static-method")
	@PostConstruct
	public void postConstruct() {
		print("The postConstruct() method has been called");
	}
	
	@SuppressWarnings("static-method")
	@PreDestroy
	public void preDestroy() {
		print("The preDestroy() method has been called");
	}
	
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		print("The ApplicationContext has been set");
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		print("The BeanFactory has been set");
	}

	@Override
	public void setBeanName(String name) {
		print(String.format("The Bean name, \"%s\" has been set", name));
	}

	@Override
	public void destroy() throws Exception {
		print("The LifeCycleDemoBean has been terminated");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		print("The LifeCycleDemoBean has its properties set");
	}
	
	@SuppressWarnings("static-method")
	public void beforeInit() {
		print("-- Before Init -- called by bean PostProcessor");
	}
	
	@SuppressWarnings("static-method")
	public void afterInit() {
		print("-- After Init -- called by bean PostProcessor");
	}
	
	private static void print(final String text) {
		System.out.printf("## [%d] %s\n", Integer.valueOf(seq), text);
		seq += 1;
	}
	
}
