// Object Oriented Programming

import ClassesAndObjects.Video;
import Methods.Calculator;
import Methods.MethodVideo;

public class HelloWorld extends MethodVideo {


    public static void main(String[] args) {
//        Video instance = new Video();
//        instance.play();
//        instance.stop();

        MethodVideo methodVideo = new MethodVideo();
//        methodVideo.methodThatReturnsVoid();
//
//        methodVideo.anotherMethodThatReturnsVoid("Video", 10);
//
//        String s = methodVideo.methodThatReturnsString();
//        System.out.println(s);

        Calculator calculator = new Calculator();
        int result = calculator.add(5,10);
        System.out.println(result);


    }
}
