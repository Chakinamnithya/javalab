import java.util.*;
public class whileexam{
     public static void main(String[] args){
          Scanner sc=new Scanner(System.in);
          int i=0;
          System.out.println("enter the limit");
          int n=sc.nextInt();

          System.out.println("enter the marks");
          int marks[]=new int[n];
          while(i<n)
          {
              marks[i]=sc.nextInt();
              i++;
          }
          System.out.println("the marks are:");
          for(int nn:marks)
          {
              System.out.println(nn);
           }
          sc.close();
     }
}
    

