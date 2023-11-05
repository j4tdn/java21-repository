package view.thread;

public class Ex01ThreadDemo {

	public static void main(String[] args) {
		
		System.out.println("--- Start Main ---");
		printCurrentThread(8);
		
		Runnable taskA = new Runnable() {
			
			@Override
			public void run() {
				printCurrentThread(14);
				doTask();
			}
		};
		
		Thread t1 = new Thread(taskA, "Thread 1"); // new
		t1.start(); // start --> runnable --> run 
		
		printCurrentThread(22);
		System.out.println("--- End Main ---");
	}
	
	private static void doTask() {
		System.out.println("Load Data From File x.txt");
	}
	
	private static void printCurrentThread(int line) {
		System.out.println("Current Thread(line " + line + " --> " + Thread.currentThread().getName() + "'");
		
	}
	
}
