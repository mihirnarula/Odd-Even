/*
JAVA Program to input elements in 2 1 Diemntional arrays
and then merging them into one array which has all the odd numbers 
first and then all the even numbers from both the arrays
*/

package oddeven;
import java.util.*;  // importing java util packagge to perform functions like input from the user
public class OddEven {

    
    // Create arrays
    int a[] = new int[5];
    int b[] = new int[5];
    int c[] = new int[10];
    
    
    void fillarray(){  // method to input values into the array
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements in the first array: ");
        int i;
        for(i = 0; i < 5; i++){
            a[i] = sc.nextInt();
            }

        System.out.println("Enter elements in the second array: ");

        for(i = 0; i < 5; i++){
            b[i] = sc.nextInt();
            }
    }
    
    void arrange(){     // method to arrange the array
        
        int count = 0;
        int i;
        
        for(i = 0; i < 5; i++){ // adding all the odd numbers from array 1
            
            if(a[i] % 2 != 0){
                c[count] = a[i];
                count++;
            }
            
        }
        for(i = 0; i < 5; i++){  // // adding all the odd numbers from array 2
            
            if(b[i] % 2 != 0){
                c[count] = b[i];
                count++;
            }
            
        }
        
        for(i = 0; i < 5; i++){ // adding all the even numbers from array 1
            
            if(a[i] % 2 == 0){
                c[count] = a[i];
                count++;
            }
            
        }
        for(i = 0; i < 5; i++){ // adding all the even numbers from array 2
            
            if(b[i] % 2 == 0){
                c[count] = b[i];
                count++;
            }
            
        }
        
    }
    
    void display(){    // method to dsplay the array
        System.out.println("final array");
        for(int i = 0; i < 10; i++){
            System.out.println(c[i]);
        }
        
    }
    
    public static void main(String[] args) {
        
    OddEven ob = new OddEven(); // class object to call the methods
    ob.fillarray();
    ob.arrange();
    ob.display();
    
    }
    
}
