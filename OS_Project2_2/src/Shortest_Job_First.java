public class Shortest_Job_First {
	static void findCompletionTime(int numofproc, int bursttime[], int arrivaltime[]) {
		int processid[] = new int[numofproc];
		int completiontime[] = new int[numofproc];
		int turnaroundtime[] = new int[numofproc];
		int waitingtime[] = new int[numofproc];
		int f[] = new int[numofproc];
		int st = 0;
		int tot = 0;
		for (int i = 0; i < numofproc; i++) {
			processid[i] = i + 1;
			f[i] = 0;
		}
		while (true) {
			int c = numofproc;
			int min = 99999;
			if (tot == numofproc)
				break;
			for (int i = 0; i < numofproc; i++) {
				if ((arrivaltime[i] <= st) && (f[i] == 0) && (bursttime[i] < min)) {
					min = bursttime[i];
					c = i;
				}
			}
			if (c == numofproc)
				st++;
			else {
				completiontime[c] = st + bursttime[c];
				st += bursttime[c];
				turnaroundtime[c] = completiontime[c] - arrivaltime[c];
				waitingtime[c] = turnaroundtime[c] - bursttime[c];
				f[c] = 1;
				processid[tot] = c + 1;
				tot++;
			}
		}
		System.out.print("Completion Time: ");
		for (int i = 0; i < numofproc; i++) {
			System.out.print(completiontime[i] + "      ");
		}
	}
}