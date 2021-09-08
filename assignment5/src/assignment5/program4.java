package assignment5;


public class program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pair<String,String> myObj=new pair<>();
		myObj.setKey("gudochari");
		myObj.setValue("number 01");
		System.out.println("key: "+myObj.getKey()+"\n"+"value: "+myObj.getValue());
		System.out.println("-------------------------------");
		pair<String,java.util.Date>myobj=new pair<>();
		myobj.setKey("Today is");
		myobj.setValue(new java.util.Date());
		System.out.println("key: "+myobj.getKey()+"\n"+"value: "+myobj.getValue());
		System.out.println("\nProgram is end");
	}

}
