// UNDERSTANDING TYPE CONVERSION AND TYPE CASTING  IN JAVA


public class Typeconvandcas 

{
     public static void main(String[] args)
     
     {
          System.out.println("understanding conversion in java");
          byte b = 127;
          int a = 256;// we are converting integer value to byte value
          b =(byte)a ; 
     //   b=(convert to)a
          // the range of the byte is 127 and range of int is more than byte so we cannot convert an interger value to a byte 
          // to enable this types of conversions we can use the explicit conversion by using the syntax given below
          System.out.println(b);
          float f = 5.6f;
          int x = (int)f;
          System.out.println(x);

          // as   int has a smaller range than float we have data loss in the output we will get output as 5
          
    
     }    

}
/*
 The process of converting one datatype to another datatype is called as casting
 The casting occours when there is need to store a value of one datatype into variable of another type

 syntax:
 Type variable 2 = (type)variabel 2;
 example:
 int x = 60;
 long y = (long)x;

 Casting of large data type into smaller type may result in a loss of data.
   
 For assigning one type of data value to another type of data variables casting is required but java provides automatic type conversion

 example :
 int a =5;
 float b = a;


 Implicit type conversion 
 this type of conversion is done automatically by the java compiler. It occours when a value of a smaller datatype is assigned to a variable
 of larger data type 

 Explicit conversion 
 this type of conversion is done manually by the programmer using casting.It occours when a value of a larger data type is assigned to a variable
 of a smaller type.

 use explict type casting to avoid runtime errors


primitive type conversion 


form        to        implicit    explicit
byte       short      yes        no
short      int        yes        no
int        long       yes        no
long       float      yes        no
float      double     yes        no
char       int        yes        no
int        char       no         yes





Reference type conversion 

form         to        implicit    explicit
Object       String      no        yes
String       Object      yes       no
Interface    class       no        yes
class        interface   no        yes



widening : conversion of a smaller data type to a larger datatype is called widening

narrowing: converting a larger data type to a smaller data type  is called narrowing

loss of precision : when converting a floating point number to an integer , the fractional part is lost

overflow : when converting a large integer to a smaller integer the value may overflow

 */
