import java.util.*;

public class main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("please enter the number of the process which you need (1 for RR | 2 for FCFS | 3 for SJF): ");
		int s = sc.nextInt();
		if (s == 1) {
			System.out.print("please enter the number of processes: ");
			int n = sc.nextInt();
			int burst_time[] = new int[n];
			for (int i = 0; i < n; i++) {
				System.out.print("please enter the the brust time: ");
				burst_time[i] = sc.nextInt();
			}
			int arrival_time[] = new int[n];
			for (int i = 0; i < n; i++) {
				System.out.print("please enter the the arrival time: ");
				arrival_time[i] = sc.nextInt();
			}
			System.out.print("please enter the the quantum: ");
			int quantum = sc.nextInt();
			System.out.println("Round Robin: ");
			Round_Robin.findCompletionTime(n, burst_time, quantum, arrival_time);
			sc.close();
		} else if (s == 2) {
			System.out.print("please enter the number of processes: ");
			int n = sc.nextInt();
			int burst_time[] = new int[n];
			for (int i = 0; i < n; i++) {
				System.out.print("please enter the the brust time: ");
				burst_time[i] = sc.nextInt();
			}
			int arrival_time[] = new int[n];
			for (int i = 0; i < n; i++) {
				System.out.print("please enter the the arrival time: ");
				arrival_time[i] = sc.nextInt();
			}
			System.out.println("First come first serve: ");
			First_Come_First_Serve.findCompletionTime(n, burst_time, arrival_time);
			sc.close();
		} else if (s == 3) {
			System.out.print("please enter the number of processes: ");
			int n = sc.nextInt();
			int burst_time[] = new int[n];
			for (int i = 0; i < n; i++) {
				System.out.print("please enter the the burst time: ");
				burst_time[i] = sc.nextInt();
			}
			int arrival_time[] = new int[n];
			for (int i = 0; i < n; i++) {
				System.out.print("please enter the the arrival time: ");
				arrival_time[i] = sc.nextInt();
			}
			System.out.println("Shortest Job First: ");
			Shortest_Job_First.findCompletionTime(n, burst_time, arrival_time);
			sc.close();
		} else {
			System.out.println("it is not found!");
		}
	}
}
