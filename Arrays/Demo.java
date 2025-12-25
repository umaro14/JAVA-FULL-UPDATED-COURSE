package Arrays;

public class Demo {
    

    public static void main(String[] args) {

        class Student{
            int rollno;
            String name;
            int marks;
        }
    
        Student s1 = new Student();
        s1.rollno = 1;
        s1.name = "Umaro";
        s1.marks = 90;
    
        Student s2 = new Student();
        s2.rollno = 2;
        s2.name = "Nolly";
        s2.marks = 96;
    
        Student s3 = new Student();
        s3.rollno = 3;
        s3.name = "Sally";
        s3.marks = 98;

        //this create an Array of objects... 3 objects above
        Student student[] = new Student[3];
        student[0] = s1;
        student[1] = s2;
        student[2] = s3;

        //System.out.println(student[0].name + student[0].rollno + student[0].marks);

        //for every index it will provide the name rollno and makrs...obs: i understand
        for(int i = 0; i < student.length; i++){
            System.out.println(student[i].name + " : " + student[i].rollno + " : " + student[i].marks);
        } 
        
        //or, foreach loop or called enhance for loop

        /*for(Student stu: student){
            System.out.println(stu.name + " : " + stu.rollno);
        }*/

        //ends here
      




        //int nums[] = new int[4];
        //nums[0] = 1;
        //nums[1] = 2;
        //nums[2] = 3;
        //nums[3] = 4;


        /*for(int i = 0; i < nums.length; i++){
            System.out.println(nums[i]);
        }*/
 

        //or this which is better
      
        /*for(int n : nums){
          System.out.println(n);
        }*/

    }
}
