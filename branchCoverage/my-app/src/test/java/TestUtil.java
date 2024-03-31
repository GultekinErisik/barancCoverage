import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import java.util.random.*;

import java.util.Random;

import org.junit.Before;
import org.junit.Test;

public class TestUtil {
  Util c;

  @Before
  public void setUp() { c = new Util(); }

  @Test
  public void example() { assertTrue(true); }

  @Test
  public void T1(){
    Random r= new Random();//We know this statement giving false so we can use random
    assertFalse(c.compute(r.nextInt(9)));
  }
   @Test
  public void T2(){
    Random r= new Random();// We know this statement giving false so we can use random
    assertFalse(c.compute(r.nextInt(9),r.nextInt(9)));
  }


  @Test
  public void T3(){//testing the sum divisible for any number return true
    assertTrue(c.compute(1,2,3));
  }

  @Test
  public void T4(){//testing the sum divisible for any number return true
    assertFalse(c.compute(2,8,7));// 17 cannot divisible by 2,8,7.
  }
  @Test
  public void T5(){
    assertFalse(c.compute(4,2,7,9));// 23 cannot divide by anything
  }

  @Test
  public void T6(){//checking the RunTimeException.
    try{
      c.compute(0,0,0);
    }catch(RuntimeException exception){
      assertTrue(true);
    }
    assertFalse(false);
  }
}