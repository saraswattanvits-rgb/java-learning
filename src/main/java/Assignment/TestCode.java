package Assignment;

public class TestCode {
    public static void main(String[] args) {
        A a1 = new A();
        a1.add(a1.add(10,20),a1.add(30,40));
        System.out.println(a1);
    }
}

class A{
    public int add(int i, int j){
        return i + j;
    }
}
