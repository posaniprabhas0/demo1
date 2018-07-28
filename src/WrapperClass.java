
public class WrapperClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=5;
Integer i=new Integer(a);                     //It is called Boxing
Integer j=i;                                  //Assigning primitive value directly to object. so it is called auto boxing

Integer k=j.intValue();                      //getting primitive value from object is called unboxing

Integer M=k;                                 //Auto unboxing
	}

}
