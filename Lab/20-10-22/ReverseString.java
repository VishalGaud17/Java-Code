package Array;

public class ReverseString {

	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.print("Type a Word/Sentence : ");
		String a = sc.nextLine();
		char[] array= a.toCharArray();
		System.out.println();
		for(int i=array.length-1;i>=0;i--) {
			System.out.print(array[i]);
		}
	}
}
