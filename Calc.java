

// Inheritance in java is a concept where the superclass inherits the features of the subclass 




class AdvCalc extends Calculator {

    public int div( int a , int b){
        return a/b;
    }
    public int multi(int a , int b ){
        return a*b;
    }
}

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
        AdvCalc obj = new AdvCalc();
        int add = obj.div(10, 20);
        int sub = obj.multi(10, 20);
        int mult= obj.addNo(100, 200);
        int div = obj.subNo(100, 50);
        System.out.println("Addition :"+add);
        System.out.println("Subtrction :"+sub);
        System.out.println("Multiplication :"+mult);
        System.out.println("Division :"+div);

      
    }
}