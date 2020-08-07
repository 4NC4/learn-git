public class Animal {
	public static void main(String[] args) {
		System.out.print("I am a " + args[0]);
		System.out.print("and I say " + saySomething(args[0]));
	}
	
	private static String saySomething(String animal) {
		if(animal.equals("dog")) {
			return "woof";
		} else {
			return "????";
		}
	}
}