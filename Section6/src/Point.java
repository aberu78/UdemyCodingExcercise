public class Point {
    private int x;
    private int y;

    public Point() {
        this(0, 0);
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }


    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public double distance() {
        double num = (this.y - .00) * (this.y - .00) + (this.x - 0.0) * (this.x - 0.0);
        return Math.sqrt(num);
    }

    public double distance(int x, int y) {

        double num = (x - this.x) * (x - this.x) + (y - this.y) * (y - this.y);
        return Math.sqrt(num);
    }

    public double distance(Point p) {

        double num = (p.getX() - this.x) * (p.getX() - this.x) + (p.getY() - this.y) * (p.getY() - this.y);
        return Math.sqrt(num);

    }
}