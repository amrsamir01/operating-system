class First_Come_First_Serve {
	static void findCompletionTime(int numofproc, int bursttime[], int arrivaltime[]) {
		int turnaroundtime[] = new int[numofproc];
		int waitingtime[] = new int[numofproc];
		int service_time[] = new int[numofproc];
		service_time[0] = 0;
		waitingtime[0] = 0;
		for (int i = 1; i < numofproc; i++) {
			int wasted = 0;
			service_time[i] = service_time[i - 1] + bursttime[i - 1];
			waitingtime[i] = service_time[i] - arrivaltime[i];
			if (waitingtime[i] < 0) {
				wasted = Math.abs(waitingtime[i]);
				waitingtime[i] = 0;
			}
			service_time[i] = service_time[i] + wasted;
		}
		for (int i = 0; i < numofproc; i++)
			turnaroundtime[i] = bursttime[i] + waitingtime[i];
		System.out.print("Completion Time: ");
		for (int i = 0; i < numofproc; i++) {
			int completiontime = turnaroundtime[i] + arrivaltime[i];
			System.out.print(completiontime + "         ");
		}
	}
}
