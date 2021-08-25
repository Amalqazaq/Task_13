package jo.secondstep.Testaverage;
import java.util.Map.Entry;
import java.util.HashMap;

public class Grades {

	public static double calculateAverage (HashMap<String,Integer> map) {  
		  double sum=0.0;
		  double average=0.0;
	      for(Entry<String, Integer> entry: map.entrySet()){
	          sum+= entry.getValue();
	      }
	      
	      
	        average = sum/map.size();
	        return average;   
     }
	
		
}
