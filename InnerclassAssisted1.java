package simplilearnphase1;

public class InnerclassAssisted1 {

	 private String msg="Welcome to Java"; 
	 
	 class Inner{  
	  void hello(){System.out.println(msg+", Let us start learning Inner Classes");}  
	 }  


	public static void main(String[] args) {

		InnerclassAssisted1 obj=new InnerclassAssisted1();
		InnerclassAssisted1.Inner in=obj.new Inner();  
		in.hello();  
	}
}


public class InnerclassAssisted2 {

private String msg="Inner Classes";

void display(){  
	 class Inner{  
		 void msg(){
			 System.out.println(msg);
		 }  
 }  
 
 Inner l=new Inner();  
 l.msg();  
}  


public static void main(String[] args) {
	InnerlassAssisted2  ob=new InnerclassAssisted2 ();  
	ob.display();  
	}
}


//anonymous inner class
abstract class AnonymousInnerClass {
	   public abstract void display();
	}


	public class InnerclassAssisted3 {

	public static void main(String[] args) {
	AnonymousInnerClass i = new AnonymousInnerClass() {

	         public void display() {
	            System.out.println("Anonymous Inner Class");
	         }
	      };
	      i.display();
	   }
	}
