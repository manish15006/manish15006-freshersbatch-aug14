package assignment3;

public class program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Java String pool refers to collection of Strings which are stored in heap memory";
		//lowercase
		
		System.out.println(str.toLowerCase());
		//uppercase
		
		System.out.println(str.toUpperCase());
		
		//replace 'a' character in string with $ sign
		System.out.println(str.replace('a', '$'));
		//contains
		System.out.println(str.contains("collection"));
		//check
		System.out.println(str.matches("java string pool refers to collection of strings which are stored in heap memory"));
		//checking equals
		System.out.println(str.equals("java string pool refers to collection of strings which are stored in heap memory"));
	}

}
