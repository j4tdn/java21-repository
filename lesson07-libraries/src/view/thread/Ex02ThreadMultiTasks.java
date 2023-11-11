package view.thread;

import java.util.concurrent.TimeUnit;

public class Ex02ThreadMultiTasks {
	static long start = 0;
	public static void main(String[] args) {
		System.out.println("---- Main Start ----");
		start = System.currentTimeMillis();
		
		Task taskLoadA = new Task("Load data from table A", 4);
		executeTask(taskLoadA, "thread-1");
		
		Task taskLoadB = new Task("Load data from table B", 2);
		executeTask(taskLoadB, "thread-2");
		
		Task taskLoadC = new Task("Load data from table C", 11);
		executeTask(taskLoadC, "thread-3");
		
		
		System.out.println("---- Main End ----");
		
	}
	private static void executeTask(Runnable runnable, String threadName) {
		Thread thread = new Thread(runnable, threadName);
		thread.start();
	}
	/*
	 * Giải lập task gồm
	 * + tên task
	 * + thời gian thực thi
	 */
	private static class Task implements Runnable{
		private String name;
		private int seconds;
		public Task(String name, int seconds) {
			this.name = name;
			this.seconds = seconds;
		}
		@Override
		public void run() {
			String threadName = Thread.currentThread().getName();
			System.out.println("\nThread " + threadName + " started executing Task " + name);
			doTask(seconds);
			System.out.println("\nThread " + threadName + " finished executing Task " + name + " .....>>>>>");
		
			System.out.println("Load " + name +  " -->" + (System.currentTimeMillis()-start) + "(ms)");
		}
		
	}
	
	private static void doTask(int seconds) {
		try {
			for(int i = 1;i <= seconds; i++) {
				TimeUnit.SECONDS.sleep(1);
				System.out.println(Thread.currentThread().getName() + " executes " + i + ("s"));
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
