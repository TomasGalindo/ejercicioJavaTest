import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class CountPositiveTest
{
   // this test fails!
   @Test public void arrayContainsZeroes() 
   {
      int arr[] = {-4, 2, 0, 2};
      assertEquals("Array contains zeroes", 2, CountPositive.countPositive(arr));
   }
   @Test public void noPositivesNoZeros() 
   {
      int arr[] = {-4, -2, -8, -2};
      assertEquals("Array contains zeroes", 0, CountPositive.countPositive(arr));
   }
   @Test public void AllZeros() 
   {
      int arr[] = {0, 0, 0, 0};
      assertEquals("Array contains zeroes", 0, CountPositive.countPositive(arr));
   }
}
