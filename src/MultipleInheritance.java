
class A1{
    void m(){
        System.out.println("hello");
    }
}

class B1 {
    void m(){
        System.out.println("k");
    }
}


public class MultipleInheritance extends B1{ // class cannot extend more than one class //error
    public static void main(String[] args) {
        MultipleInheritance bb = new MultipleInheritance();
        bb.m();
    }
}
