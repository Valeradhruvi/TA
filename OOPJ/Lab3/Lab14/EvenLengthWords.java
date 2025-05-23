public class EvenLengthWords {
    public static void main(String[] args) {
        
        String [] str = {"Darhsan" , "University" , "Hadala" , "Rajkot"};

        for(int i=0;i<str.length;i++){
            if(str[i].length()%2 == 0){
                System.out.println(str[i]);
            }
        }
    }
}
