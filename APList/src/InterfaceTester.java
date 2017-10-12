
public class InterfaceTester {

	public static void main(String[] args) {

		GenericStack<String> names = new GenericStack<String>();
		GenericStack<Integer> nums = new GenericStack<Integer>();
		
		names.push("Bethany");
		names.push("Tamir");
		
		nums.push(9);

		System.out.println(names.toString());
		System.out.println(nums.toString());
	}

}
