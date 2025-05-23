    import java.util.Scanner;

    public class GcdUsingMethod {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int gcd = gcd(10 , 12);
            System.out.println("GCD : "+gcd);
        }   
        
        public static int gcd(int a , int b){
            int gcd = 0;
            if(a > b){
                for(int i=1;i<=a;i++){
                    if(a%i == 0 && b%i == 0){
                        if(gcd < i){
                            gcd = i;
                        }
                    }
                }
            }
            else if(b > a){
                for(int i=1;i<=b;i++){
                    if(b%i == 0 && a%i == 0){
                        if(gcd < i){
                            gcd = i;
                        }
                    }
                }
            }
            else{
                for(int i=1;i<a;i++){
                    if(a%i == 0){
                        if(gcd < i){
                            gcd = i;
                        }
                    }
                }
            }

            return gcd;
        }
    }
