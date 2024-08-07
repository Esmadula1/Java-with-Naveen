package day14;

public class PassingParamstoMainMethod {

	public static void main(String[] args) {
		//how to find number of elements in array?
		//Run as run configuration then argument then type into params
		System.out.println(args.length);
		for(String value:args) {
			System.out.println(value);
		}

	}

}
