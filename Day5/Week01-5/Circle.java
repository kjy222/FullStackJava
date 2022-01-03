public class Circle {
    Point p;
    int r;
}

class Point{
    int x, y;
}

class Circle2 extends Point{
    int r;

    void print() {
        System.out.println(this.x);
    }

    void setX(int x){
        this.x = x;
    }
}


class Ts{
    private static void main(String[] args) {
        Point point = new Point();
        point.x =100;
        System.out.println(point.x);
    }
}