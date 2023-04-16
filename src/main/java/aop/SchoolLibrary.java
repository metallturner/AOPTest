package aop;

import org.springframework.stereotype.Component;

@Component("SchoolLibrary")
public class SchoolLibrary extends AbstractLibrary {
    @Override
   public void getBook() {
        System.out.println("Получили книгу из SchoolLibrary");
    }
}
