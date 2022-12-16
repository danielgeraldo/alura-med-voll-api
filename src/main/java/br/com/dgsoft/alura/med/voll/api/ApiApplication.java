package br.com.dgsoft.alura.med.voll.api;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.info.BuildProperties;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;

import java.util.Date;
import java.util.Properties;

@SpringBootApplication
public class ApiApplication {

	private static final org.slf4j.Logger log = LoggerFactory.getLogger(ApiApplication.class);


	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(ApiApplication.class);
		ConfigurableApplicationContext applicationContext = app.run(args);
		Environment env = applicationContext.getEnvironment();
		log.info("\n----------------------------------------------------------\n\t" +
						"Application '{}' is running!\n\t" +
						"Access URL: http://127.0.0.1:{}{}/swagger-ui.html" +
						"\n----------------------------------------------------------",
				env.getProperty("spring.application.name"),
				env.getProperty("server.port"),
				env.getProperty("server.servlet.context-path"));
	}

	@ConditionalOnMissingBean
	@Bean
	public BuildProperties buildProperties() {
		Properties properties = new Properties();
		properties.put("group", "br.com.dgsoft.alura");
		properties.put("name", "MedVollApi");
		properties.put("artifact", "med-vol-api");
		properties.put("version", "Execução Local");
		Long time = new Date().getTime();
		properties.put("time", time.toString());
		return new BuildProperties(properties);
	}

}
