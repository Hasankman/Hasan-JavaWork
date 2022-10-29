package Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;  
  
import java.util.List;  
import org.junit.Test;  
import org.mockito.Mock;  
  
public class MockMain {  
  
    @Test  
    public void testList_ReturnsSingle_value() {  
  
        List mocklist = mock(List.class);  
                           when(mocklist.size()).thenReturn(1);  
  
        assertEquals(1, mocklist.size());  
        assertEquals(1, mocklist.size());  
          
                          System.out.println( mocklist.size());  
        System.out.println(mocklist);  
    }  
 }  

//<dependency>  
//<groupId>org.mockito</groupId>  
//<artifactId>mockito-all</artifactId>  
//<version>2.0.1-beta</version>  
//<scope>test</scope>  
//</dependency>   