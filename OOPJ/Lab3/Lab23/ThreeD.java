public class ThreeD {
    public static void main(String[] args) {
        ThreeDPoint th1 = new ThreeDPoint(3, 4, 5);

        th1.distance(1, 2, 3);
    }
}

class MyPoint{
    int x;
    int y;

    public MyPoint(){
        this.x = 0;
        this.y = 0;
    }

    public MyPoint(int p1 , int p2){
        this.x = p1;
        this.y = p2;
    }

     public void distance(int p1 , int p2){
        double distance = Math.sqrt( Math.pow( (this.x-p1) , 2) + Math.pow( (this.y-p2) , 2) );
        System.out.println("Distance: "+distance);
    }
}

class ThreeDPoint extends MyPoint{
    int z = 0;

    public ThreeDPoint(){
        super();
        this.z = 0;
    }

    public ThreeDPoint(int p1 , int p2 , int p3){
        super(p1, p2);
        this.z = p3;
    }

    public void distance(int p1 , int p2 , int p3){
         double distance = Math.sqrt( Math.pow( (this.x-p1) , 2) + Math.pow( (this.y-p2) , 2) + Math.pow(this.z-p3, 2) );
        System.out.println("Distance: "+distance);
    }
}