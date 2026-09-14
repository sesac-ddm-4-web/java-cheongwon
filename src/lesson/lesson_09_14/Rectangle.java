package lesson.lesson_09_14;

public class Rectangle {
    int width;
    int height;

    Rectangle(int width, int height){
        this.width=width;
        this.height=height;
    }

    int area(){
        return width*height;
    }

    int perimeter(){
        return (width+height)*2;
    }
}
