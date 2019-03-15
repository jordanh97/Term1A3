import junit.framework.TestCase;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainTest extends TestCase{

    private ClassA classAUnderTest;
    private ClassB classBUnderTest;
    private ClassC classCUnderTest;
    private ClassD classDUnderTest;

    public void setUp() {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        classAUnderTest = (ClassA) ctx.getBean("classA");
        classBUnderTest = (ClassB) ctx.getBean("classB");
        classCUnderTest = (ClassC) ctx.getBean("classC");
        classDUnderTest = (ClassD) ctx.getBean("classD");
    }


    @Test
    public void testBarkA() {
        boolean result = classAUnderTest.dogBark(51);
        assertTrue(result);
    }

    @Test
    public void testTennisChamp() {
        boolean result = classAUnderTest.tennisChampion(1);
        assertTrue(result);
    }

    @Test
    public void testBarkB() {
        boolean result1 = classBUnderTest.dogBark(49);
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

    @Test
    public void testConcrete() {
        boolean result = classDUnderTest.isConcreteString();
        assertTrue(result);
    }

    @Test
    public void testImportantOperation() {
        boolean result = classBUnderTest.importantOperation();
        assertTrue(result);
    }

    @Test
    public void testDinosaurs() {
        int result = classBUnderTest.dinosaursComeBackToLife(true);
        assertEquals(result, 1);
    }





}