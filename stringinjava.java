package Java;

public class stringinjava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Bala";
		s=s.concat(" Prasanna"); // here s is referring to prasanna so it prints bala prasanna
		 s.concat("balaa");//here nothing is referring 
		System.out.println(s);
		
		StringBuffer sb= new StringBuffer("suresh");
		sb.append(" ramesh");
		sb.append(" how are you");
		System.out.println(sb);
		
		String s1="hello!";
		s1.concat(" are you there");
		s1=s1.concat(" how are you doing?"); //referring
		s1.concat(" hope you are well");
		s1=s1.concat(" what are you doing?");//referring
		System.out.println(s1);
		
		StringBuffer sb1=new StringBuffer("hey");
		sb1.append(" hai");
		sb1.append(" what is going on");
		System.out.println(sb1);

	}

}
