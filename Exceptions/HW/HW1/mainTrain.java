package Exceptions.HW.HW1;

public class mainTrain {
    public static void main(String[] args) {
        Point3D first = new Point3D();
        Point3D second = new Point3D(12, 21, 34);
        Point3D third = new Point3D(126, 721, 934);
        Point3D forth = new Point3D();

        first.setPoints(12, 3, 67);

        int a = first.summa();
        int b = second.summa();
        int c = third.summa();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        System.out.println(first.getX() + " " + first.getY() + " " + first.getZ());
        System.out.println("Total ammount of points: " + Point3D.count);

    }
}
class Point3D {
    private int x, y, z;
    static int count;
    {
        x = 1;
        y = 2;
        z = 3;
        count++;
    }

    static{
        count = 0;
    }

    Point3D(){
    }

    Point3D(int x, int y, int z){
    this.x = x;
    this.y = y;
    this.z = z;
    }

    int summa(){
        return Math.abs(x+y+z);
    }

    void setPoints(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getX() {return x;}
    public int getY() {return y;}
    public int getZ() {return z;}
}