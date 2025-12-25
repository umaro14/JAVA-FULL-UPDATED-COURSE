package OOP.Generics.packageComparing;

import java.util.Arrays;

public class Main {
    
    public static void main(String[] args) {
        Student umaro = new Student(12, 89.76f);
        Student nolly = new Student(5, 79.52f);
        Student amu = new Student(6, 94.52f);
        Student sule = new Student(8, 91.52f);
        Student sally = new Student(4, 92.52f);

        Student[] list = {umaro, nolly, amu, sule, sally };
        System.out.println(Arrays.toString(list));

        Arrays.sort(list);


        if(umaro.compareTo(nolly) < 0){
            System.out.println(umaro.compareTo(nolly));
            System.out.println("Umaro has more marks ");
        }
    }
}
