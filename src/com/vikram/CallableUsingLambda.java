package com.vikram;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableUsingLambda {
	
	
	public static void main(String[] args) {
		
		
		Callable<String> callable1 = ()-> {
			
			for(int i=1; i<=10; i++) {
				System.out.println(i*5);
				Thread.sleep(2000);
			}
			String task = "Task Completed";
			
			return task;
		};
		
		
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		
		Future<String> futureResult = executorService.submit(callable1);
		
		try {
			String result = futureResult.get();
			System.out.println(result);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		executorService.shutdown();
	}
	

}

