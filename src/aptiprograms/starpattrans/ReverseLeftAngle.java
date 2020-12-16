package aptiprograms.starpattrans;

public class ReverseLeftAngle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numOfRows = 5;

		for (int i = 0; i < numOfRows; i++) {
			for (int j = 0; j < numOfRows; j++) {
				if (i+j<numOfRows)
					System.out.print("*");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

	}

