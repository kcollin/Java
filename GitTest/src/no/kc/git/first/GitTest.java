package no.kc.git.first;

public class GitTest {

	public static void main(String[] args) {
		
	    System.out.println("Git is fun");
	    System.out.println("Git is fun too.....");
	    
	    Display d = new Display();
	    d.cooperation();

	    Test t = new Test();
	    t.test();
	    
	    System.out.println("More Fixes done in TestErrorFix branch");
	    
	    TestConflict t1 = new TestConflict();
	    t1.conflict_too();
	    
	    System.out.println("Changing two different projects, does it work ?");    
	}

}
