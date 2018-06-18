package com.edu.collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {
	public static void main(String args[]){  
		  
		  LinkedList<String> al=new LinkedList<String>();  
		  al.add("Banana");  
		  al.add("Apple");  
		  al.add("Cherry");  
		  al.add("BlueBerry");  
		  
		  Iterator<String> itr=al.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }  
		 }  

}
