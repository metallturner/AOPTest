package aop.aspects;


import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
/*
создаем класс аспект, в нем прописываем методы которые будут вызываться до/после выполнения методов бизнес логики.
Так как паттерн pointcut подходит под оба метода getBook() из классов UniLibrary и SchoolLibrary,
то Advice вызовется перед каждым вызовом метода getBook(). Чтобы этого не было, в  @Before казываем имя класса перед методом.
Также если нам нужно чтобы перед всеми методами которые начинаются с get..() вызывался advice, то в @Before указываем
имя класса.get*();
Также вместо void можно поставить * getBook() и будут вызваны все методы getBook() независимо от их типа возвращаемого
значания. Также и с модификатором доступа. Также и с названием метода(*() )
Если метод с параметром, то указываем только его тип, без имени getBook(String), getBook(Object). Если нужен любой параметр
то ставим *, getBook(*)
Если нужно много параметров и пофигу каких, то ставим .., getBook(..)
Если нужно в параметры поставить свой класс, то ставим полное имя класса(пакет.класс)



 */
@Component
@Aspect
public class LoggingAspect {
    /*
    в данном случае метод работает как логер, и перед вызовом основного метода будт вызван данный метод
     */
    @Before("execution(public void aop.SchoolLibrary.getBook())") // pointcut
    public void beforeGetBookFromSchoolAdvice() {
        System.out.println("beforeGetBookAdvice: Была попытка получить книгу из SchoolLibrary");
    }

    @Before("execution(public void aop.UniLibrary.getBook())") // pointcut
    public void beforeGetBookFromUniAdvice() {
        System.out.println("beforeGetBookAdvice: Была попытка получить книгу из UniLibrary");
    }
}
