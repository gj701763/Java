package BitManipulation;

public class TypesBitWiseO {
    public static void main(String x[]) {

        // 1) Bitwise AND (&) 
        // Compares each bit of two numbers and returns 1 if both bits are 1, otherwise 0.
        int a = 5;  // Binary: 0101
        int b = 3;  // Binary: 0011
        int result = a & b;  // Binary: 0001 (Decimal: 1)
        System.out.printf("Result is : %d\n", result);

        // 2) Bitwise OR (|)
        // Compares each bit of two numbers and returns 1 if at least one of the bits is 1.
        int aor = 5;  // Binary: 0101
        int bor = 3;  // Binary: 0011
        int resultor = aor | bor;  // Binary: 0111 (Decimal: 7)
        System.out.printf("Result of or operator is %d\n", resultor);

        // 3) Bitwise XOR (^)
        // Compares each bit of two numbers and returns 1 if the bits are different, otherwise 0.
        int axor = 5;   // Binary: 0101
        int bxor = 3;   // Binary: 0011
        int resultxor = axor ^ bxor; // Binary: 0110 (Decimal: 6)
        System.out.printf("Result of xor operator is %d\n", resultxor);


        // 4) Bitwise Complement (~)
        // Inverts all the bits of a number (flips 0 to 1 and 1 to 0).

        int anor = 5;   // Binary : 0101
        int resultnor = ~anor;
        System.out.printf("Resutl of Nor operater is %d\n", resultnor);

// --------------------!!!!!!!!!!!!!!!!!!!!!!!-----------------------------------
        // 5) Left Shift (<<)
        //Shifts the bits of a number to the left by a specified number of positions, filling the rightmost bits with 0.
        int  aL= 5;  // Binary: 0101
        int resultL = aL << 1;  // Binary: 1010 (Decimal: 10)
        System.out.println(resultL);

        // 6) Right Shift (>>)
        // Shifts the bits of a number to the right by a specified number of positions, preserving the sign bit for signed numbers.
        int aR = 5;  // Binary : 0101
        int resultR = aR >> 1;    // // Binary: 0010 (Decimal: 2)
        System.out.println(resultR);

         
        // 7) Unsigned Right Shift (>>>)
        // Shifts the bits of a number to the right, filling the leftmost bits with 0 (ignores the sign bit).
        int aU = -5;  // Binary: 111...1011 (two's complement)
        int resultU = aU >>> 1;  // Binary: 011...1101 (Decimal: large positive value)
        System.out.println(resultU);


    }
}
