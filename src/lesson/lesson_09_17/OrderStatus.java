package lesson.lesson_09_17;

public enum OrderStatus {
    READY("준비 중"),
    SHIPPED("배송 중"),
    DELIVERED("배송 완료");

    private String status;

    OrderStatus(String status){
        this.status = status;
    }

    @Override
    public String toString() {
        return status;
    }
}
