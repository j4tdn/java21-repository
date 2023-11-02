package view.thread;

import java.util.concurrent.TimeUnit;

public class Ex01ThreadMultiTasks {

	static long start;

	public static void main(String[] args) {

		System.out.println("-----Main Start -----");

		start = System.currentTimeMillis();

		Task taskloadA = new Task("Load Data from table A", 4);
//		taskloadA.run();
		executeTask(taskloadA, "thread -1");

		Task taskloadB = new Task("Load Data from table B", 2);
//		taskloadB.run();
		executeTask(taskloadB, "thread -2");

		Task taskloadC = new Task("Load Data from table C", 5);
//		taskloadC.run();
		executeTask(taskloadC, "thread -3");

		System.out.println("-----Main End -----");

	}

	private static void executeTask(Runnable runnable, String threadName) {
		Thread thread = new Thread(runnable, threadName);
		thread.start();
	}

	// Giar laapj Task : Tên task , thời gian thực thi
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
			System.out.println("\nThread " + threadName + " started executing Task " + name + " ....>>>>");
			doTask(seconds);
			System.out.println("\nThread " + threadName + " finished executing Tash" + name + "......>>>>");

			System.out.println("**** " + (System.currentTimeMillis() - start) + "(ms)");
		}

	}

	private static void doTask(int seconds) {
		try {
			for (int i = 1; i <= seconds; i++) {
				TimeUnit.SECONDS.sleep(1);
				System.out.println(Thread.currentThread().getName() + " executes " + i + (" s"));
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
