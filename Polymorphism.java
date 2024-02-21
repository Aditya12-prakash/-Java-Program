class Poly{
  int add(int x,int y){
    int a,b,add;
    a=x;
    b=y;
    add=a+b;
    return add;
  }
  double add(double x,double y){
    double a,b,add;
    a=x;
    b=y;
    add= a+b;
    return add;
  }
   String add(String x,String y){
    String a,b,add;
    a=x;
    b=y;
    add=a+b;
    return add;
   }
 void Eat()
 {
  System.out.println("Human is eating");
 }
}
class morphism extends Poly{
@Override
void Eat(){
    super.Eat();
    System.out.println("Cow is eating");
}
}
class Polymorphism{
  public static void main(String[] args) {
    Poly i = new Poly();
    morphism j = new morphism();
    j.Eat();
    System.out.println(i.add(2,5));
    System.out.println(i.add(4.6, 5.9));
    System.out.println(i.add("Aditya", " Prakash"));   
  }
}
