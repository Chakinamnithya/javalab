public class nestedif{
    public static void main(String[] args){
      java.util.Scanner sc=new java.util.Scanner(System.in);
      System.out.println("enter your favorite iconic character:");
      String act=sc.nextLine();
      if(act.equals("iron man")){
         System.out.println("great choice");
         System.out.println("enter"+act+"rael name");
         String reall=sc.nextLine();
         if(reall.equalsIgnoreCase("tony stark")){
                 System.out.println("cool actor");
              }
}
else
{
   System.out.println(act);
}
sc.close();
}
}

   