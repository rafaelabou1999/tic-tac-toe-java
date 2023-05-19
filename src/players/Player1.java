package players;

public class Player1 extends Players {
	public void Player1(int positionLine, int positionCol) {
		super.positionCol = positionCol;
		super.positionLine = positionLine;
	}
	
	public void zeroAction() {
		System.out.println("0");
	}
}
