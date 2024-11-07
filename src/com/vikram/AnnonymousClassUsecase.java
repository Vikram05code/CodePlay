package com.vikram;

public class AnnonymousClassUsecase {
	
	public static void main(String[] args) {
		
		
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				
				for(int i=1; i<=10; i++) {
					System.out.println(i*7);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
				System.out.println("Task Completed");
				
			}
		};
		
		Thread thread1 = new Thread(runnable);
		thread1.start();
		
		try {
			thread1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
	
}

