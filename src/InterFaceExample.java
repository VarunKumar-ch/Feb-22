interface Circle{
    void draw();
    default int define(){

        return 0;
    }

}


class Rectangle implements  Circle{
    public void draw(){
        System.out.println("This is Rectangle");
    }
}
class Square implements  Circle{
    public void draw(){
        System.out.println("this is Square");
    }
}

public class InterFaceExample {
    public static void main(String[] args) {
        Circle c = new Rectangle();
        Circle d = new Square();

        c.draw();
        d.draw();

        System.out.println(c.define());

    }

}
