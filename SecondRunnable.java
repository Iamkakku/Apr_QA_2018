package thread;

public class SecondRunnable implements Runnable{
	
		public void run(){  
		System.out.println("thread is running...");  
		}  
		  
		public static void main(String args[]){  
			SecondRunnable m1=new SecondRunnable();  
		Thread t1 =new Thread(m1);  // 
		
		t1.start();  
		 }  
		
}
