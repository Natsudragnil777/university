package package2;

public class Circle {
    Point center;
    double radius;

    public Circle(Point C, double R) {
        center = C;
        radius = R;
    }

    public double surface() {
        return Math.PI * radius * radius;
    }

    public double distance(Point P){
        return P.distance(center);
    }

    public boolean include(Point P) {
        double dP = center.distance(P);
        if (dP > radius) {
            return false;
        } else {
            return true;
        }

    }

}
