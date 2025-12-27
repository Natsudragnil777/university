package package2;

import java.util.Scanner;

public class Main2 {
 public static void main(String[] args) {
    Scanner scr = new Scanner(System.in);

    System.out.println("enter the point a(x,y)");
    double ax = scr.nextDouble();
    double ay = scr.nextDouble();
    Point a = new Point(ax, ay);


    System.out.println("enter the point b(x,y)");
    double bx = scr.nextDouble();
    double by = scr.nextDouble();
    Point b = new Point(bx, by);


    System.out.println("enter the point c(x,y)");
    double cx = scr.nextDouble();
    double cy = scr.nextDouble();
    Point c = new Point(cx, cy);

    System.out.println("a symitric to x " + a.symX().getX() + "," + a.symX().getY() );
    System.out.println("a symitric to y " + a.symY().getX() + "," + a.symY().getY() );
    System.out.println("b symitric to x " + b.symX().getX() + "," + b.symX().getY() );
    System.out.println("b symitric to y " + b.symY().getX() + "," + b.symY().getY() );
    System.out.println("c symitric to x " + c.symX().getX() + "," + c.symX().getY() );
    System.out.println("c symitric to y " + c.symY().getX() + "," + c.symY().getY() );


    double dab = a.distance(b) ;
    double dac = a.distance(c) ;
    double dbc = b.distance(c);

    if(dab == dac && dab == dbc){
        System.out.println("Triangle type: Equilateral");
    }else if(dab == dbc || dbc == dac || dac == dab){
        System.out.println("Triangle type: Isosceles");
    }else{
        System.out.println("Triangle type: Scalene");
    }

    System.out.println("enter radius of point a:");
    double ra = scr.nextDouble();
    Circle Ca = new Circle( a, ra);

    System.out.println("enter radius of point b:");
    double rb = scr.nextDouble();
    Circle Cb = new Circle( b, rb);

    System.out.println("enter radius of point c:");
    double rc = scr.nextDouble();
    Circle Cc = new Circle( c, rc);

    System.out.println("the surface of circle a = " + Ca.surface());
    System.out.println("the surface of circle b = " + Cb.surface());
    System.out.println("the surface of circle c = " + Cc.surface());

    System.out.println("enter the point P(x,y)");
    double Px = scr.nextDouble();
    double Py = scr.nextDouble();
    Point P = new Point(Px, Py);
    if( Ca.include(P) || Cb.include(P) || Cc.include(P) ){
        System.out.println("the point belongs to a circle of the three circles");
    }else{
        System.out.println("the point don't belong to any circle");
    }

    Rectangle R = new Rectangle(a, b);
    System.out.println("the perimeter of the rectangle = " + R.surface() );
    System.out.println("the perimeter of the surface = " + R.perimeter() );



 }


}
