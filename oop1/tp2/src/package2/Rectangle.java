package package2;

public class Rectangle {

   Point corner1;
   Point corner2;

   public Rectangle(Point P1 , Point P2){
    corner1 = P1;
    corner2 = P2;
   }

   double surface(){
    double length = Math.abs(corner1.getX() - corner2.getX());
    double width = Math.abs(corner1.getY() - corner2.getY());
    return length * width;
   }
   
   double perimeter(){
    double length = Math.abs(corner1.getX() - corner2.getX());
    double width = Math.abs(corner1.getY() - corner2.getY());
    return (length + width) * 2;
   }




}
