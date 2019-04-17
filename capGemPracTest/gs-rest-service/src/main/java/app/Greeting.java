package app;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Greeting {

  private final String data;
  
    public Greeting(int[] nums) {
    	List<Integer> result = new ArrayList<Integer>();
    	for (int i : nums)
    	{
    	    result.add(i);
    	}
    	  
        this.data = result.stream()
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .map(i -> i * i)
                .reduce((a, b) -> a + b).map(sum -> Math.sqrt(sum)).toString();
    }

    public String getData()
    {
    	return data;
    }
}