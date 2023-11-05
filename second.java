package Java;

public class second{
	   int a=10;
	   int b=70;
	     void add (){
	             System.out.println(a+b);
	          }
	     void demo1() {
	    	 System.out.println("Manual Testing");
	     }
	     void demo2() {
	    	 System.out.println("Automation testing");
	     }
  
	  public static void main (String[] args) {
		  second a=new second();
		  Selenium s=new Selenium();
	      a.add();
	      a.demo1();
	      a.demo2();   
	      s.demo3();
	   }
	}
class Selenium {
    void demo3() {
   	 System.out.println("Selenium Web Driver started");
    }
}
    
 