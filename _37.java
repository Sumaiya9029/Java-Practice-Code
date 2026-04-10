
// 17. Download Manager
// Create a class DownloadManager. Create multiple threads using
// Runnable interface. Each thread represents file download.
// Output: Downloading messages.


public class _17Seventeen  implements Runnable {

    String fileName;

    // Constructor
    _17Seventeen(String fileName) {
        this.fileName = fileName;
    }

    public void run() {
        System.out.println("Downloading " + fileName + "...");
    }

    public static void main(String[] args) {
        // Create multiple threads
        Thread t1 = new Thread(new _17Seventeen("File1"));
        Thread t2 = new Thread(new _17Seventeen("File2"));
        Thread t3 = new Thread(new _17Seventeen("File3"));

        // Start threads
        t1.start();
        t2.start();
        t3.start();
    }
}