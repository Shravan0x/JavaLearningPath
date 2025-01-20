

// Inheritance in java : is a concept where the superclass inherits the features of the subclass 






// this is the superclass that inherits or extends the features or properties of the subclass 
//  we make the use of keyword extends to extend the features as used in this below example of a calculator and an adavnced calculator 

class AdvCalc extends Calculator {

    public int div( int a , int b){
        return a/b;
    }
    public int multi(int a , int b ){
        return a*b;
    }
}




// this is the subclass 
class Calculator {
    public int addNo(int a , int b){
        return a+b;

    }
    public int subNo(int a , int b){
        return a-b;
    }
}


public class Calc {

    public static void main(String[] args) {
        AdvCalc obj = new AdvCalc();  // we create the object of the superclass 
        int add = obj.div(10, 20);
        int sub = obj.multi(10, 20);
        int mult= obj.addNo(100, 200);
        int div = obj.subNo(100, 50);
        System.out.println("Addition :"+add);
        System.out.println("Subtrction :"+sub);
        System.out.println("Multiplication :"+mult);  // here the methods or the features of the superclass can be used in the subclass 
        System.out.println("Division :"+div);  // here the multi and div methods of the AdvCalc are used in this particular scenario

      
    }
}
