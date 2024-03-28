public class stdfact{
    public static void main(String[] args){
       student s=new student("james","7081");
factimpl.main(null);
         s.display();
     }
}
class student{
String nam,rn;
student(String name,String rno){
nam=name;
rn=rno;
}
public void display(){
System.out.printf("welcome %s rno is %s\n",nam,rn);
}
}
 