// Aaron Prince Anu

class calculator {

    // global vars
    static char operator;
    static int numerator1;
    static int denominator1;
    static int numerator2;
    static int denominator2;

    public static void main(String[] args) {
        
        //ask inputs
        System.out.println("What is your operator?");
        operator = In.getChar();
        System.out.println("What is your first numerator?");
        numerator1 = In.getInt();
        System.out.println("What is your first denominator?");
        denominator1 = In.getInt();
        System.out.println("What is your second numerator?");
        numerator2 = In.getInt();
        System.out.println("What is your second denominator");
        denominator2 = In.getInt();

        if (operator == '+') {
            
        } else {
            
        }
    }
}