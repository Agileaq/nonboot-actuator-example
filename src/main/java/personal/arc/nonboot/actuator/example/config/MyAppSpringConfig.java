package personal.arc.nonboot.actuator.example.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@EnableAutoConfiguration
@Configuration
@Import({WebConfig.class})
public class MyAppSpringConfig {

}
