// Aaron Prince Anu
class calculator {
    public static void main(String[] args) {
        
        // initialize vars
        int numerator1 = 0, numerator2 = 0, denominator1 = 0, denominator2 = 0;
        boolean start = true;

        //loop
        while (start) {
            // ask inputs
        System.out.println("\nWhat is your operator? Press \'$\' to exit");
        int operator = In.getChar();

        // if '$' is entered
        if (operator == '$') {
            System.out.println("\nExiting...\n");
            start = false;
            break;
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
            
            // mixed fractions
            if (numAddFinal > denAddLCM) {
                int wholeNumber = numAddFinal / denAddLCM;
                int numMixed = numAddFinal % denAddLCM;

                // output
                System.out.println("--> The final fraction is: " + wholeNumber + " " + numMixed + "/" + denAddLCM);
            } else if (numAddLCM1 <= denAddLCM) {
                //output
                System.out.println("--> The final fraction is: " + numAddFinal + "/" + denAddLCM);
            }

        } else if (denAdd1 == denAdd2){
            // the math part
            numAddFinal = numAdd1 + numAdd2;

            // mixed fractions
            if (numAddFinal > denAdd1) {
                int wholeNumber = numAddFinal / denAdd1;
                int numMixed = numAddFinal % denAdd1;

                // output
                System.out.println("--> The final fraction is: " + wholeNumber + " " + numMixed + "/" + denAdd1);
            } else if (numAddFinal <= denAdd1) {
                //output
                System.out.println("--> The final fraction is: " + numAddFinal + "/" + denAdd1);
            }
            // output
            System.out.println("--> The final fraction is: " + numAddFinal + "/" + denAdd1);
        }
    }

    public static void subtraction(int numSub1, int denSub1, int numSub2, int denSub2) {
        System.out.println("\nYour equation is: (" + numSub1 + "/" + denSub1 + ") - (" + numSub2 + "/" + denSub2 + ") \n");

        int numSubFinal;

        // start math
        if (denSub1 != denSub2) {
            // make the denominator the same
            int denSubLCM = denSub1 * denSub2;
            int numSubLCM1 = numSub1 * denSub2;
            int numSubLCM2 = numSub2 * denSub1;

            // the math part
            numSubFinal = numSubLCM1 + numSubLCM2;

            // mixed fractions
            if (numSubFinal > denSubLCM) {
                int wholeNumber = numSubFinal / denSubLCM;
                int numMixed = numSubFinal % denSubLCM;

                // output
                System.out.println("--> The final fraction is: " + wholeNumber + " " + numMixed + "/" + denSubLCM);
            } else if (numSubFinal <= denSubLCM) {
                //output
                System.out.println("--> The final fraction is: " + numSubFinal + "/" + denSubLCM);
            }
            
        } else if (denSub1 == denSub2){
            // math
            numSubFinal = numSub1 + numSub2;

            // mixed fractions
            if (numSubFinal > denSub1) {
                int wholeNumber = numSubFinal / denSub1;
                int numMixed = numSubFinal % denSub1;

                // output
                System.out.println("--> The final fraction is: " + wholeNumber + " " + numMixed + "/" + denSub1);
            } else if (numSubFinal <= denSub1) {
                //output
                System.out.println("--> The final fraction is: " + numSubFinal + "/" + denSub1);
            }
        }
    }

    public static void multiplication(int numMul1, int denMul1, int numMul2, int denMul2) {
        System.out.println("\nYour equation is: (" + numMul1 + "/" + denMul1 + ") * (" + numMul2 + "/" + denMul2 + ") \n");

        int numMulFinal = numMul1 * numMul2;
        int denMulFinal = denMul1 * denMul2;

        //mixed fractions
        if (numMulFinal > denMulFinal) {
            int wholeNumber = numMulFinal / denMulFinal;
            int numMixed = numMulFinal % denMulFinal;

            //output
            System.out.println("--> The final fraction is: " + wholeNumber + " " + numMixed + "/" + denMulFinal);

        } else {
            //output
            System.out.println("--> The final fraction is: " + numMulFinal + "/" + denMulFinal);
        }
    }

    public static void division(int numDiv1, int denDiv1, int numDiv2, int denDiv2) {
        System.out.println("\nYour equation is: (" + numDiv1 + "/" + denDiv1 + ") / (" + numDiv2 + "/" + denDiv2 + ") \n");

        int numDivFinal = numDiv1 * denDiv2; 
        int denDivFinal = denDiv1 * numDiv2;

        //mixed fractions
        if (numDivFinal > denDivFinal) {
            int wholeNumber = numDivFinal / denDivFinal;
            int numMixed = numDivFinal % denDivFinal;

            //output
            System.out.println("--> The final fraction is: " + wholeNumber + " " + numMixed + "/" + denDivFinal);

        } else {
            //output
            System.out.println("--> The final fraction is: " + numDivFinal + "/" + denDivFinal);
        }
    }
}