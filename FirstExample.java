package thread;

public class FirstExample extends Thread{

		public void run(){  
		System.out.println("thread is running...");  
		}  
		public static void main(String args[]){  
		FirstExample t1=new FirstExample();  
	
		t1.start();  
		 }  
		}  


