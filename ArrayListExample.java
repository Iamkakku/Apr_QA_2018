package com.edu.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {

	 
	 public static void main(String args[]){  
	  ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
	  list.add("Java");//Adding object in arraylist  
	  list.add("Selenium");  
	  list.add("REST Api");  
	  list.add("JMeter");  
	  //Traversing list through Iterator  
	  Iterator itr=list.iterator();  
	  while(itr.hasNext()){  
	   System.out.println(itr.next());  
	  }  
	  
//	  for(String obj:al)  
//		    System.out.println(obj);  
//		 } 
	  
	  
	  
	  
	 }  
	}  

