class Computer{
    public void code(){
        System.out.println("From Computer");
    }
}

class Desktop extends Computer{
    public void code(){
        System.out.println("Much Faster");
    }
}

class laptop extends Computer{
    public void code(){
        System.out.println("code"+" "+"Compile");
    }

}
class Devloper{
    public void AppDev(laptop x){
        System.out.println("From Laptop");
        x.code();


    }
    public void AppDev(Desktop y){
        System.out.println("From Desktop");
        y.code();
    }
    public void AppDev(Computer q){
        System.out.println(1);
        q.code();
    }
}
public class Main {
    public static void main(String[] args) {
         laptop l = new laptop();
         l.code();

         Desktop D = new Desktop();
         D.code();
         Devloper V = new Devloper();
         V.AppDev(l);
         V.AppDev(D);
         Computer C = new laptop();
         V.AppDev(C);
    }
}