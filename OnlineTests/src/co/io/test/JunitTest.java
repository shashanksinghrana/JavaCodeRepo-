package co.io.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JunitTest {
  private int value =0;
  
  @Before
  public void zero() throws Exception{
	  value++;
  }
  @After
  public void nth() throws Exception{
	  value--;
  }
  @Test
    public void one(){
	  System.out.println(value);
	  value+=2;
	  
  }
  @Test
  public void two(){
	  System.out.println(value);
	  value+=3;
	  
}
  @Test
  public void three(){
	  System.out.println(value);
	  value+=4;
	  
}
 
}
