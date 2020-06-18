import model.Student;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("张三",18, true, "4452241944754345");
        System.out.println(student.toString());
    }
}
