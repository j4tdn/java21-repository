package view.thread;

import java.util.concurrent.TimeUnit;

public class Ex02ThreadMultiTasks {
	static long start = 0;
	public static void main(String[] args) {
		System.out.println("---main start---");
		start = System.currentTimeMillis();
		
		
		Task taskLoadA  = new Task("Load data from table A", 4);
		executeThread(taskLoadA, "thread-1");
		Task taskLoadB  = new Task("Load data from table B", 2);
		executeThread(taskLoadB, "thread-2");
		Task taskLoadC  = new Task("Load data from table C", 5);
		executeThread(taskLoadC, "thread-3");
		
		System.out.println("Load A B C --> " + (System.currentTimeMillis() - start) + "(ms)");
		System.out.println("---Main end---");
	}
	
	private  static void executeThread(Runnable runnable, String threadName) {
		Thread thread = new Thread(runnable, threadName);
		
		thread.start();
	}
	
	private static class Task implements Runnable {
		private String name;
		private int seconds;
		
		public Task(String name, int seconds) {
			this.name = name;
			this.seconds = seconds;
		}
		@Override
		public void run() {
			String threadName = Thread.currentThread().getName();
			System.out.println("\nThread " + threadName + " started executing Task " + name + "....");
			doTask(seconds);
			System.out.println("\nThread " + threadName + " finished executing Task " + name + "...>>>>>>");
			
			System.out.println("Load A B C --> " + (System.currentTimeMillis() - start) + "(ms)");
		}
		
	}
	
	
	private static void doTask(int seconds) {
		try {
			for (int i = 0; i <= seconds; i++) {
				TimeUnit.SECONDS.sleep(1);
				System.out.println(Thread.currentThread().getName() + " executes " + i + ("s"));
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
