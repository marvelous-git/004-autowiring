package zw.co.econet;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import zw.co.econet.model.Speaker;
import zw.co.econet.service.SpeakerService;
import zw.co.econet.service.SpeakerServiceImp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Configuration
//@ComponentScan("zw.co.econet")
@ComponentScan
public class Application {
    public static void main(String[] args) {
        //SpeakerService service = new SpeakerServiceImp();

        //ApplicationContext app = new AnnotationConfigApplicationContext(AppConfig.class); or
        ApplicationContext app = new AnnotationConfigApplicationContext(Application.class);
        SpeakerService service = app.getBean("service", SpeakerService.class);
        SpeakerService service2 = app.getBean("service", SpeakerService.class);
        
        System.out.println(service);
        System.out.println(service2);
        System.out.println(service.findAll().get(0).getFname());
    }
}
