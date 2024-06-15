class SuperHero{
String name;
String power;
  public SuperHero(String name,String power){
this.name=name;
this.power=power;
}
public void usepower()
{
System.out.println(name+"uses"+power);
}
}
class Ironman extends SuperHero{

public Ironman(String name)
{
super(name,"Advanced technology");
}
}
class Spiderman extends SuperHero{
public Spiderman(String name){
super(name,"webg-slingling and spider-like abilities");
}
}
public class Heirarchial{
           public static void main(String[]  args){

                   Ironman ironman=new Ironman("ironman");
                  Spiderman spiderman=new Spiderman("spider man");
                 ironman.usepower();
                 spiderman.usepower();
}
}


