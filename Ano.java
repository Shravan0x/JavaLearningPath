
// creating the anonymous object

class ABC{
    public ABC(){
        System.out.println("object created");
    }
    public void show (){
        System.out.println("In the show method");
    }
}

public class Ano {

    public static void main(String[] args) {
       /*  take an example to understand the anonymous object
        eg     int a;
               a =30;   we can do this , we have declared the variable first and then we assign the value
        now the same above thing can be done for object creation */

/* 

        ABC obj;   // this is the reference creation
        obj =  new ABC(); // and here we are creating an object and assigning the value to the object
        obj.show();

        */

        // but the actual object creation is 
       // new ABC();        // this is basically the object creation this is the anonymous object
        new ABC().show(); // by this we can call any method , every time we say new object it creates new object
       

 
    }
}