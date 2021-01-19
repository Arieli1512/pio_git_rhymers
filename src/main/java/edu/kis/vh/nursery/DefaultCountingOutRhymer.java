package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	private static final int ARRAY_SIZE = 12;
	private static final int EMPTY_INDEX = -1;
	private static final int ERROR_CODE = -1;
	private final int[] numbers = new int[ARRAY_SIZE];

	public static int getArraySize() {
		return ARRAY_SIZE;
	}

	public static int getEmptyIndex() {
		return EMPTY_INDEX;
	}

	public static int getErrorCode() {
		return ERROR_CODE;
	}

	public int getTotal() {
		return total;
	}

	private int total = EMPTY_INDEX;

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public boolean callCheck() {
		return total == EMPTY_INDEX;
	}

	public boolean isFull() {
		return total == ARRAY_SIZE - 1;
	}

	protected int peekaboo() {
		if (callCheck())
			return ERROR_CODE;
		return numbers[total];
	}

	public int countOut() {
		if (callCheck())
			return ERROR_CODE;
		return numbers[total--];
	}

	public int[] getNumbers() {
		return numbers;
	}

	public void setTotal(int total) {
		this.total = total;
	}
}
