package com.vikram;
public class ThreadUsingLambda {
	public static void main(String[] args) {
		
		
		Runnable runnable = ()->{
			
			for(int i=1; i<=10; i++) {
				
				System.out.println(i*2);
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
			}
		};
		
		Runnable runnable2 = ()->{
			for(int i=0; i<11; i++) {
				System.out.println(i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		
		Thread thread1 = new Thread(runnable);
		thread1.start();
		
		Thread thread2 = new Thread(runnable2);
		thread2.start();
	}

}
