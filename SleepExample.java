package thread;

public class SleepExample extends Thread {
	
		 public void run(){  
		  for(int i=1;i<5;i++){  
		    try{Thread.sleep(500);}catch(InterruptedException e){System.out.println(e);}  
		    System.out.println(i);  
		  }  
		 }  
		 public static void main(String args[]){  
			 SleepExample  t1=new SleepExample ();  
			 SleepExample  t2=new SleepExample ();  
		   
		  t1.start();  
		  t2.start();  
		 }  
		}  

