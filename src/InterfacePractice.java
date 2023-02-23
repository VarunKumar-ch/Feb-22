interface  Parent{
      int age = 12;
      String name = "Va";
    void show();
   void talk();
}
class Child implements Parent{
    int a = 1;
    public void show(){
        System.out.println("Shown");
    }
    public  void talk(){
        System.out.println("Talk");
    }

}
public class InterfacePractice {
    public static void main(String[] args) {
              Parent p = new Child();
              p.show();p.talk();
              Child c= new Child();
             System.out.println(c.a);
             System.out.println(Parent.name);

    }
}
