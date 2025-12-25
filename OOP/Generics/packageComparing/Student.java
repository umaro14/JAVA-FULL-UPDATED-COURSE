package OOP.Generics.packageComparing;


//this compareble is an interface so we can compare objects
public class Student implements Comparable<Student> {
    int roolno;
    float marks;

    public  Student(int roolno, float marks){
        this.roolno = roolno;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student o) {
        int difference = (int) (this.marks - o.marks);

        //if difference is == 0: means both are equal
        //if difference is < 0: means o is bigger else o is smaller 
        return difference;
    }



}
