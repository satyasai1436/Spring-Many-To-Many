package in.satya;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.satya.Service.serviceClass;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		serviceClass bean = context.getBean(serviceClass.class);
		//bean.setData();
		bean.getPerson(1);
	}

}
