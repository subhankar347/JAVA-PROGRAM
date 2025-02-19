public class AddBinaryStrings {
    public static void main(String[] args) {
        
        String binary1 = "1101";  
        String binary2 = "1011";  
        String result = addBinary(binary1, binary2);

    
        System.out.println("Sum of " + binary1 + " and " + binary2 + " is: " + result);
    }


    public static String addBinary(String a, String b) {
        
        int num1 = Integer.parseInt(a, 2);
        int num2 = Integer.parseInt(b, 2);


        int sum = num1 + num2;

        return Integer.toBinaryString(sum);
    }
}
