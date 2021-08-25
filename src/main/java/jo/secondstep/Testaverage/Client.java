package jo.secondstep.Testaverage;

import java.util.HashMap;
import java.util.Map.Entry;

public class Client {
	public static void main(String[] args) {
		 double avarage=0.0;
	     Grades gradesList=new Grades();
	     HashMap<String, Integer> grades = new HashMap<>();
	     grades.put("calculus",88);
         grades.put("c++",90);
	     grades.put("python",80);
	    
	   avarage=gradesList.calculateAverage(grades);
	   System.out.println(avarage);

	}
}
