package OperatorsandforLoops;

public class BitwiseOperators {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 2;

//		Bitwise AND
		System.out.println( a & b );

//		Bitwise OR
		System.out.println( a | b );
		
//		XOR Operator
		System.out.println( a ^ b );

//		NOT Operator
		System.out.println( ~a );

//      This is Left Shift, Multiplication is done by 2 to the power printed
		System.out.println( a << 2 );
		
//		This is Right Shift, Division is done by 2 to the power printed
		System.out.println( a >> 2);
	}

}
