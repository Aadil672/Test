package org.aadil.test;

import java.util.*;
import java.util.stream.*;


public class AddArray {  
	 public static void main(String args[]){    
	     
	  List<String> listOne=new ArrayList<String>();  
	  listOne.add("1");    
	  listOne.add("2");    
	  listOne.add("3");    
	  listOne.add("4");    
	    
	  List<String> listTwo=new LinkedList<String>();   
	  listTwo.add("5");    
	  listTwo.add("6");    
	  listTwo.add("7");    
	  listTwo.add("8");    
	    
	  System.out.println("L1: "+listOne);  
	  System.out.println("L2: "+listTwo);
	 //List<String> newList= Stream.concat(listOne.stream(), listTwo.stream()).collect(Collectors.toList());
	   //System.out.println("Addition: "+newList);
	  List<Integer> result = IntStream.range(0, listOne.size()).mapToObj(i -> listOne.get(i) + listTwo.get(i)).collect(Collectors.toList());

	  System.out.println("result:"+result);
	 }    
	}    

	
	 /*int first = {0, 1, 2};
     int[] second = {3, 4, 5};
*/
	/*public static <T> T[] concat(T[] first, T[] second) {
		  T[] result = Arrays.copyOf(first, first.length + second.length);
		  System.arraycopy(second, 0, result, first.length, second.length);
		  return result;
		}
public static void main(String[] args)
{
	String[] both = Stream.concat(Arrays.stream(first), Arrays.stream(second))
            .toArray(String[]::new);
//System.out.println(result);
*/
	/*String[] f(String[] first, String[] second) {
	    List<String> both = new ArrayList<String>(first.length + second.length);
	    Collections.addAll(both, first);
	    Collections.addAll(both, second);
	    return both.toArray(new String[both.size()]);
	}*/
     
   /*  List<String> newList= Stream.concat(listOne.stream(), listTwo.stream()).collect(Collectors.toList());
     
	public static void main(String[] args) {
		System.out.println("Addition=");
		
	}

}*/
