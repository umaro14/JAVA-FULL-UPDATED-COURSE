package OOP.SERIALIZATIONDESIRIALIZATION;


import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        User user = new User();

        user.name = "Aj";
        user.password = "Tchetche14";

        FileOutputStream fileOut = new FileOutputStream("UserInfo.ser");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);

        out.writeObject(user);
        out.close();
        fileOut.close();

        System.out.println("Object info Saved! :)");
    }
}
