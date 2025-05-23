public class SumOfNumbers {
    public static void main(String[] args) {
       if(args.length == 0){
        System.out.println("Please provide numbers in command line arguments.");
       }
        int total = 0;
        for (String arg : args) {
            try {
                int number = Integer.parseInt(arg);
                total = total + processNumber(number);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input (not an integer): " + arg);
            } catch (NegativeNumberException |
                     DivisibleByTenException |
                     Range1000To2000Exception |
                     GreaterThan7000Exception e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("Total sum of valid numbers: " + total);

       } 


    public static int processNumber(int n) throws NegativeNumberException, DivisibleByTenException,
            Range1000To2000Exception, GreaterThan7000Exception {
        if (n < 0) {
            throw new NegativeNumberException("Number is negative.");
        } else if (n % 10 == 0) {
            throw new DivisibleByTenException("Number is divisible by 10.");
        } else if (n > 1000 && n < 2000) {
            throw new Range1000To2000Exception("Number is between 1000 and 2000.");
        } else if (n > 7000) {
            throw new GreaterThan7000Exception("Number is greater than 7000.");
        }
        return n;
    }
}

class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}
class DivisibleByTenException extends Exception {
    public DivisibleByTenException(String message) {
        super(message);
    }
}

class Range1000To2000Exception extends Exception {
    public Range1000To2000Exception(String message) {
        super(message);
    }
}

class GreaterThan7000Exception extends Exception {
    public GreaterThan7000Exception(String message) {
        super(message);
   }
}