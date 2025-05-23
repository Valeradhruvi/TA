public class DistanceBetween3DPoints {
    public static void main(String[] args) {
       double x1 = 0.0, y1 = 0.0, z1 = 0.0;

       double x2 = 10.0, y2 = 30.0, z2 = 25.5;

       double distance = Math.sqrt( Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2) + Math.pow(z2 - z1, 2) );

       System.out.println("Distance between the points: " + distance);
    }
}
