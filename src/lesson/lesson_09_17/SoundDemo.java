package lesson.lesson_09_17;

public class SoundDemo {
    public static void main(String[] args) {
        Sound[] sounds = {new Beep(),new Bell()};
        for(Sound sound : sounds){
            sound.play();
        }
    }
}
