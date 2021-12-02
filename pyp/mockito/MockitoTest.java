import org.junit.Before;
import org.junit.Test;
import org.omg.CORBA.Environment;

import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.List;
import java.util.LinkedList;
import java.util.List;

import static jdk.internal.org.objectweb.asm.util.CheckClassAdapter.verify;
import static org.mockito.Mockito.*;
public class MockitoTest {
    //  标准创建mock方式 - 使用@Mock注解
    @Mock Environmental env;
    @InjectMocks Checker checker;
    @Before
    public void setup(){
        MockitoAnnotations.initMocks(this);
    }
@Test
        public void testMockito(){
        //mock creation
        List mockedList = mock(List.class);
        //using mock object
        mockedList.add("one");
        mockedList.clear();
        //verification
        verify(mockedList).add("one");
        verify(mockedList).clear();
        //You can mock concrete classes, not just interfaces
        LinkedList mockedList = mock(LinkedList.class);
        //stubbing
        when(mockedList.get(0)).thenReturn("first");
        when(mockedList.get(1)).thenThrow(new RuntimeException());
//following prints "first"
        System.out.println(mockedList.get(0));
//following throws runtime exception
        System.out.println(mockedList.get(1));
//following prints "null" because get(999) was not stubbed
        System.out.println(mockedList.get(999));
        //Although it is possible to verify a stubbed invocation, usually it's just redundant
//If your code cares what get(0) returns, then something else breaks (often even before verify() gets executed).
//If your code doesn't care what get(0) returns, then it should not be stubbed. Not convinced? See here.
        verify(mockedList).get(0);

    }

    private Object when(Object o) {
    }

    private Collection<String> verify(List mockedList) {
    }

}
