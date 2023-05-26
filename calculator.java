// Aaron Prince Anu

class calculator {

    // global vars
    static char operator;
    static int numerator1;
    static int denominator1;
    static int numerator2;
    static int denominator2;

    public static void main(String[] args) {
        
        // ask inputs
        System.out.println("\nWhat is your operator? Press \'$\' to exit");
        operator = In.getChar();

        // if '$' is entered
        if (operator == '$') {
            System.out.println("\nExiting...\n");
        } else {
            System.out.println("\nWhat is your first numerator?");
            numerator1 = In.getInt();
            System.out.println("\nWhat is your first denominator?");
            denominator1 = In.getInt();
            System.out.println("\nWhat is your second numerator?");
            numerator2 = In.getInt();
            System.out.println("\nWhat is your second denominator");
            denominator2 = In.getInt();
        }

        if (operator == '+') {
            addition(numerator1, denominator1, numerator2, denominator2);
        } else if (operator == '-') {
            subtraction(numerator1, denominator1, numerator2, denominator2);
        } else if (operator == '*'){
            multiplication(numerator1, denominator1, numerator2, denominator2);
        } else if (operator == '/'){
            division(numerator1, denominator1, numerator2, denominator2);
        }
    }

    public static void addition(int numAdd1, int denAdd1, int numAdd2, int denAdd2) {
        
        int numAddFinal;
        
        // output initial equation
        System.out.println("\nYour equation is: (" + numAdd1 + "/" + denAdd1 + ") + (" + numAdd2 + "/" + denAdd2 + ") \n");

        // start math
        if (denAdd1 != denAdd2) {
            // make the denominator the same
            int denAddLCM = denAdd1 * denAdd2;
            int numAddLCM1 = numAdd1 * denAdd2;
            int numAddLCM2 = numAdd2 * denAdd1;

            // the math part
            numAddFinal = numAddLCM1 + numAddLCM2;

            //output
            System.out.println("--> The final fraction is: " + numAddFinal + "/" + denAddLCM);

        } else {
            // the math part
            numAddFinal = numAdd1 + numAdd2;

            // output
            System.out.println("--> The final fraction is: " + numAddFinal + "/" + denAdd1);
        }
    }

    public static void subtraction(int numSub1, int denSub1, int numSub2, int denSub2) {
        System.out.println("\nYour equation is: (" + numSub1 + "/" + denSub1 + ") - (" + numSub2 + "/" + denSub2 + ") \n");
    }

    public static void multiplication(int numMul1, int denMul1, int numMul2, int denMul2) {
        System.out.println("\nYour equation is: (" + numMul1 + "/" + denMul1 + ") * (" + numMul2 + "/" + denMul2 + ") \n");
    }

    public static void division(int numDiv1, int denDiv1, int numDiv2, int denDiv2) {
        System.out.println("\nYour equation is: (" + numDiv1 + "/" + denDiv1 + ") / (" + numDiv2 + "/" + denDiv2 + ") \n");
    }
}