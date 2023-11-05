package Java;

public class Student {
	
	//create method to verify number is even or odd, create method to check age >18
	
	String name;
	int id;
	String department;
	float fee;
	int Class;

     public static void main(String[] args) {
    	  Student st= new Student();
    	  Student st1=new Student();
    	  st.name="Bala";
    	  st.id=400;
    	  st.department= "Physics";
    	  st.fee=17849.637f;
    	  st.Class=8;
    	  st1.name="ram";
    	  st1.Class=9;
    	  System.out.println(st.name);
     }
}

