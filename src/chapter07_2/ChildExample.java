package chapter07_2;

public class ChildExample {
    public static void main(String[] args) {
        Child child = new Child();

        Parent parent = child;
        parent.method1();
        parent.method2();
        //parent.method3(); 부모클래스에서 선언된 필드와 메소드만 접근가능
    }
}
