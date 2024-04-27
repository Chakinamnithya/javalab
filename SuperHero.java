class SuperHero{
 String sname,spower,behavior;
  int age;
 SuperHero(String name,String pwr,String bhvr,int ag){
          this.sname=name;
          this.spower=pwr;
          this.behavior=bhvr;
          this.age=ag;
}
 void display(){
  System.out.println("your hero is:");
 System.out.println("name:"+sname);
 System.out.println("spower:"+spower);
 System.out.println("behaviour"+behavior);
 System.out.println("age:"+age);
}

}