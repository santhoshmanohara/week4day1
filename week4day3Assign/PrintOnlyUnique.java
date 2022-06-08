package week4day3Assign;

public class PrintOnlyUnique {
	public static void main(String[] args) {
		String in = "babub";
		char[] ch = new char[in.length()];
		System.out.println("the length is: "+in.length());
		for (int i = 0; i < in.length(); i++) {
            ch[i] = in.charAt(i);
              }
		for (char c : ch) {
            System.out.println("the character is "+c);
        }
		
	}
	

}
