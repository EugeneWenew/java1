package inner_tasks;

public interface Speaking {
    public String say();

    default int number() {
        return 1;
    }
}


