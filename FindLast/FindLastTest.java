import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class FindLastTest
{
   // this test fails!
   @Test public void lastOccurrenceInFirstElement() 
   {
      int arr[] = {2, 3, 5};
      int y = 2;
      assertEquals("Last occurence in first element", 0, FindLast.findLast(arr, y));
   }
     // this test passes
   @Test public void lastInOtherPossition() 
   {
      int arr[] = {2, 3, 5};
      int y = 5;
      assertEquals("Last ocurrence", 2, FindLast.findLast(arr, y));
   }
    // this tests passes
   @Test public void lastEqualElement() 
   {
      int arr[] = {2, 2, 2};
      int y = 2;
      assertEquals("Last ocurrence", 2, FindLast.findLast(arr, y));
   }
}
