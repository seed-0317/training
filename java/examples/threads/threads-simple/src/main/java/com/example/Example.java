package com.example;

class DogRunnable implements Runnable {

	@Override
	public void run() {
		for(int i = 0; i < 50; i++) {
			System.out.println("\tdog");
		}
	}
	
}

public class Example {
	public static void main(String[] args) throws InterruptedException {
		Runnable job = new DogRunnable();
		Thread worker = new Thread(job); //give worker a job
		worker.start();
		
		for(int i = 0; i < 50; i++) {
			System.out.println("main");
		}

	}
}
