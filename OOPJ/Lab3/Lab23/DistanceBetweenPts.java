public class DistanceBetweenPts {
    public static void main(String[] args) {
        MyPoint m1 = new MyPoint(1,2);
        MyPoint m2  = new MyPoint(3 , 4);

        m1.distance(m2);
        System.out.println("----------------------------");
        m2.distance(1, 1);
    }    
}

class MyPoint{
    int pt1;
    int pt2;

    public MyPoint(){
        this.pt1 = 0;
        this.pt2 = 0;
    }

    public MyPoint(int p1 , int p2){
        this.pt1 = p1;
        this.pt2 = p2;
    }

    public void distance(MyPoint p){
        double distance = Math.sqrt( Math.pow( (this.pt1-this.pt2) , 2) + Math.pow( (p.pt1-p.pt2) , 2) );
        System.out.println("Distance between two points: "+distance);
    }

    public void distance(int p1 , int p2){
        double distance = Math.sqrt( Math.pow( (this.pt1-p1) , 2) + Math.pow( (this.pt2-p2) , 2) );
        System.out.println("Distance: "+distance);
    }
}