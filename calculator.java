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

        if (denominator1 == 0 || denominator2 == 0) {
            System.out.println("\nDenominators cannot be 0 \nExiting...\n");
            start = false;
            break;
        } else {
            ;
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
        
        // output initial equation
        System.out.println("\nYour equation is: (" + numAdd1 + "/" + denAdd1 + ") + (" + numAdd2 + "/" + denAdd2 + ") \n");

        int numAddFinal;

        // checks if it's -ve
        if(numAdd1 < 0 && denAdd1 < 0){
	        numAdd1 = Math.abs(numAdd1);
	        denAdd1 = Math.abs(denAdd1);
	    }
	    if(numAdd2 < 0 && denAdd2 < 0){
	        numAdd2 = Math.abs(numAdd2);
	        denAdd2 = Math.abs(denAdd2);
	    }
	    if(denAdd1 < 0 && numAdd1 > 0){
	        denAdd1 = Math.abs(denAdd1);
	        numAdd1 = numAdd1 - (numAdd1 * 2);
	    }
	    if(denAdd2 < 0 && numAdd2 > 0){
	        denAdd2 = Math.abs(denAdd2);
	        numAdd2 = numAdd2 - (numAdd2 * 2);
	    }

        // start math
        if (denAdd1 != denAdd2) {
            // make the denominator the same
            int denAddLCM = denAdd1 * denAdd2;
            int numAddLCM1 = numAdd1 * denAdd2;
            int numAddLCM2 = numAdd2 * denAdd1;

            // the math part
            numAddFinal = numAddLCM1 + numAddLCM2;
            
            // mixed fractions
            if (Math.abs(numAddFinal) >= denAddLCM) {
                int wholeNumber = numAddFinal / denAddLCM;
                int numMixed = numAddFinal % denAddLCM;

                // 0 mixed fractions
                if (numMixed == 0) {
                    int correction = wholeNumber / denAdd1;
                    System.out.println("--> The final fraction is " + correction + "/" + denAdd1);
                } else {
                    // output
                    System.out.println("--> The final fraction is: " + wholeNumber + " " + numMixed + "/" + denAddLCM);
                }

            } else if (numAddLCM1 <= denAddLCM) {
                //output
                System.out.println("--> The final fraction is: " + numAddFinal + "/" + denAddLCM);
            }

        } else if (denAdd1 == denAdd2){
            // the math part
            numAddFinal = numAdd1 + numAdd2;

            // mixed fractions
            if (Math.abs(numAddFinal) >= denAdd1) {
                int wholeNumber = numAddFinal / denAdd1;
                int numMixed = numAddFinal % denAdd1;

                // output
                System.out.println("--> The final fraction is: " + wholeNumber + " " + numMixed + "/" + denAdd1);
            } else if (numAddFinal <= denAdd1) {
                //output
                System.out.println("--> The final fraction is: " + numAddFinal + "/" + denAdd1);
            }
        }
    }

    public static void subtraction(int numSub1, int denSub1, int numSub2, int denSub2) {
       
        // output initial equation
        System.out.println("\nYour equation is: (" + numSub1 + "/" + denSub1 + ") - (" + numSub2 + "/" + denSub2 + ") \n");

        int numSubFinal;

        // checks if it's -ve
        if(numSub1 < 0 && denSub1 < 0){
	        numSub1 = Math.abs(numSub1);
	        denSub1 = Math.abs(denSub1);
	    }
	    if(numSub2 < 0 && denSub2 < 0){
	        numSub2 = Math.abs(numSub2);
	        denSub2 = Math.abs(denSub2);
	    }
	    if(denSub1 < 0 && numSub1 > 0){
	        denSub1 = Math.abs(denSub1);
	        numSub1 = numSub1 - (numSub1 * 2);
	    }
	    if(denSub2 < 0 && numSub2 > 0){
	        denSub2 = Math.abs(denSub2);
	        numSub2 = numSub2 - (numSub2 * 2);
	    }

        // start math
        if (denSub1 != denSub2) {
            // make the denominator the same
            int denSubLCM = denSub1 * denSub2;
            int numSubLCM1 = numSub1 * denSub2;
            int numSubLCM2 = numSub2 * denSub1;

            // the math part
            numSubFinal = numSubLCM1 + numSubLCM2;

            // mixed fractions
            if (Math.abs(numSubFinal) >= denSubLCM) {
                int wholeNumber = numSubFinal / denSubLCM;
                int numMixed = numSubFinal % denSubLCM;

                // 0 mixed fractions
                if (numMixed == 0) {
                    int correction = wholeNumber / denSub1;
                    System.out.println("--> The final fraction is " + correction + "/" + denSub1);
                } else {
                    // output
                    System.out.println("--> The final fraction is: " + wholeNumber + " " + numMixed + "/" + denSubLCM);
                }

            } else if (numSubFinal <= denSubLCM) {
                //output
                System.out.println("--> The final fraction is: " + numSubFinal + "/" + denSubLCM);
            }
            
        } else if (denSub1 == denSub2){
            // math
            numSubFinal = numSub1 - numSub2;

            // mixed fractions
            if (Math.abs(numSubFinal) >= denSub1) {
                int wholeNumber = numSubFinal / denSub1;
                int numMixed = numSubFinal % denSub1;

                // 0 mixed fraction 
                if (numMixed == 0) {
                    int correction = wholeNumber / denSub1;
                    System.out.println("--> The final fraction is " + correction + "/" + denSub1);
                } else {
                    // output
                System.out.println("--> The final fraction is: " + wholeNumber + " " + numMixed + "/" + denSub1);
                }

            } else if (numSubFinal <= denSub1) {
                // output
                System.out.println("--> The final fraction is: " + numSubFinal + "/" + denSub1);
            }
        }
    }

    public static void multiplication(int numMul1, int denMul1, int numMul2, int denMul2) {
        
        // output initial equation
        System.out.println("\nYour equation is: (" + numMul1 + "/" + denMul1 + ") * (" + numMul2 + "/" + denMul2 + ") \n");

        // multiply
        int numMulFinal = numMul1 * numMul2;
        int denMulFinal = denMul1 * denMul2;
        
        // checks
        if(numMulFinal < 0 && denMulFinal < 0){
        numMulFinal = Math.abs(numMulFinal);
	        denMulFinal = Math.abs(denMulFinal);
	    }
	    if(denMulFinal < 0 && numMulFinal > 0){
	        denMulFinal = Math.abs(denMulFinal);
	        numMulFinal = numMulFinal - (numMulFinal * 2);
	    }

        //mixed fractions
        if (Math.abs(numMulFinal) >= denMulFinal) {
            int wholeNumber = numMulFinal / denMulFinal;
            int numMixed = numMulFinal % denMulFinal;

            // 0 mixed fractions
            if (numMixed == 0) {
                int correction = wholeNumber / denMulFinal;
                System.out.println("--> The final fraction is " + correction + "/" + denMulFinal);
            } else {
                //output
                System.out.println("--> The final fraction is: " + wholeNumber + " " + numMixed + "/" + denMulFinal);
            }
        
        } else {
            //output
            System.out.println("--> The final fraction is: " + numMulFinal + "/" + denMulFinal);
        }
    }

    public static void division(int numDiv1, int denDiv1, int numDiv2, int denDiv2) {
        // output initial equation
        System.out.println("\nYour equation is: (" + numDiv1 + "/" + denDiv1 + ") / (" + numDiv2 + "/" + denDiv2 + ") \n");

        // divide
        int numDivFinal = numDiv1 * denDiv2; 
        int denDivFinal = denDiv1 * numDiv2;

        //checks
        if(numDivFinal < 0 && denDivFinal < 0){
            numDivFinal = Math.abs(numDivFinal);
                denDivFinal = Math.abs(denDivFinal);
            }
            if(denDivFinal < 0 && numDivFinal > 0){
                denDivFinal = Math.abs(denDivFinal);
                numDivFinal = numDivFinal - (numDivFinal * 2);
            }
    

        // mixed fractions
        if (Math.abs(numDivFinal) >= denDivFinal) {
            int wholeNumber = numDivFinal / denDivFinal;
            int numMixed = numDivFinal % denDivFinal;

            // 0 mixed fractions
            if (numMixed == 0) {
                int correction = wholeNumber / denDivFinal;
                System.out.println("--> The final fraction is " + correction + "/" + denDivFinal);
            } else {
                //output
                System.out.println("--> The final fraction is: " + wholeNumber + " " + numMixed + "/" + denDivFinal);
            }

        } else {
            //output
            System.out.println("--> The final fraction is: " + numDivFinal + "/" + denDivFinal);
        }
    }
}