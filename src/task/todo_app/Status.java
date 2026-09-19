package task.todo_app;

public enum Status {
    COMPLETE("완료"),
    INCOMPLETE("미완료");

    private String stat;

    Status(String stat){
        this.stat = stat;
    }

    public String getStatus(){
        return stat;
    }
}
