public class MyInteger {
	private int value;
	
	public MyInteger() {
		this.value = 1082;
	}
	
	public MyInteger(int value) {
		int lowNum = Integer.MIN_VALUE;
		int highNum = Integer.MAX_VALUE;
		
		if(lowNum <= value && value <= highNum) 
		{
			this.value = value;
		}
		else 
		{
			System.out.println("Error! Number is too big");
			System.exit(0);
		}
	}
	
	public int getValue() {
		return value;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
	
	public boolean isEven() {
		value = value % 2;
		if (value == 0)
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	
	public boolean isOdd() 
	{
		value = value % 2;
		if (value == 0)
		{
			return false;
		}
		else 
		{
			return true;
		}
	}
	
	public int add(MyInteger firstArg, MyInteger secondArg) {
		int sum = firstArg.value + secondArg.value;
		return sum;
	}

	@Override
	public String toString() {
		return "MyInteger [value=" + value + "]";
	}
	
}
