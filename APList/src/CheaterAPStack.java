import java.util.ArrayList;

public class CheaterAPStack implements Stack{
private ArrayList<Integer> list;

public CheaterAPStack() {
	list = new ArrayList<Integer>();
}

	@Override
	public void push(int item) {
		list.add(item, 0);
	}

	@Override
	public int pop() {
		int temp = list.remove(0);
		return temp;
	}

	@Override
	public int size() {
		return list.size();
	}

}
