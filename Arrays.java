/*
learning arrays




Array is a collection of similar type of elements that have contiguous memory location
Array provide a convenient means of grouping related information
we can store only fixed elements in an array
first element of the array is stored at the 0th index
*****Types of arrays
1.single dimensional arrays
2.multidimensional arrays  
 */


//  first way to create the array
//public class Arrays {
//    public static void main(String[] args) {
//        int [] arr = {10,20,30,40};
//        arr[1]=30; //  if we want to change the value in the array
//        for (int i =0;i< arr.length;i++){
//            System.out.println(arr[i]); // to print the array elements
//        }
//    }
//}
//second way of creating an array
//public class Arrays {
//    public static void main(String[] args) {
//        int [] arr = new int [5]; // second way of creating an array
//        arr[0]=4;
//        arr[1]=5
//        arr[2]=9;
//        arr[3]=8;
//        arr[4]=7;
//        for(int i =0; i< arr.length;i++){
//            System.out.println(arr[i]);
//        }
//    }
//}
// to create an multidimensional array
//public  class Arrays {
//    public static void main(String[] args) {
//        int [][] nums = new  int [3][4];// nums is an multidimensional array and after the = sign there are [3] three different arrays with array size of four [4]
//      // syntax:  datatype multidimensional [][] array_name = new keyword datatype [Number of  arrays] [array size of each array]
//        for (int i =0;i< 3;i++){
//            for (int j=0;j<4;j++) {
//                nums[i][j] = (int) (Math.random() * 10);
//            }
//        }
//        for (int i =0;i<3;i++)
//        {
//            for (int j=0;j<4;j++){
//                System.out.print(nums[i][j] + " ");
//            }
//            System.out.println(" ");
//        }
//
//    }
//}


/// / concept of jagged arrays: when we are not sure about the size of the arrays we can assign the size for them individually
public class Arrays {
    public static void main(String[] args) {
        int nums [][] = new int[3][];  // this is jagged array where we are not sure about the number of rows

        nums[0] = new int[3];  // so basically at the 0 th index of the array we have an internal array of size 3
        nums[1] = new int[2]; // here the 1 st index of the array has an internal array of size 2
        nums[2] = new int[4]; // here the 2 nd index of the array has an internal array of size 3
        for (int i=0;i<nums.length;i++) {
            for (int j = 0; j < nums[i].length; j++) {
                nums[i][j] = (int) (Math.random() * 10);

            }
        }

        for(int n[] :  nums){
            for (int m : n){
                System.out.print(m + " ");
            }
            System.out.println();
        }

    }
}

// // wap to calculate the sum of 3x3 matrix
// public class Arrays {
//     public static void main(String[] args) {
// //        int [][] mat1 = new int [3][3]; // here we don't know the numbers for  input  so we use the second way mentioned
// //        int [][] mat2 = new int [3][3];
// //        int [][] add  = new int [3][3];
//         int[][] mat1 = {{5, 4, 2}, {8, 9, 7}, {4, 5, 6}};  // we can also use the numbers of our choice using first way mentioned
//         int[][] mat2 = {{6, 5, 3}, {9, 10, 8}, {5, 6, 8}};
//         int[][] add = new int[3][3];
//         System.out.println("MATRIX 1");
//         for (int i = 0; i < 3; i++) {
//             for (int j = 0; j < 3; j++) {
//                 // mat1[i][j] = (int)(Math.random()*10);   // use of math.random to generate the random numbers for the matrix the *10 is used to get a single digit value as the math.random generates double values{not compulsory}
//                 System.out.print(mat1[i][j] + "  ");
//             }
//             System.out.println(" ");
//         }
//         System.out.println("  ");
//         System.out.println("MATRIX 2");
//         for (int i = 0; i < 3; i++) {
//             for (int j = 0; j < 3; j++) {
//                 //  mat2[i][j] = (int)(Math.random()*10);
//                 System.out.print(mat2[i][j] + "  ");
//             }
//             System.out.println(" ");
//         }
//         System.out.println("  ");
//         System.out.println("ADDITION OF THE MATRICES");
//         for (int i = 0; i < 3; i++) {
//             for (int j = 0; j < 3; j++) {
//                 add[i][j] = mat1[i][j] + mat2[i][j];
//                 System.out.print(add[i][j] + "  ");
//             }
//             System.out.println(" ");
//         }
//     }
// }


