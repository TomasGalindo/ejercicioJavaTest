import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class OddOrPosTest
{
   // this test fails!
   @Test public void negativeOddNumbers() 
   {
      int arr[] = {-3, -2, 0, 1, 4};
      assertEquals("Negative odd numbers in array", 3, OddOrPos.oddOrPos(arr));
   }
   @Test public void AllPositive() 
   {
      int arr[] = {6, 5, 0, 1, 4};
      assertEquals("positive odd numbers in array", 4, OddOrPos.oddOrPos(arr));
   }
}
