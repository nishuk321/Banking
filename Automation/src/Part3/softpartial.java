package Part3;

import org.testng.annotations.Test;

public class softpartial {
	@Test
	public void softassert() {
		
		String s="shiva";
		String s1="shi";
		
		softpartial partial=new softpartial();
		partial.equals(s.contains(s1));
		System.out.println("Rockit");}}
