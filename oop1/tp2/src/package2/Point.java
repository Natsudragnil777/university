package package2;

public class Point {
   private double x;
   private double y;
  
   public Point(double a , double b) {
        x = a;
        y = b;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public Point symX() {
        return new Point(-x, y);
    }

    public Point symY() {
        return new Point(x, -y);
    }

    public double distance(Point p) {
        double dx = Math.abs(p.getX() - this.x);
        double dy = Math.abs( p.getY() - this.y);
        return Math.sqrt(dx * dx + dy * dy);
    }
 

}
