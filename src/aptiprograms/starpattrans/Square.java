package aptiprograms.starpattrans;

public class Square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 6;
		for (int i = 0; i <= num; i++) {
			for (int j = 0; j <= num; j++) {
				if (i == 0 || i == num || j == 0 || j == num)
					System.out.print("* ");
				else
					System.out.print("   ");
			}
			System.out.println();
		}

	}
	}

