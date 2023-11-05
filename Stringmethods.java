package Java;

public class Stringmethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                String sa="Prasanna";
                String sb="thinking";
                System.out.println(sa);
                System.out.println(sa.charAt(5));
                sa=sa.concat(" Nambula");
                System.out.println(sa);
                String sc="think";
                System.out.println(sb.contains(sc));
                System.out.println(sb.equals(sc));
                String sd="THINK";
                System.out.println(sc.equalsIgnoreCase(sd));
                System.out.println(sa.length());  //space also counts
	}

}
