import kr.co.teaspoon.dto.Sample;
import org.junit.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LombokTest {
    private static final Logger log = LoggerFactory.getLogger("LombokTest.class");
    // Lombok 단위 테스트

    @BeforeClass
    public static void testStart(){
        System.out.println("전체 테스트 시작 ");
    }
    @Before
    public void testBeforePrint(){
        System.out.println("Junit 테스트 시작");
    }
    @Test
    public void testLombok(){
        Sample dto = new Sample();
        dto.setNo(1);
        dto.setName("사이다");
        System.out.println(dto.toString());
        //log.info(dto.toString());
    }
    @Test
    public void testLombok2(){
        Sample dto = new Sample();
        dto.setNo(2);
        dto.setName("콜라");
        System.out.println(dto.toString());
        //log.info(dto.toString());
    }

    @After
    public void testAfterPrint(){
        System.out.println("Junit 테스트 종료 ");
    }
    @AfterClass
    public static void testEnd(){
        System.out.println("전체 테스트 종료 ");
    }
}
