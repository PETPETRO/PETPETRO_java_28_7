
public class Triangle {

	private int size;
	private String triangle = "";

	public Triangle(int size) {
		this.size = size;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	private String spaces(int row) {
		String spaces = "";
		for (int i = 0; i < size - row - 1; i++) {
			spaces += " ";
		}
		return spaces;
	}

	private String symbols(int row) {
		String symbols = "";
		for (int i = 0; i < (row * 2) + 1; i++) {
			symbols += "*";
		}
		return symbols;
	}

	@Override
	public String toString() {
		for (int row = 0; row < size; row++) {
			triangle += spaces(row) + symbols(row) + "\n";
		}
		return triangle;
	}

}
