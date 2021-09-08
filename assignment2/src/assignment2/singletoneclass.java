package assignment2;

public class singletoneclass {
	private static singletoneclass singletoneclass=null;
	public String text;
	private singletoneclass() {
		text="iam singletone class";
	}
	public static singletoneclass getInstance(){
		if (singletoneclass==null) {
			singletoneclass=new singletoneclass();
		}
		return singletoneclass;
	}
}
