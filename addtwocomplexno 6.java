public class AddComplexNumbers {
    public static void main(String[] args) {
        
        Complex num1 = new Complex(3, 4);  
        Complex num2 = new Complex(1, 2);  
        Complex sum = num1.add(num2);

        System.out.println("Sum of " + num1 + " and " + num2 + " is: " + sum);
    }
}


class Complex {
    
    private double real;
    private double imaginary;

    
    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    
    public Complex add(Complex other) {
        double realPart = this.real + other.real;
        double imaginaryPart = this.imaginary + other.imaginary;
        return new Complex(realPart, imaginaryPart);
    }

    public String toString() {
        return real + " + " + imaginary + "i";
    }
}
