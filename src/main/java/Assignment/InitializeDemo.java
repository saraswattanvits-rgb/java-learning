package Assignment;

public class InitializeDemo {
    public static void main(String[] args) {
        Test3 t = new Test3(4);
        System.out.println(t.i);
    }
}

class Test3{
    int i;

    Test3(int i){
        this.i = i;
    }
}

