public class Main {
	public static void main(String[] args) {
		MyInteger integer = new MyInteger(3);
		int sum = integer.add(new MyInteger(3), new MyInteger(2));
		boolean value = integer.isEven();
		
		System.out.println(sum);
		System.out.println(value);
	}
}
