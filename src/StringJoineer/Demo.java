package StringJoineer;

import java.util.StringJoiner;

public class Demo {

	public static void main(String[] args) {
		
	//	StringJoiner s=new StringJoiner(",");
		StringJoiner s=new StringJoiner("<<<>>>>","->","<-");
		s.add("Anmol");
		s.add("Palle");
		s.add("BackendDeveloper");
		s.add("Pune");
		
		System.out.println(s);
		
	}

}
