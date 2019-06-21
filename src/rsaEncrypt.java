// Author : Isa DUVAN

import java.math.BigInteger;

import java.util.Random;

public class rsaEncrypt {

	private static String message;
	private static BigInteger nBig;
	private static BigInteger asciiBig;
	private static BigInteger eBig;
	private static BigInteger dBig;
	private static char[] myArray;
	private static char[] cryptoText;

	@SuppressWarnings("static-access")
	
	public rsaEncrypt(String message) {

		this.message = message;

		myArray = message.toCharArray();
		
		// p and q must be prime number. You can change it other prime numbers.
		
		int p = 59;
		int q = 61;
		int n = p * q;
		int totientN = (p - 1) * (q - 1);
		int e;
		Random random = new Random();
		do {

			e = random.nextInt(totientN);

		} while (!isPrime(e));
		
		int d = dCalculate(totientN, e);

		nBig = BigInteger.valueOf(n);
		eBig = BigInteger.valueOf(e);
		dBig = BigInteger.valueOf(d);
	}

	private static boolean isPrime(int e) {

		for (int i = 2; i < e; i++) {

			if (e % i == 0)
				return false;
		}

		return true;
	}

	

	private static int dCalculate(int totient, int e) {

		for (int k = 1; k < totient; k++) {

			if (((totient * k + 1) % e) == 0) {

				return (((totient * k) + 1) / e);
			}
		}

		return 0;
	}

	private static BigInteger dCalculate2(BigInteger nBig, BigInteger ascii, BigInteger e) {

		BigInteger asciiExpE = BigInteger.valueOf(1);

		for (int i = 1; i <= e.intValue(); i++) {

			asciiExpE = ascii.multiply(asciiExpE);
		}

		BigInteger c = BigInteger.valueOf(1);

		c = asciiExpE.mod(nBig);

		return c;
	}

	public char[] cryptoText() {

		cryptoText = new char[myArray.length];

		int cryptoIndex = 0;

		for (char letter : myArray) {

			int ascii = (int) letter;

			asciiBig = BigInteger.valueOf(ascii);

			BigInteger c = dCalculate2(nBig, asciiBig, eBig);

			cryptoText[cryptoIndex++] = (char) c.intValue();
		}

		return cryptoText;

	}

	public char[] decryptoText() {

		char[] decryptoText = new char[myArray.length];

		int decryptoIndex = 0;

		for (char letter : cryptoText) {

			BigInteger c = BigInteger.valueOf((int) letter);

			BigInteger de = dCalculate2(nBig, c, dBig);

			decryptoText[decryptoIndex++] = (char) de.intValue();

		}

		return decryptoText;

	}
}
