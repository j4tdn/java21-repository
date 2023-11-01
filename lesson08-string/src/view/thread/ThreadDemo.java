//package view.thread;
//
//public class ThreadDemo {
//	public static void main(String[] args) {
//
//		System.out.println("--- Start main ---");
//		
//		
//		Runnable taskA = new  Runnable() {
//			
//			@Override
//			public void run() {
//				
//			}
//		};
//		
//		Thread t1 = new Thread(taskA, "Thread 1");  // new
//		t1.start(); //start task --> gọi đến runable --> run
//		
//		printCurrentThread();
//		System.out.println("--- End main ---");
//	}
//	
//	
//	private static void doTask() {
//		System.out.println("Load Data From File x.txt");
//	}
//
//	private static void printCurrentThread() {
//		System.out.println("Current thread: " + Thread.currentThread().getName() + "'");
//	}
//}
