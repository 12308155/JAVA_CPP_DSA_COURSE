import java.util.*;

/* count of digits

public class problems {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int count = 0;

        
        if (num == 0) {
            count = 1;
        } else {
            while (num != 0) {
                num = num / 10;
                count++;
            }
        }

        System.out.println("Number of digits = " + count);
    }
}
 // write a program to find the sum of digits of a number

public class problems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int sum =0;
        int digit;
        while(num!=0){
            digit=num%10;
            sum=sum+digit;
            num=num/10;
        }
        System.out.println(sum);
    }
}*/
// write a program to reverse a number


// public class problems {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number: ");
//         int n = sc.nextInt();
//         int original = n;
//         int rev =0;
//          while (n != 0) {
//             int last_digit = n % 10;
//             rev = rev * 10 + last_digit;
//             n = n / 10;
//         }
//         System.out.println(rev);
//         if(original == rev){
//             System.out.println("It is a palindrome number");
//         }
//         else{
//             System.out.println("It is not a Palindrome number");
//         }
//     }
// }

// write a program to find the largest difit in number;

// public class problems {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number:");
//         int n =sc.nextInt();
//         int max_digit =0;


//         while(n != 0){
//             int digit =n%10;
//             if(digit>max_digit){
//                 max_digit=digit;

//             }
//             n =n/10;
//         }
//         System.out.println(max_digit);

//     }
// }
// write a program to convert a decimal to binary using loops
public class problems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n =sc.nextInt();
        
        int binary =0;
        int place =1;
        while(n>0){
            int rem = n%2;
            binary =binary+ rem*place;
            place *=10;
            n =n/ 2;
        }
        System.out.println("Binary number: "+binary);
       sc.close();
    }
}
    