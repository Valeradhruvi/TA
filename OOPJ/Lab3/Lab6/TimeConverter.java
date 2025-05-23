public class TimeConverter {
    public static void main(String[] args) {
        int totalSeconds = 10000; // You can change this value to any number of seconds

        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;

        System.out.printf("Time: "+hours+":"+minutes+":"+seconds    );
    }
}
