package Q33;

public class Q33 {
	public static void main(String[] args) {
		String[][] b = { { "a", "b", "c" }, { "d", "f", "g" } };
		String[][] b1 = new String[][]{ { "a", "b", "c" }, { "d", "f", "g" } };
		traverse(b1);
	}
	public static void traverse(String[][] board) {
		for (int x = 0; x < board.length; x++)
			for (int y = 0; y < board[x].length; y++)
				System.out.println(board[x][y]);
	}
}
