package view.thread;

import java.util.concurrent.TimeUnit;

public class Ex02ThreadMultiTasks {
	public static void main(String[] args) {
		System.out.println("---Main Start---");
		long start = System.currentTimeMillis();
		Task taskLoadA = new Task("Load data from table A", 4);
		executeThread(taskLoadA, "thread 1");
		// taskLoadA.run();
		Task taskLoadB = new Task("Load data from table B", 2);
		// taskLoadB.run();
		executeThread(taskLoadB, "thread 2");
		Task taskLoadC = new Task("Load data from table C", 11);
		// taskLoadC.run();
		executeThread(taskLoadC, "thread 3");
		System.out.println("Load A B C -->" + (System.currentTimeMillis() - start) + "(ms)");

		System.out.println("End Main");

	}

	private static void executeThread(Runnable runnable, String threadName) {
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
			System.out.println("Current Thread" + threadName + "start executing Task" + name + "....");
			doTask(seconds);
			System.out.println("\nThread" + threadName + "finished executing Task" + name + "....");

		}
	}

	private static void doTask(int second) {
		try {
			for (int i = 1; i <= second; i++) {
				TimeUnit.SECONDS.sleep(1);
				System.out.println(Thread.currentThread().getName() + "execus" + i + ("s"));
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
