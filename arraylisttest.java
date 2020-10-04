public class arraylisttest
{
	public static void main(String[] args) {
		arraylist obj = new arraylist();
		obj.add(3);
		obj.add(7);
		//obj.add(3);
		//obj.add(6);
		//obj.add(2);
		//obj.add(9);
		obj.pop();
		//obj.pop();
		obj.resize();
		assert(obj.size() == 2);
		//System.out.println("toString " +obj.toString());
		//System.out.println("The number of elements in the new Array is " +a);
		System.out.println("The Size of new Array is " +obj.size());
	}
}