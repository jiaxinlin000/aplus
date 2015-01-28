public class TwoDArray
	{

	public static void main(String[] args)
		{
		// TODO Auto-generated method stub
		int[][] array1 =
			{
				{ 2, 4, 6, 8 },
				{ 3, 6, 9, 12 },
				{ 4, 8, 12, 16 } };
		System.out.println(array1[1][2]);

		// 1

		String[][] array2 = new String[5][3];
		for (int i = 0; i < 5; i++)
			{

			for (int j = 0; j < 3; j++)
				{
				array2[i][j] = "Mustang \t";
				}
			}

		for (int r = 0; r < 5; r++)
			{
			System.out.println();
			for (int c = 0; c < 3; c++)
				{
				System.out.print(array2[r][c]);
				}
			}
		System.out.println();
		// 2
		int[][] array3 = new int[3][3];
		for (int i = 0; i < 3; i++)
			{
			for (int j = 0; j < 3; j++)
				{
				array3[i][j] = (3 * i + j + 1) * 10;
				}
			}
		for (int r = 0; r < 3; r++)
			{
			System.out.println();
			for (int c = 0; c < 3; c++)
				{
				System.out.print(array3[r][c] + " ");
				}
			}
		System.out.println();
		System.out.println(array3[0][0] + array3[2][2] + array3[0][2]
				+ array3[2][0]);

		}
	}
