
import java.util.Scanner;
public class StarPyramid {
    
    public static void main(String args[]){
        
        
        int n;
        Scanner in=new Scanner(System.in);
        
        System.out.print("Enter how many lines you want to print * pyramid:  ");
        n=in.nextInt();
        
        StarPyramidMethod obj1=new StarPyramidMethod(n);     //instantiating class object and sent n value as parameter
        
        obj1.display();
        
    }
}

