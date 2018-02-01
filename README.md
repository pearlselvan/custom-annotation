# custom-annotation



@MobileTest(name="sr")
class Custom {

		static AppiumRunner runner = new AppiumRunner();
	public static void main(String[] args) {
		System.out.println("Hello");
		runner.run();
	}
	// @MobileTest
	public static void m1(){


	}
}

Run this code : java -cp custom.jar Custom.java 

Please generage custom.jar from the gir project