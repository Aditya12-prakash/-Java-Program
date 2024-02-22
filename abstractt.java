abstract class abs{
   abstract void Human();
    abstract void cat();
   void dog(){
       System.out.println("Hii Tommy!");
   }
}
class tract extends abs{
    void Human(){
        System.out.println("Hii Buddy!");
    }
    void cat(){
        System.out.println("Hii Kityy!");
    }
}
class abstractt{
   public static void main(String args[]){
    tract i = new tract();
    i.Human();
    i.cat();
    i.dog();
   }
}