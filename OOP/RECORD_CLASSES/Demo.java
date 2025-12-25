package OOP.RECORD_CLASSES;


/*class Alien{
    private final int id;
    private final String name;


    public Alien(int id, String name) {
        this.id = id;
        this.name = name;
    }


    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }





    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }


    //COMPARES THE VALUES INSTEAD OF THE MEMORY LOCATION
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Alien other = (Alien) obj;
        if (id != other.id)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }


    @Override
    public String toString() {
        return "Alien [id=" + id + ", name=" + name + "]";
    }




}*/

// BETTER WAY THAN THE ABOVE CODE
//THIS ONE LINE OF CODE WITH THE RECORD KEYWORD IN SAME AS THE ENTIRE CODE ABOVE
//behind the scene is creating a constructor which is a parameterised constructor
//it is also creating the getter and setter methods
//it is also creating the equals and hashcode methods
//theToString method is also created
//by default these values are final
//THIS RECORD CLASS CANNOT EXTEND ANY OTHER CLASS, BUT WE CAN IMPLEMENT AN INTERFACE
// WE CAN CREATE A STATIC VARIABLE INSIDE THE THIS RECORD CLASS, BUT WE CANNOT CREATE AN INSTANCE VARIABLE
 record Alien(int id, String name) {

    static int num; //this works
    //int age; //this will not work...THIS SHOULD BE DEFINED AS A PARAMETER IN ORDER TO WORK

    //THIS IS A CANONICAL CONSTRUCTOR, COS IT HAS THE SAME PARAMETERS DEFINED IN ITS PARENT METHOD
    // public Alien(int id, String name) {
    //     if(id==0)
    //         throw new IllegalArgumentException("id cannot be zero");

    //     this.id = id;
    //     this.name = name;

    // }

    //THIS IS A COMPACTCANOCIAL CONSTRUCTOR WHIS IS SIMPLER
    // WORKS THE SAME

       public Alien {
        if(id==0)
            throw new IllegalArgumentException("id cannot be zero"); 
    }

}


public class Demo {



    public static void main(String[] args) {


    Alien a1 = new Alien(2, "Umaro");
    Alien a2 = new Alien(1, "Umaro");

    System.out.println(a1.name()); //SIMCE THAT WE DO NOT HAVE THE GETTER METHOD WE MUST USE THE VARIABLE AS METHOD




    //System.out.println(a1.getName());
    System.out.println(a1);
    System.out.println(a1.equals(a2));
    //System.out.println(a1.getName().equalsIgnoreCase(a2.getName()));

    }
}
