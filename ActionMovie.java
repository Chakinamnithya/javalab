public class ActionMovie extends movie{
    private String mainActor;
    public ActionMovie(String title,int year,String mainActor){
 super(title,year);
 this.mainActor=mainActor;
}
public void disp(){
    super.display();
      System.out.println("main actor"+mainActor);
}}