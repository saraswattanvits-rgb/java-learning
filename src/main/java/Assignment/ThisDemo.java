package Assignment;

public class ThisDemo {
    public static void main(String[] args) {
        StudentTest st = new StudentTest(1, "Tanvi");
        st.display();
        st.changeId(2);
        st.display();
    }
}

class StudentTest{
    int id;
    String name;

    StudentTest(int id, String name){
        this.id = id;
        this.name = name;
    }

    void changeId(int id){
        this.id = id;
    }

    void display(){
        System.out.println("ID: " + this.id);
        System.out.println("Name: " + this.name);
    }
}
