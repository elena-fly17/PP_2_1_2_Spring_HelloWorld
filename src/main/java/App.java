import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld bean1 = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean1.getMessage());

        HelloWorld bean2 = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean2.getMessage());

        Cat cat1 = (Cat) applicationContext.getBean("cat");
        System.out.println(cat1.getName());

        Cat cat2 = (Cat) applicationContext.getBean("cat");
        System.out.println(cat2.getName());

        System.out.println("bean1 и bean2 - один и тот же объект? " + (bean1 == bean2));
        System.out.println("cat1 и cat2 - один и тот же объект? " + (cat1 == cat2));
        applicationContext.close();
    }
}