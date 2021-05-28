public class Rational {

    private int numerator;
    private int denominator;

    // constructors

    public Rational(int numerator) {
        // Your code here
        this.numerator = numerator;
        this.denominator = 1;
    }

    public Rational(int numerator, int denominator) {
        // Your code here
        if (denominator < 0) {
            denominator = denominator * -1;
            numerator = numerator * -1;
        }

        this.numerator = numerator;
        this.denominator = denominator;
        reduce();

    }

    // getters

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    // instance methods

    public Rational plus(Rational other) {
        // Your code here
       return new Rational(((this.numerator* other.denominator)+(other.numerator * this.denominator)), other.denominator*this.denominator);
    }

    public static Rational plus(Rational a, Rational b) {
        // Your code here
        return a.plus(b);
    }

    // Transforms this number into its reduced form

    private void reduce() {
        // Your code here
        if (numerator == 0) {
            denominator = 1;
        } else {
            int c = gcd(Math.abs(numerator), denominator);
            numerator = numerator / c;
            denominator = denominator / c;

        }
    }

        // Euclid's algorithm for calculating the greatest common divisor
        private int gcd ( int a, int b){
            // Note that the loop below, as-is, will time out on negative inputs.
            // The gcd should always be a positive number.
            // Add code here to pre-process the inputs so this doesn't happen.

            while (a != b) {
                if (a > b) {
                    for (int i = b; i > 0; i--) {
                        if (a % i == 0 && b % i == 0) {
                            return i;
                        }
                    }
                } else{
                    for (int j = a; j > 0; j--) {
                        if (a % j == 0 && b % j == 0){
                            return j;
                        }
                    }
                }
            }
            return 0;
        }

        public int compareTo (Rational other){
            // Your code here
            return (other.denominator * numerator) - (other.numerator * denominator);
        }

        public boolean equals (Rational other){
            // Your code here
            return (numerator == other.numerator) && (denominator == other.denominator);
        }

        public String toString () {
            String result;
            if (denominator == 1) {
                // Your code here
                result = Integer.toString(numerator);
            } else {
                // Your code here
                result = numerator + "/" + denominator;
            }
            return result;
        }

}
