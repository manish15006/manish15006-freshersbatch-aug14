package assignment3;

public class stringbuffer {

	public static void main(String[] args) {
		// StringBuffer
		//- append method
		StringBuffer str= new StringBuffer();
		str.append("StringBuffer");
		str.append("is a peer class of String");
		str.append("that provides much of");
		str.append("the functionality of strings");
		System.out.println("append method: "+str);
		
		//-Insert method
		StringBuffer str1=new StringBuffer("It is used to _ at the specified index position");
		str1.insert(15,"insert text");
		System.out.println("inserting method: "+str1);
		
		//-reverse method
		
		StringBuffer str2=new StringBuffer("This method returns the reversed object on which it was called");
		str2.reverse();
		System.out.println("Reverse method: "+str2);
		
	}

}
