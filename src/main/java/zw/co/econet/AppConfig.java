package zw.co.econet;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import zw.co.econet.model.Speaker;
import zw.co.econet.repository.SpeakerRepository;
import zw.co.econet.repository.SpeakerRepositoryImp;
import zw.co.econet.service.SpeakerService;
import zw.co.econet.service.SpeakerServiceImp;

@Configuration
//@ComponentScan("zw.co.econet")
@ComponentScan
public class AppConfig {

}
