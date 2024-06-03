public class BinaryToDecimal {

    public static int convert(String binaryString) {
      int decimal = 0;
      int base = 1;
  
      // Iterate through the binary string in reverse order (right to left)
      for (int i = binaryString.length() - 1; i >= 0; i--) {
        char digitChar = binaryString.charAt(i);
  
        // Check for invalid digits (not 0 or 1)
        if (digitChar != '0' && digitChar != '1') {
          throw new IllegalArgumentException("Invalid binary string. Please enter only 0s and 1s.");
        }
  
        // Extract the digit value (convert char to int)
        int digit = digitChar - '0';
  
        // Add the digit's value to the decimal representation considering its base position
        decimal += digit * base;
  
        // Update the base for the next digit
        base *= 2;
      }
  
      // Return the calculated decimal value
      return decimal;
    }
  
    public static void main(String[] args) {
      String binaryString;
  
      System.out.print("Enter a binary number: ");
  
      try {
        binaryString = new Scanner(System.in).nextLine();
        int decimal = convert(binaryString);
        System.out.println("Decimal equivalent: " + decimal);
      } catch (IllegalArgumentException e) {
        System.err.println(e.getMessage());
      }
    }
  }
  