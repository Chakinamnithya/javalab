public class movie{
 String title;
 int year_of_release;
movie(String title,int year){
     this.title=title;
     this.year_of_release=year;
}
public void display(){
  System.out.println("title:"+title);

System.out.println("year:"+year_of_release);
}
}