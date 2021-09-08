package assignment3;

public class stringbuilder {

	public static void main(String[] args) {
		// stringbuilder
		StringBuilder str= new StringBuilder();
		str.append("StringBuffer");
		str.append("is a peer class of String");
		str.append("that provides much of");
		str.append("the functionality of strings");
		System.out.println("append method: "+str);
		
		//-Insert method
		StringBuilder str1=new StringBuilder("It is used to _ at the specified index position");
		str1.insert(15,"insert text");
		System.out.println("inserting method: "+str1);
		
		//-reverse method
		
		StringBuilder str2=new StringBuilder("This method returns the reversed object on which it was called");
		str2.reverse();
		System.out.println("Reverse method: "+str2);
	}

}
