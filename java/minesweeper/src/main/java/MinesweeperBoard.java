import java.util.ArrayList;
import java.util.List;

public class MinesweeperBoard {
	private List<String> board;
	private int rowLength;

	public MinesweeperBoard(List<String> board) {
		this.board = new ArrayList<String>(board);
	}

	public void expand() {
		for (int i = 0; i < board.size(); i++)
			board.set(i, " " + board.get(i) + " ");
		board.add(0, " ".repeat(rowLength + 2));
		board.add(board.size(), " ".repeat(rowLength + 2));
	}

	public void shrink() {
		board.remove(0);
		board.remove(board.size() - 1);
		for (int i = 0; i < board.size(); i++)
			board.set(i, board.get(i).substring(1, rowLength + 1));
	}

	public List<String> withNumbers() {
		if (!board.isEmpty()) {
			rowLength = board.get(0).length();
			expand();
			for (int r = 1; r < board.size() - 1; r++)
				for (int c = 1; c < rowLength + 1; c++) {
					String row = board.get(r);

					if (row.charAt(c) == ' ') {
						int mines = 0;
						for (int i = r - 1; i <= r + 1; i++)
							for (int j = c - 1; j <= c + 1; j++)
								if (board.get(i).charAt(j) == '*')
									mines++;
						if (mines > 0)
							board.set(r, row.substring(0, c) + mines + row.substring(c + 1));
					}
				}
			shrink();
		}
		return board;
	}
}