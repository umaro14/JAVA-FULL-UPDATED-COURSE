


    
    
    interface myInterface {
    
        public void fName ();
        
    }


class Demo implements myInterface{
    public void fName(){
        System.out.println("Hello");
    }
}    




public class Employee {

   

    private int experience;  //a variable or field

    public Employee (int experience){
        this.experience = experience;
    }; //constructor

    public double calculateSalary(){
        int salary = experience * 50000;
        return salary;
    }
    public static void main(String[] args) {

        Employee emp = new Employee(45);

        Demo demo = new Demo();
        demo.fName();

        //emp.experience = 5; //accessing the variable experience

        double salary = emp.calculateSalary();
        System.out.println(salary);

}
}
