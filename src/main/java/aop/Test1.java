package aop;

import aop.config.SpringConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfig.class);
       UniLibrary uniLibrary = context.getBean("UniLibrary", UniLibrary.class);
        uniLibrary.getBook();

        SchoolLibrary schoolLibrary = context.getBean("SchoolLibrary", SchoolLibrary.class);
        schoolLibrary.getBook();
       context.close();
    }

}
