import java.util.Scanner;

public class mainClass {

	public static void main(String[] args) {
		
		  Scanner input = new Scanner(System.in);
		  
		  System.out.print("Enter the text you want to encrypt : ");
		  
		  String myText = input.next();
		  
		  input.close();
		  
		  rsaEncrypt rsa = new rsaEncrypt(myText); 
		  
		  System.out.println(rsa.cryptoText());

		  System.out.println(rsa.decryptoText());

	}

}
