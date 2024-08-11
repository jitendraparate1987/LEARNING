package Mathematical;

public class AbstractDemoExample extends AbstractDemo{

	
	@Override
	public void test2() {
		System.out.println("Test2");
		
	}

	@Override
	public void test3() {
		System.out.println("Test3");
		
		
	}
	
	public static void main(String[] args) {
		
		AbstractDemoExample t = new AbstractDemoExample();
		t.test1();
		t.test2();
		t.test3();
		
		
	}
	

}
