
// understanding literals : In java, literals are values that are represented directly in the code, rather than being computed or stored in a variable
public class Literal {
    public static void main(String[] args) {
        int num=9;
        System.out.println(num);
        int num1 = 0b101;  // this is 101 in binary in decimal it is 5 so if we print 0b101 it gives us the output as 5
        System.out.println(num1);
        int num2 = 1_000_000_00; // if we have difficulty in counting the number of zeroes then we can simply put an underscore in between the values 
        System.out.println(num2);
        double num3 = 12e10;  // this is basically 12 x 10 raise to 10
        System.out.println(num3);
        boolean a = true;
        System.out.println(a);
        char c = 'a';
         c++;  // in output we get ans as 'b '
        System.out.println(c);
        
    } 
}
