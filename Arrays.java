// this is practice set on arrays
 

// problem : printing the array elements

// public class Arrays {
//         public static void main(String[] args) {
//                 int [] arr = {10,20,10,50,20};
//                 for(int i=0;i<arr.length;i++){
//                         System.out.println(arr[i]);
//                 }
//         }
// }

//  problem 2:to print the sum of the array elements
// public class Arrrays{

//         public static void main(String[] args) {
//                 int sum =0;
//                 int [] array = {10,50,46,20,87};
//                 for(int i=0;i<array.length;i++){
//                         sum = sum + array[i];
//                 }
//                 System.out.println("The sum of the array elements is :"+sum);

//         }
// }

// problem 3: find the maximum element in the array
// public class Arrays {

//         public static void main(String[] args) {
        
//                 int [] maxele = {10,20,50,40,19,70,5};
//                 int max = 1;
//                 for (int i=0;i<maxele.length;i++){
//                         if (max < maxele[i]) 
//                         {
//                                max = maxele[i];
//                         }
//                 }
                
//                 System.out.println("The max element is :"+max);
//         }

        

// }


// problem 4: to reverse the array and print the array elements
// public class Arrays

//  {

//         public static void main(String[] args)

//          {
//                 int [] rev = {10,20,30,40,50,60};
//                 System.out.println("The reverse array is :");
//                 for(int i=5;i >= 0;i--)
//                 {

//                         System.out.println(rev[i]);
//                 }
//         }
// }

// problem 5: // search element in the array

// import java.util.Scanner;
// public class Arrays {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number");
//         int target = sc.nextInt();
//         boolean isPresent = false;
//         int [] arr = {10,20,104,60,2};
//         for(int i=0;i<arr.length;i++){
//             if (target == arr[i]) {
//                 isPresent = true;
//                 break;
//             }
//         }
//         if (isPresent) {
//             System.out.println("Present in Array");
//         }
//         else{
//             System.out.println("Not present in Array");
//         }
//     }
// }