// Example of using unit tests for programming assignment 1.  This is
// partially how your code will be graded.  Later in the class we will
// write our own unit tests.  To run them on the command line, make
// sure that the junit-4.11.jar is in the project directory.
// 
// $> javac -cp .:junit-4.11.jar *.java #compile everything
// $> java -cp .:junit-4.11.jar P1Tests #run tests
// 
// On windows replace : with ; (colon with semicolon)
// $> javac -cp .;junit-4.11.jar *.java #compile everything
// $> java -cp .;junit-4.11.jar P1Tests #run tests
import org.junit.*;
import static org.junit.Assert.*;
import java.util.*;
  
public class P1Tests {
  public static void main(String args[]){
    org.junit.runner.JUnitCore.main("P1Tests"); 
  }
  
  @Test
  public void test_task0(){
   assertEquals(  2520, Task0.lowest(  1,  10)); 
   assertEquals(    60, Task0.lowest(  3,   5));
   assertEquals( 10100, Task0.lowest(100, 101));
   assertEquals(232560, Task0.lowest( 15,  20));
  }
  
  @Test
  public void test_letterGrade(){
   assertEquals(   "A+", Task1.letterGrade(99));
   assertEquals(   "B-", Task1.letterGrade(81));
   assertEquals(    "D", Task1.letterGrade(60));
   assertEquals("ERROR", Task1.letterGrade(-5));
  }
  
  @Test
  public void test_multiples56(){
   assertEquals(     0, Task1.sum56Multiples(   3));
   assertEquals(    11, Task1.sum56Multiples(   7));
   assertEquals(    86, Task1.sum56Multiples(  20));
   assertEquals(  1686, Task1.sum56Multiples( 100));
   assertEquals(166836, Task1.sum56Multiples(1000));
  }
  
  @Test
  public void test_sumSquares(){
    assertEquals(1,       Task1.sumSquares(  0,  1));
    assertEquals(14,      Task1.sumSquares(  0,  3));
    assertEquals(385,     Task1.sumSquares(  0, 10));
    assertEquals(100,     Task1.sumSquares( 10, 10));
    assertEquals(221,     Task1.sumSquares( 10, 11));
    assertEquals(338350,  Task1.sumSquares(  0,100));
    assertEquals(2358350, Task1.sumSquares(100,200));
  }
  
  @Test
  public void test_gcd(){
   assertEquals(30, Task1.gcd( 150,  60));
   assertEquals(30, Task1.gcd(  60, 150));
   assertEquals( 6, Task1.gcd(  78,  18));
   assertEquals(78, Task1.gcd(2730, 858));
  }
  
  @Test
  public void test_sumOdds(){
    assertEquals( 0, Task1.sumOdds(new int[]{0,2,4,6,8}));
    assertEquals( 9, Task1.sumOdds(new int[]{1,2,3,4,5,6}));
    assertEquals(38, Task1.sumOdds(new int[]{1,1,2,3,3,3,4,5,5,5,5,6,7}));
    assertEquals( 0, Task1.sumOdds(new int[]{3,-3,4}));
    assertEquals( 4, Task1.sumOdds(new int[]{3,-3,1,3}));
  }
  
  @Test
  public void test_sumTwoLowest(){
    assertEquals(4, Task1.sumTwoLowest(new int[]{5,4,3,4,1,6}));
    assertEquals(3, Task1.sumTwoLowest(new int[]{5,4,3,2,1}));
    assertEquals(3, Task1.sumTwoLowest(new int[]{5,4,3,1,2}));
  }

}
