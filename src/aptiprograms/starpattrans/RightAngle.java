package aptiprograms.starpattrans;

public class RightAngle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 3;

		for (int i = 0; i <= num; i++) {
			for (int j = 0; j <= num; j++) {
				if (j <= i)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
}
}