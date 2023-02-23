abstract class A{
    public abstract void inA();
}
class  B extends A{
    public void inA(){
        System.out.println("In B");
    }
}
class C extends  A{
    public void inA(){
        System.out.println("IN C");
    }
}
class Dev{
    public void Developed(A x){
        x.inA();
    }


}

public class Check {
    public static void main(String[] args) {
        B b = new B();
        C c = new C();
        Dev D = new Dev();
        b.inA();
        c.inA();
        System.out.println("@@@@");
        D.Developed(b);
        System.out.println("######");
        A m =new B();
        A n =new C();
        D.Developed(m);
        D.Developed(n);


    }
}
