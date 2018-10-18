class test {
	public static void main(String args[]) {
		threading t1 = new threading("thread1");
		threading t2 = new threading("thread2");
		try {
			t1.t.join();
			t2.t.join();
		}
		catch(Exception e) {
			System.out.print(e);
		}
	}
}

class threading implements Runnable {

	Thread t;
	threading(String name) {
		t = new Thread(this, name);
		t.start();
	}

	public void run() {
		try {
			String name = Thread.currentThread().getName();
			int pr = Thread.currentThread().getPriority();
			if(name == "thread1") {
				System.out.println(name);
				for(int i = 1; i <= 2000; i++) {
					System.out.print("PR: " + pr + " - ");
					System.out.println(name + ": " + i);
				}
			}

			if(name == "thread2") {
				Thread.currentThread().setPriority(6);
				System.out.println(name);
				for(int i = 11; i <= 2000; i++)
					System.out.println(name + ": " + i);
			}
		}
		catch(Exception e) {
			System.out.print(e);
		}
	}
}