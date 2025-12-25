package OOP.object;



class Laptop {
    String model;
    int price;


    //this toString will not go for the super class toString(), it will call this method toSting instead and print "Hey"
    @Override
    public String toString() {
        return "Laptop [model=" + model + ", price=" + price + "]";
    }


    //we are compering 2 objects, the that is for the other object
    /*public boolean equals(Laptop that ){
        if(this.model.equals(that.model) && this.price == that.price){
            return true;
       
        } else 
            return false;

    }*/


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        result = prime * result + price;
        return result;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Laptop other = (Laptop) obj;
        if (model == null) {
            if (other.model != null)
                return false;
        } else if (!model.equals(other.model))
            return false;
        if (price != other.price)
            return false;
        return true;
    }

    
}


public class Demo {
    

    public static void main(String[] args) {
        
        Laptop laptop1 = new Laptop();
        laptop1.model = "Asus";
        laptop1.price = 5000;

        Laptop laptop2 = new Laptop();
        laptop2.model = "Asus";
        laptop2.price = 5000;

       boolean result = laptop1.equals(laptop2);
        System.out.println(result);
    }
}
