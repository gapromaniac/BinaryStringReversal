package com.string.binaryreversal;

public class BinaryStringReversal {

	public static void main(String[] args) {		
		System.out.println(binaryReversal("244"));

	}

	private static String binaryReversal(String str)
	{
		String result = str;
		int bitMultiplier = 8;
		
		String binaryString = Integer.toBinaryString(Integer.parseInt(result));
				
		String formatSpecifier = "%" + bitMultiplier + "s";
				
		result = String.format(formatSpecifier, binaryString).replace(' ', '0');
				
		int reversedDecimalValue = Integer.parseInt(new StringBuilder(result).reverse().toString(), 2);

		result = String.valueOf(reversedDecimalValue);
		
		return result;
	}
}
