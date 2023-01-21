import java.util.Scanner;

class Rectangle{
    float len;
    float width;
    public Rectangle(float len , float width){
        this.len = len;
        this.width = width;
    }

    public float findArea(){
        return( len * width );
    }
}


public class RectangleArea {
    public static void main(String[] args) {
        float l , w;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Length");
        l = sc.nextFloat();
        System.out.println("Input Breadth");
        w = sc.nextFloat();
        Rectangle r = new Rectangle(l, w);
        System.out.println("Area is: " + r.findArea());
        sc.close();
    }
}
