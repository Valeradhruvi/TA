public class DemonstrateStringFunctions {
    public static void main(String[] args) {
        String str = "Darshan University";
        String str2 = "Hadala      ";
        char ch = 'A';

        System.out.println("Length: "+str.length());
        System.out.println("4th Character: "+str.charAt(4+1));
        System.out.println("Concatination: "+str.concat(str2));
        System.out.println("Index of \"U\" : "+str.indexOf("U"));
        System.out.println("Equility of Two Strings: "+str.equals(str2));
        System.out.println("Value: " + String.valueOf(5));
        System.out.println("To String: "+Character.toString(ch));
        System.out.println("Trim : "+str2.trim());
        System.out.println("Substring: "+str.substring(5,9));
    }    
}
