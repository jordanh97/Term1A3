import junit.framework.TestCase;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainTest extends TestCase{

    private ClassA classAUnderTest;
    private ClassB classBUnderTest;
    private ClassC classCUnderTest;

    public void setUp() {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        classAUnderTest = (ClassA) ctx.getBean("classA");
        classBUnderTest = (ClassB) ctx.getBean("classB");
        classCUnderTest = (ClassC) ctx.getBean("classC");
    }


    @Test
    public void testBarkA() {
        boolean result = classAUnderTest.bark(51);
        assertTrue(result);
    }

    @Test
    public void testBarkB() {
        boolean result1 = classBUnderTest.bark(49);
        assertTrue(result1);
    }

    @Test
    public void testBarkCBD() {
        boolean result2 = classCUnderTest.bigDogBark(49);
        assertTrue(result2);
    }

    @Test
    public void testBarkClassCSD() {
        boolean result3 = classCUnderTest.smallDogBark(51);
        assertTrue(result3);
    }




}