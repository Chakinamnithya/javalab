class bicycle
{
       void displayFeatures(){
       System.out.println("features:pedals,manual power");
}
}

class motorbike extends bicycle{
        void displayFeatures()
         {
                super.displayFeatures();
                 System.out.println("added feature by motorbike: engine");
}
}
 class electricBike extends motorbike{
 void displayFeatures(){
 super.displayFeatures();
 System.out.println("new feature by electric bike:electric motor and battery");
}
}
 class multilevel{
  public static void main(String args[]){
 electricBike myEbike=new electricBike();
 myEbike.displayFeatures();
}
}
