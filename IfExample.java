package com.edu.april;

public class IfExample {
public static void main(String[] st) {
	int age=80;
//	if(age>18) {// 20<18 ---false
//		
//		System.out.println(" Age is greater than 18.....");
//	}
//	else if(age<18 && age>5){
//		System.out.println(" age between 5 to 18");
//	}
//	else
//	{
//		System.out.println(" wrong input");
//	}
//	
//	switch(age)//=10
//	
//	{
//	case 10 : System.out.println("10");break;
//	case 20 : System.out.println("20");break;
//	case 30 : System.out.println("30");break;
//	default: System.out.println("not found");
//	
//	}
	
	
	
//	 for(int i=10; i>=0;i--) { // i=1; 1<10,2 2<10, 3<10... 10<=10, 11, 11<=10
//		 
//		 System.out.println(i); //1, 2, 3, 10
//		 
//		 
//	 }
////	 
//	int i=11;
//	while(i<=10) {
//		System.out.println(i);
//		i++;
//	}
	
//	int i=1;
//	do {
//		System.out.println(i);
//		i++;
//	}while(i<=10);
//	
	
	
	
	for(int i=10; i>=0;i--) {
		
		if(i==6) {
			continue;
		}
		System.out.println(i);
	}
	
}
}
