import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.Test;

public class TestCompute {
  Compute c;

  @Test
  public void example() {
    MessageQueue mq = mock(MessageQueue.class);
    c = new Compute(mq);
    assertTrue(true);
  }

  @Test
  public void T1(){//Size test
    MessageQueue mq = mock(MessageQueue.class);
    when(mq.size()).thenReturn(0);
    c = new Compute(mq);
    int num=c.countNumberOfOccurrences(null);
    assertEquals(num, -1);
  }


  @Test
  public void T2(){// Testing the string does not contain
    MessageQueue mq = mock(MessageQueue.class);
    when(mq.size()).thenReturn(1);
    when(mq.contains("a")).thenReturn(false);
    c = new Compute(mq);
    assertEquals(0,c.countNumberOfOccurrences("a"));
  }
  @Test
  public void T3() {
    MessageQueue mq = mock(MessageQueue.class);
    when(mq.size()).thenReturn(4);
    when(mq.contains("r")).thenReturn(true);
    when(mq.getAt(0)).thenReturn("s");
    when(mq.getAt(1)).thenReturn("t");
    when(mq.getAt(2)).thenReturn("r");
    when(mq.getAt(3)).thenReturn("r");
    c = new Compute(mq);
    assertEquals(2,c.countNumberOfOccurrences("r"));
  }

  @Test
  public void T4() {
    MessageQueue mq = mock(MessageQueue.class);
    when(mq.size()).thenReturn(3);
    when(mq.contains("t")).thenReturn(true);
    when(mq.size()).thenReturn(3);
    when(mq.getAt(0)).thenReturn("s");
    when(mq.getAt(1)).thenReturn("t");
    when(mq.getAt(2)).thenReturn("r");
    c = new Compute(mq);
    assertEquals(1,c.countNumberOfOccurrences("t"));
  }
}
  