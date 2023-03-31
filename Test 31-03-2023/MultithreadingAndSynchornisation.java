class Main {
	public static void main(String args[]) {
		Table obj = new Table();
		Thread1 th1 = new Thread1(obj);
		th1.start();
		Thread2 th2 = new Thread2(obj);
		th2.start();
	}
}

class Table {
	void print(int n) {
		synchronized (this) {
			for (int i = 1; i <= 6; i++) {
				System.out.println(+n + "*" + i + "=" + (n * i));
				try {
					Thread.sleep(400);
				} catch (Exception e) {
					System.out.println(e);
				}
			}
		}
	}
}

class Thread1 extends Thread {
	Table t;

	Thread1(Table t) {
		this.t = t;
	}

	public void run() {
		t.print(25);
	}
}

class Thread2 extends Thread {
	Table t;

	Thread2(Table t) {
		this.t = t;
	}

	public void run() {
		t.print(150);
	}
}

