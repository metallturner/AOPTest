package aop;

import org.springframework.stereotype.Component;

@Component("UniLibrary")
public class UniLibrary extends AbstractLibrary {
    @Override
    public void getBook(){
        System.out.println("Получили книгу из UniLibrary");
    }
}
