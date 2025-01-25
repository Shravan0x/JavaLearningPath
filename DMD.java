  // Dynamic Method Dispatch
  class AAA { // superclass
    public void show() {
        System.out.println("In AAA show");
    }
}

class BBB extends AAA { // subclass
    public void show() {
        System.out.println("In BBB show");
    }
}

public class DMD {
    public static void main(String[] args) {
        AAA obj = new AAA(); // here the obj is AAA , so here we are calling the class AAA
        obj.show(); // as the AAA class is called so we , here are calling the show() method of AAA class , 


        obj = new BBB(); // here the same old object is pointing to class BBB, 
        obj.show(); // as the BBB class is pointed so we get show method of BBB


        // so the conclusion is that the same object is pointing to three different classes , so the object obj.show() behaves differently with different objects
        //  In case of obj.show() , at the compile time we are not sure that obj.show() will call which class , so it is decided at the runtime, so it is called as 
        // runtime polymorphism , and this concept is called as Dynamic Method Dispatch , irrespective of what type of object we have meaning that  AAA obj , here the AAA 
        // is the type of obj , so irrespective of it , it always depends on what obj we have , simple meaning with eg:
        /*
          AAA obj = new AAA();  
          // don't look at teh left side , check the right side behind the new keyword , which ever object is beside new that will be called .
           
           
           This concept is possible only in Inheritance
           Dynamic method dispatch is basically runtime polymorphism
         */
    }
}