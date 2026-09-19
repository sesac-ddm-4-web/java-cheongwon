package task.todo_app;

import java.util.List;

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

    public static Todo findTodo(List<Todo> todoList, int targetId){
        for(Todo todo : todoList){
            if(todo.getNum() == targetId) return todo;
        }
        return null;
    }
}
