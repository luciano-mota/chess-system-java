package tabuleiro;

public class Posicao {
	private int row;
	private int column;
	
	public Posicao(int row, int column) {
		super();
		this.row = row;
		this.column = column;
		
	}

	public int getColumn() {
		return column;
	}

	public void setColumn(int column) {
		this.column = column;
	}
	
	@Override
	public String toString() {
		return row + ", " + column;
	}
}
