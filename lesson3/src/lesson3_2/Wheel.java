package lesson3_2;

public class Wheel {
	private int diagonal;
	private String tiresType;
	
	public Wheel(int diagonal, String tiresType) {
		super();
		this.diagonal = diagonal;
		this.tiresType = tiresType;
	}

	public int getDiagonal() {
		return diagonal;
	}

	public void setDiagonal(int diagonal) {
		this.diagonal = diagonal;
	}

	public String getTiresType() {
		return tiresType;
	}

	public void setTiresType(String tiresType) {
		this.tiresType = tiresType;
	}

	@Override
	public String toString() {
		return "Wheel [diagonal=" + diagonal + ", tiresType=" + tiresType + "]";
	}
	
	public void showUpperTiresType() {
		System.out.println(this.tiresType.toUpperCase());
	}
}
