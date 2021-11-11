package practise;

import org.testng.annotations.Test;

public class Sample {
   @Test
   public void dep()
   {
	   int x=10;
	   int y=78;
	   System.out.println("x="+x);
	   System.out.println("y="+y);
	   x=x+y;
	   y=x-y;
	   x=x-y;
	   System.out.println("x="+x);
	   System.out.println("y="+y);
   }
}
