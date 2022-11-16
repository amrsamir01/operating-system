public class Round_Robin {

	public static void findCompletionTime(int numofproc, int bursttime[], int quantum, int arrivaltime[]) {
		int waitingtime[] = new int[numofproc];
		int turnaroundtime[] = new int[numofproc];
		int completiontime[] = new int[numofproc];
		for (int i = 0; i < numofproc; i++) {
			turnaroundtime[i] = completiontime[i] - arrivaltime[i];
			waitingtime[i] = turnaroundtime[i] - bursttime[i];
		}
		int store_brusttime[] = new int[numofproc];
		for (int i = 0; i < waitingtime.length; i++) {
			store_brusttime[i] = bursttime[i];
		}
		int sum = 0;
		int arrival = 0;
		while (true) {
			boolean done = true;
			for (int i = 0; i < numofproc; i++) {
				if (store_brusttime[i] > 0) {
					done = false;
					if (store_brusttime[i] > quantum && arrivaltime[i] <= arrival) {
						sum += quantum;
						store_brusttime[i] -= quantum;
						arrival++;
					} else {
						if (arrivaltime[i] <= arrival) {
							arrival++;
							sum += store_brusttime[i];
							store_brusttime[i] = 0;
							completiontime[i] = sum;
						}
					}
				}
			}
			if (done == true) {
				break;
			}
		}
		System.out.println("Completion Time: ");
		for (int i = 0; i < numofproc; i++) {
			System.out.print(completiontime[i] + "         ");
		}
	}
}