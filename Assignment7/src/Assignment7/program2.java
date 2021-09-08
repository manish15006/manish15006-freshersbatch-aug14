package Assignment7;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.LOCAL_VARIABLE,ElementType.CONSTRUCTOR,ElementType.TYPE,ElementType.METHOD})
@interface Info{
	int authorid() default 0 ;
	String date() default "00-00-0000";
	String time() default "00:00";
	int version() default 0;
	
}
@Info(
		authorid=1,
		date="01-02-2001",
		time="10:30",
		version=07
		)
class developers{
	
}
public class program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class<developers>obj=developers.class;
		Annotation[] annotations=obj.getAnnotations();
		for(Annotation annotation:annotations) {
			System.out.println(annotation);
		}
	}

}
	/*
	int developerid;
	String Date;
	String Time;
	int version;
	public developers(int developerid, String date, String time, int version) {
		super();
		this.developerid = developerid;
		Date = date;
		Time = time;
		this.version = version;
	}
	
	developers d1=new developers(01,"2-12-2001","10:30",1);
	developers d2=new developers(02,"2-12-2002","11:30",2);
	developers d3=new developers(03,"2-12-2003","01:30",3);
	developers d4=new developers(04,"2-12-2004","02:30",4);
	*/
	




