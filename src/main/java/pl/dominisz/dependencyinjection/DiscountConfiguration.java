package pl.dominisz.dependencyinjection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.dominisz.dependencyinjection.service.DiscountService;
import pl.dominisz.dependencyinjection.service.SummerDiscountService;
import pl.dominisz.dependencyinjection.service.WinterDiscountService;

@Configuration
public class DiscountConfiguration {

    @Bean
    DiscountService createDiscountService(){
        if(true){
            return new WinterDiscountService();
        }else{
            return new SummerDiscountService();
        }
    }
}
