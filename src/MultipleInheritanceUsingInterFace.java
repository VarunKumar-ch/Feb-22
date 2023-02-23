interface  M{
    void m1();
}
interface N{
    void m2();
}


public class MultipleInheritanceUsingInterFace implements M,N {
      public void m1(){
          System.out.println("Yes");
      }
      public void m2(){
          System.out.println("No");
      }

    public static void main(String[] args) {

          MultipleInheritanceUsingInterFace k = new MultipleInheritanceUsingInterFace();
          k.m1();
          k.m2();


    }


   }
