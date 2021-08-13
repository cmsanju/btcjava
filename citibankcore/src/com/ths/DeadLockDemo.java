package com.ths;

public class DeadLockDemo {
	
	public static void main(String[] args) {
		
		String source1 = "Varun";
		
		String source2 = "Varun2";
		
		Thread t1 = new Thread()
				{
					public void run()
					{
						synchronized (source1) {
							
							System.out.println("Thread 1 : Source1 locked ");
							
							try {
							Thread.sleep(1000);
							}
							catch(Exception e)
							{
								e.printStackTrace();
							}
							
							synchronized (source2) {
								
								System.out.println("Thread 1 : Source2 locked");
								
							}
							
						}
					}
				};
				
		Thread t2 = new Thread() {
			
			public void run()
			{
				synchronized (source2) {
					
					System.out.println("Thread 2 : Source2 locked");
					
					try
					{
						Thread.sleep(1000);
					}
					catch(Exception e)
					{
						e.printStackTrace();
					}
					
					synchronized (source1) {
						
						System.out.println("Thread2 : Source1 locked");
						
					}
					
				}
			}
			
		};
		
		t1.start();
		t2.start();
		
	}

}
