// Aaron Prince Anu

class calculator {
    public static void main(String[] args) {
        
        // initialize vars
        int numerator1 = 0;
        int numerator2 = 0;
        int denominator1 = 0;
        int denominator2 = 0;

        // ask inputs
        System.out.println("\nWhat is your operator? Press \'$\' to exit");
        int operator = In.getChar();

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
        //TODO fix the mixed fraction whatever
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

            // mixed fractions
            if (numAddFinal > denAddLCM) {
                int wholeNumber = numAddFinal / denAddLCM;
                int subtract = wholeNumber * numAddFinal;
                int mix = denAddLCM - subtract;

                // output
                System.out.println("--> The final fraction is: " + wholeNumber + "" + mix + "/" + denAddLCM);
            } else if (numAddLCM1 <= denAddLCM) {
                //output
                System.out.println("--> The final fraction is: " + numAddFinal + "/" + denAddLCM);
            }

        } else if (denAdd1 == denAdd2){
            // the math part
            numAddFinal = numAdd1 + numAdd2;

            // output
            System.out.println("--> The final fraction is: " + numAddFinal + "/" + denAdd1);
        }
    }

    public static void subtraction(int numSub1, int denSub1, int numSub2, int denSub2) {
        System.out.println("\nYour equation is: (" + numSub1 + "/" + denSub1 + ") - (" + numSub2 + "/" + denSub2 + ") \n");

        int numSubFinal;

        //TODO fix mixed fraction

        // start math
        if (denSub1 != denSub2) {
            // make the denominator the same
            int denSubLCM = denSub1 * denSub2;
            int numSubLCM1 = numSub1 * denSub2;
            int numSubLCM2 = numSub2 * denSub1;

            // the math part
            numSubFinal = numSubLCM1 + numSubLCM2;

            // output
            System.out.println("--> The final fraction is: " + numSubFinal + "/" + denSubLCM);

        } else if (denSub1 == denSub2){
            // math
            numSubFinal = numSub1 + numSub2;

            // output
            System.out.println("--> The final fraction is: " + numSubFinal + "/" + denSub1);
        }
    }

    public static void multiplication(int numMul1, int denMul1, int numMul2, int denMul2) {
        System.out.println("\nYour equation is: (" + numMul1 + "/" + denMul1 + ") * (" + numMul2 + "/" + denMul2 + ") \n");
    }

    public static void division(int numDiv1, int denDiv1, int numDiv2, int denDiv2) {
        System.out.println("\nYour equation is: (" + numDiv1 + "/" + denDiv1 + ") / (" + numDiv2 + "/" + denDiv2 + ") \n");
    }
}