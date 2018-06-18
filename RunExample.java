package thread;

public class RunExample extends Thread {
	  
		 public void run(){  
		  for(int i=1;i<=5;i++){  
	 try{
		 
		 
		 Thread.sleep(500);
		 
	 }
	 
	 catch(InterruptedException e)
	 {System.out.println(e);}  
		    System.out.println(Thread.currentThread().getName()+" "+i);  
		  }  
		 }  
		 public static void main(String args[]){  
			 RunExample t1=new RunExample();  //thread0--1 to 5==
			 RunExample t2=new RunExample();  //thread1--1 to 5
		   System.out.println( "thread 1 name: "+t1.getName() );
		   t2.setName("My thread 1");
		   System.out.println( "thread 2 name: "+t2.getName() );
		  t1.start();  
		  t2.start();  
		 }  
		}  

