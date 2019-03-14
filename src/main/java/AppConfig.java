import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name="classA")
    public ClassA classA(){
        return new ClassA();
    }

    @Bean(name="classB")
    public ClassB classB(){
        return new ClassB();
    }

    @Bean(name="classC")
    public ClassC classC(){
        return new ClassC();
    }



}