package jo.secondstep.Testavarge;

import java.util.HashMap;
import java.util.Map.Entry;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import jo.secondstep.Testaverage.Grades;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestAverage {
    
	    @Test
	    @DisplayName("getavarege")
	    public void compareAverage(){
	    	HashMap<String, Integer> grades = new HashMap<>();
            grades.put("calculus",80);
            grades.put("c++",100);
	        grades.put("python",90);
	    
	        assertEquals(90.0, Grades.calculateAverage(grades));
	 }
	   
	   @Test
	   @DisplayName("null value")
	   public void getNullValue(){
		   HashMap<String, Integer> grades = new HashMap<>();
		   grades.put("c#",77);
		   
		   assertNotNull(grades.get("c#"));
		   
	   }
	   
	   @Test
	   @DisplayName("not valid value")
	   public void getFalseValue() {
		   HashMap<String, Integer> grades = new HashMap<>();
		    grades.put("Chemistry",100);
		    grades.put("c++",100);
	        grades.put("python",90);
	        boolean flag=true;
	        
	        for(Entry<String, Integer> entry: grades.entrySet()){
                 if(entry.getValue()>100) 
                	 flag=false;
                     break;
                 
             }
             assertTrue(flag,"not valid mark");
	   }
		  
	}