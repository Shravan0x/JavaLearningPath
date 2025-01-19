



//        THIS KEYWORD IN JAVA FOR ENCAPSULATION



// new keyword = there is a memory allocated in the heap memory for the object storage


/*  this keyword : if we want the instance variable and the local
   variable to have the same variable name then we use this keyword to symbolize the instance variable if we don't use this keyword
   so the compiler gets confused between the local and the instance variable */

class Human {
   private int age;  // private means  this age variable is accessible only in the same class
   private String name; // one way to set the name and age is doing it directly here or we can create methods to set name and age

   public int getAge() {
       return age;
   }

   public void setAge(int age) {
       this.age = age;
   }

   public String getName() {
       return name;
   }

   public void setName(String name) {
       this.name = name;
   }
}

public class ThisKeyword {
   public static void main(String[] args) {
       Human obj = new Human();
       obj.setAge(19);  // in order to access the  method we make the use of object to call the method
       obj.setName("Shravan");
       System.out.println(obj.getName() + ":" + obj.getAge());

   }
}
