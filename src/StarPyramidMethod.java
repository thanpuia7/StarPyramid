
public class StarPyramidMethod {
    
    int number;
    public StarPyramidMethod(int n)
    {
        this.number=n;
    }
    
    
    public void display()
    {
        int i,j,k;
        for(i=1;i<=number;i++)     //this for loop will give n number of lines
        {  for(j=i;j<number;j++)     //this loop will give space
             System.out.print(" ");
        
        for(k=1;k<=(1+(i-1)*2);k++)   //this loop will print * 
            System.out.print("*");
        System.out.print("\n");
        }
        
    }    
}
