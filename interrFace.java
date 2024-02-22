import java.io.*;
interface Inter {
    void Human();
}
class face implements Inter{
public void Human(){
        System.out.println("Hii Buddy!");
    }
}
class interrFace{
    public static void main(String args[]){
        face i = new face();
        i.Human();
    }
}