import java.util.Arrays;

public class GenericStack<E> {
	private Object[] list;
	private int nextFree;

	public GenericStack() {
		this(10);
	}

	public GenericStack(int initialCapaity) {
		list = new Object[10];
		nextFree = 0;
	}

	public void push(E item) {
		list[nextFree] = item;
		if (nextFree == list.length - 1) {
			Object[] newList = new Object[list.length * 2];
			for (int i = 0; i < list.length; i++) {
				newList[i] = list[i];
			}
			list = newList;
		}
		nextFree++;
		// int[] temp = new int[list.length + 1];
		// for (int i = 0; i < list.length; i++) {
		// temp[i] = list[i];
		// }
		// temp[temp.length - 1] = item;
		// list = temp;
	}

	public E pop() {
		Object num = 0;
		if (nextFree > 0) {
			num = list[nextFree - 1];
			list[nextFree - 1] = 0;
			nextFree--;
		} else {
			num = list[0];
			list[0] = 0;
		}

		return (E) num;
		// int[] temp = new int[list.length - 1];
		// int tempo;
		// for (int i = 0; i < temp.length; i++) {
		// temp[i] = list[i];
		// }
		// tempo = list[temp.length];
		// list = temp;
		// return tempo;
	}

	public int size() {
		return nextFree + 1;
	}

	@Override
	public String toString() {
		return Arrays.toString(list);
	}

}
