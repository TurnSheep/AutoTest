import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @ClassName Application
 * @Description TODO
 * @Author zhongyang.he
 * @Date 2020/4/27 14:46
 **/
//@SpringBootApplication---主入口报错2时，使用ComponentScan和EnableAutoConfiguration
@ComponentScan("com.course")
@EnableAutoConfiguration
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
