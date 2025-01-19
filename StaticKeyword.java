class Mobile{
    String brand;
    int price;
    String network;
     static String name;   // when we use the static keyword the variable becomes common for all the classes is the program
    public void show(){
        System.out.println(brand + " : "+ price+ " : "+name);
    }

}


public class StaticKeyword {
    public static void main(String[] args) {
        // understanding what is the static keyword
        Mobile obj = new Mobile();
        obj.brand="apple";
        obj.price = 1500;
        Mobile.name = "Smartphone";// as this line represent the static so ,all the static variables must be called using their class name and not with the object name ,so
        // instead of the obj.name we use Mobile.name which is a class name


        Mobile obj1 = new Mobile();
        obj1.brand="Samsung";
        obj1.price = 2500;
        Mobile.name = "Smartphone";// as this line represent the static so ,all the static variables must be called using their class name and not with the object name
        // if we try to change the obj.name to any other name then it will also affect the all the existing objects in the program
        // let us try to do so, the  static is shared by all the objects
        obj.name ="phone";
        obj1.show();
        obj.show();
    }
}

