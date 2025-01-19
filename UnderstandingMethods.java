
 //Methods in java are basically the functions in any programming language which is a block of code 
 //that performs an operation and return an output
/*
lets understand the syntax of creating the method

               static return_type  function_name (type arg1 ,type arg2 .....)
              {
              //operations in here
              }


              return type of the method can be anything int , float ,double and even void if the method does not return anything
              name the method which should follow java method standards
              then are the arguments which is written by mentioning the type of argument followed by the name of the argument
              example:
              int age (float temp , ....)
              { 

              }
              remember that the keyword static is most imp when you are calling a method
              */


 // solved problems on Methods

// problem : 1 To add numbers using methods
// public class UnderstandingMethods {
//   static int addNO(int a , int b){
//     return a+b;
//   }
//     public static void main(String[] args) {
//         int add = addNO(5, 60);
//         System.out.println("The sum is ="+add);
//     }
// }


// problem :2 Multiplication using Methods

// import java.util.Scanner;
// public class UnderstandingMethods {
//    static int Multiply_no(int a , int b){
//        int pro = a*b;
//        return (pro);
//    }

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the first number ");
//        int n1 = sc.nextInt();// to receive the first input
//        System.out.println("Enter the second number");
//        int n2 = sc.nextInt();// taking second input
//        int product = Multiply_no(n1,n2);// how to call the method, the variable names can be as per the choice, eg: product in this case
//        System.out.println( "the product  is ="+product);//printing the answer
//    }
// }

// problem 3 : To find the factorial of a number using function or method in java
// import java.util.Scanner;
// public  class UnderstandingMethods {
//    static int  fact(int a ){
//        int fact =1;
//        for (int i=1;i<=a;i++){
//             fact = fact*i;
//        }
//        System.out.println(fact);
//        return fact;
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number ");
//        int n = sc.nextInt();
//        System.out.println("The factorial is :");
//        int factorial =fact(n);

//    }
// }


 //problem 4 : to print the multiplication table of a number

//  import java.util.Scanner;
// public class UnderstandingMethods {

//    static void multiply_data(int a){
//        int ans = 1;
//        for (int i = 1;i<=10;i++){
//            ans = a*i;
//            System.out.printf("%d X %d = %d\n", a,i,ans);
//        }
//    }
//    public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);4
//        System.out.println("Enter the number :");
//        int n1 = sc.nextInt();
//        multiply_data(n1);
//    }
// } 

 //problem 5 : WAP using java functions to print the following pattern
 // *
 // **
 // ***
 // ****

// public class UnderstandingMethods {
//    static void pattern (){
//        for (int i=1;i<=4;i++){
//            for (int j =1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println(" ");
//        }
//    }
//    public static void main(String[] args) {
//        pattern();
//    }
// }


//                                                            #METHOD OVERLOADING IN JAVA 
           
/* 
concept of method overloading == remember it only plays in the parameters and not with the return type
 when multiple methods can have the same name,but they differ in type of parameter and number of parameter 
then such a condition is called as method overloading */
/*

class Methods {
    // IN THIS PARTICULAR METHOD THE NAME IS area AND THE PARAMETER IS (int r)
   public float area (int r){
       float a = 3.14f*r*r;
       return a;
   }
   // IN THIS PARTICULAR METHOD THE NAME IS area AND THE PARAMETER IS (int l , int b)
    public float area (int l , int b){
        float a = l*b;
        return a;
    }
   // IN THIS PARTICULAR METHOD THE NAME IS area AND THE PARAMETER IS (float r)
    public float area (float r){
        float a = r*r;
        return a;
    }

}
class UnderstandingMethods{
   public static void main(String[] args) {
       Methods m = new Methods();
       System.out.println("The area of circle  is = "+m.area(5));
       System.out.println("The area of rectangle is = "+m.area(5,6));
       System.out.println("The area of the square is ="+m.area(4));
    }
}

    */



class Computer {
    public void playmusic(){
        System.out.println("Playing music");
    }
    public String getMeApen(int cost){
        return "pen";
    }
}

public class UnderstandingMethods {
    public static void main(String[] args) {
        Computer obj = new Computer();
        obj.playmusic();
       String str = obj.getMeApen(5);
        System.out.println(str);
    }
}
// class Calc{
//     public int addNO(int a,int b)/* here the a and b are the local variables*/{
//         return  a+b;
//     }
// }
// public class Methods {
//     public static void main(String[] args) {
//         Calc c = new Calc();
//         int r = c.addNO(5,6);
//         System.out.println(r);

//     }
// }
// // so basically all the methods have the same name area but , they differ in the type and number of parameters example in first method
// // the parameter is int r, in the second method the parameter is int l,int b  which are two parameters meaning they differ in number when compared with first and third method
// // ,and in the third method the parameter is float r which differ in type

