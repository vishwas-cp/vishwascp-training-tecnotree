package assignment2;
import java.util.concurrent.*;

public class thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		  ExecutorService executorService = Executors.newFixedThreadPool(10);
		  executorService.execute(new Runnable(){
		 @Override 
		   public void run(){
		   System.out.println("Execut or Service");
		  }
		});
		 executorService.shutdown();
		   }
		 }
