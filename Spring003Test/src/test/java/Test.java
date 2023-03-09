import com.ioc.controller.UserController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    @org.junit.jupiter.api.Test
    public void test001(){
        ApplicationContext app = new ClassPathXmlApplicationContext("spring-config.xml");
        UserController uc= (UserController) app.getBean("uc");
        System.out.println(uc.ff(6,2));
    }
}
