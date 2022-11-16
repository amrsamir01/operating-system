package process;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Process extends Thread {
	int ID;
	State state;

	public Process(int x, State state) {
		this.ID = x;
		this.state = state;
	}

	public void process1() {
		System.out.println("Enter file path");
		String path = sys_call.input(null);
		sys_call.sys_call1(sys_call.input(path));
	}

	public void process2() {
		System.out.println("Enter file path");
		String path = sys_call.input(null);
		System.out.println("Enter file data");
		String data = sys_call.input(null);
		sys_call.sys_call2(path, data);
	}

	public static void process3() {
		System.out.println("count ");
		for (int i = 0; i <= 300; i++) {
			System.out.println(i);
		}
	}

	public static void process4() {
		System.out.println("count ");
		for (int i = 500; i <= 1000; i++) {
			System.out.println(i);
		}

	}

	public void process5(int x, int y) {
		int c = 0;
		while(x!=y) {
			c++;
			x++;
		}
		sys_call.sys_call2(" ", Integer.toString(c));
		state = State.TERMINATED;
	}

	public void run() {
		if (this.ID == 1) {
			Scanner x = new Scanner(System.in);
			System.out.println();
			String path = x.nextLine();
			sys_call.sys_call1(path);
		}
		if (this.ID == 2) {
			Scanner x = new Scanner(System.in);
			System.out.println();
			Scanner y = new Scanner(System.in);
			System.out.println();
			String path = x.nextLine();
			String f = y.nextLine();
		}
		if (this.ID == 3) {
			this.process3();
		}
		if (this.ID == 4) {
			this.process4();
		}
		if (this.ID == 5) {
			
		}
	}

	public static void main(String[] args) {
		Process p1 = new Process(1, State.RUNNABLE);
		Process p2 = new Process(2, State.RUNNABLE);
		Process p3 = new Process(3, State.RUNNABLE);
		Process p4 = new Process(4, State.RUNNABLE);
		Process p5 = new Process(5, State.RUNNABLE);
		//p1.start();
		//p2.start();
		//p3.start();
		//p4.start();
		//p5.start();
	}
}