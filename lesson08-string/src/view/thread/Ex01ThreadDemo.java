package view.thread;

import java.util.concurrent.TimeUnit;

public class Ex01ThreadDemo {

	public static void main(String[] args) {
		
		System.out.println("-- Start Main ---");
		
		printCurrentThread(11);

		Runnable taskA = new Runnable() {

			@Override
			public void run() {
				doTask(3);
				printCurrentThread(18);
				doTask();
			}
		};

		Thread t1 = new Thread(taskA, "Thread 1"); // new
		t1.start(); // start --> runnable --> run

		doTask(5);
		printCurrentThread(27);
		
		System.out.println("-- End Main ---");
	}

	private static void doTask(int seconds) {
		try {
			for (int i = 1; i <= seconds; i++) {
				TimeUnit.SECONDS.sleep(1);
				System.out.println(Thread.currentThread().getName() + " executes " + i + ("s"));
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	private static void doTask() {
		System.out.println("Load Data From File x.txt");
	}

	private static void printCurrentThread(int line) {
		System.out.println("Current Thread(line " + line + ") --> '" + Thread.currentThread().getName() + "'");
	}
}
