package br.com.dgsoft.alura.med.voll.api.config;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.info.BuildProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

@Configuration
public class DocConfig {

    private final String API_GIT_URI = "https://github.com/danielgeraldo/alura-med-voll-api.git";
    private final String API_DESCRIPTION = "Api de Estudos na Alura com complementos";
    @Autowired
    private BuildProperties buildProperties;


    @Value("${server.servlet.context-path}")
    private String contextPath;

    @Bean
    public OpenAPI OpenAPIConfig() {
        return new OpenAPI()
                .info(apiInfo())
                .servers(Arrays.asList(new Server().url(contextPath)))        ;
    }

    public Info apiInfo() {

        License licence = new License()
                .name("Repositório GIT - Tribanco: "+API_GIT_URI)
                .url(API_GIT_URI);
        String version = buildProperties.getVersion();
        Info info = new Info().title(buildProperties.getName())
                .description(getApiDescription())
                .version(version)
                .license(licence);
        return info;
    }

    private String getApiDescription(){
        String quebraLinha = "<br>";
        StringBuilder sb = new StringBuilder();
        Date dt = new Date(buildProperties.getTime().toEpochMilli());
        String dataCompilacao = new SimpleDateFormat("dd/MM/yyyy HH:mm").format(dt);
        sb.append(API_DESCRIPTION).append(quebraLinha);
        sb.append("<b><i>Compilado em: </b></i>"+dataCompilacao);
        return sb.toString();
    }
}