package thread;

public class PriorityExample extends Thread{
	public void run(){  
		   System.out.println("running thread name is:"+Thread.currentThread().getName());  
		   System.out.println("running thread priority is:"+Thread.currentThread().getPriority());  
		  
		  }  
		 public static void main(String args[]){  
			 PriorityExample m1=new PriorityExample();  
			 PriorityExample m2=new PriorityExample();  
		  m1.setPriority(Thread.MIN_PRIORITY);  
		  m2.setPriority(Thread.MAX_PRIORITY);//10
		  m1.start();  
		  m2.start();  
		   
		 }  

}
