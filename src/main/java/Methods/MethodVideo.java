package Methods;

public class MethodVideo {

    protected void methodThatReturnsVoid() {
        System.out.println("Method is returning nothing!");
    }

    public void anotherMethodThatReturnsVoid(String arg1, int arg2) {
        System.out.println(arg1);
        System.out.println(arg2);
    }

    public String methodThatReturnsString() {
        return "Sample String";
    }
}
