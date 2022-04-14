public class JavaHelloWorldProgram {

	public static void main(String args[]){
		System.out.println("Hello World");
		String str = "111 22 2";
		countSpaces(str);
	}
	
	static countSpaces(String string) {
		int spaceCount = INPUT_STRING.replaceAll("[^ ]", "").length();
		System.out.printlin(spaceCount);
	}
}
