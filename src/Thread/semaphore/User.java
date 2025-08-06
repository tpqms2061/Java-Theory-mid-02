package Thread.semaphore;

public class User extends Thread {

    private final PrintQueue queue;
    private final String userName;

    public User(PrintQueue queue, String userName) {
        this.queue = queue;
        this.userName = userName;
    }
}