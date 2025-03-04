import java.io.File;

public class FileWritingWithMultithreading {

	public static void main(String[] args) {
		Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
		long startTime = System.nanoTime();
		File dir = new File("C:\\Deeps\\myfiles");
		File destination = new File("C:\\mirza\\myfile.txt");
		File[] files = dir.listFiles();
		for (File file : files) {
			Writer w1 = new Writer(file, destination);
			Thread t = new Thread(w1);
			t.setPriority(Thread.MAX_PRIORITY);
			t.start();

		}
		long stopTime = System.nanoTime();

		System.out.println("Total execution time is " + (stopTime - startTime));

	}

}
