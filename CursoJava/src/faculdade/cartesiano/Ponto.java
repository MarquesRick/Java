package faculdade.cartesiano;

public class Ponto {

	private double x;
	private double y;

	public void setX(double valX) {

		if (valX > 0) {

			valX = x;

		}

	}

	public void setY(double valY) {
		if (valY > 0) {

			valY = y;
		}
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

}
