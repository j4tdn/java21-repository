package view.thread;

import java.util.concurrent.TimeUnit;

public class Ex01ThreadDemo {
	public static void main(String[] args) {
		System.out.println("--Start Main--");
		printfCurrentThread(7); 
		Runnable taskA = new Runnable() {
			
			@Override
			public void run() {
				doTask(3);
				printfCurrentThread(13);
				doTask();
				
			}
		};
		Thread t1= new Thread(taskA, "Thread 1"); // new
		// t1.start(); --> Start ---> runnable ---> run
		doTask(5);
		
		printfCurrentThread(21);
		System.out.println("--End Main--");
	}
	private static void doTask(int second) {
		try {
			for(int i =1; i<= second; i++) {
			TimeUnit.SECONDS.sleep(1);
			System.out.println(Thread.currentThread().getName()+"execus"+i+("s"));
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	private static void doTask() {
		System.out.println("Load Data From File x.txt");
	}
	private static void printfCurrentThread(int line) {
		System.out.println("Current Thread -->" + Thread.currentThread().getName() + "'");
	}
}
