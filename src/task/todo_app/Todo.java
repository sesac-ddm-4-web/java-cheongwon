package task.todo_app;

public class Todo {
    private int num;
    private String title;
    private Status status;

    public Todo(int num, String title, Status status) {
        this.num = num;
        this.title = title;
        this.status = status;
    }

    public void complete() {
        this.status = Status.COMPLETE;
    }

    public int getNum() {
        return num;
    }

    public String getTitle() {
        return title;
    }

    public Status getStatus() {
        return status;
    }
}
