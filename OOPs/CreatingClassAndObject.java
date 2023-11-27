package OOPs;

public class CreatingClassAndObject {
    public static class Student
    {
        String name;
        int rollNo;
        double percentage;
    }
    public static void main(String[] args) {
        Student x=new Student();    // Create object
        x.name="Parmeshwar";
        x.rollNo=53;
        x.percentage=87.5;

        System.out.println(x.name);
        System.out.println(x.rollNo);
        System.out.println(x.percentage);
    }
}
