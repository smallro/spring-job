import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Intellij IDEA
 * User: wr
 * Date: 2018/6/14
 */
public class JobTest {

    public static void main(String[] args) {
        new ClassPathXmlApplicationContext(new String[] {"classpath*:META-INF/spring/spring-quartz.xml"});
    }
}
