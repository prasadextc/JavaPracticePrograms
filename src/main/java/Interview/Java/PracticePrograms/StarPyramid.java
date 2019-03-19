package Interview.Java.PracticePrograms;

public class StarPyramid {
/////////////********** PYRAMID 1 **********//////////
/*	
* 
* * 
* * * 
* * * * 
* * * * * 
	public static void main(String[] args) {
		int n = 5;
		printStars(n);
	}
	public static void printStars(int n) {
		int i, j;

		// outer loop to handle number of rows
		// n in this case
		for (i = 0; i < n; i++) {

			// inner loop to handle number of columns
			// values changing acc. to outer loop
			for (j = 0; j <= i; j++) {
				// printing stars
				System.out.print("* ");
			}

			// ending line after each row
			System.out.println();
		}
	}
	
}
*/
//************************************* END PYRAMID 1  ********************************************//	
	
	//-----------------------------------------------------------------------------------------------------------------------//
	
//*************************************** PYRAMID 2 ***********************************************//
/*	
* * * * * * 
* * * * 
* * * 
* * 
*                */

	public static void main(String[] args) {
		int rows = 5;

		for (int i = rows; i >= 1; --i) {
			for (int j = 1; j <= i; ++j) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
	
//************************************* END PYRAMID 2  ********************************************//	
	
	//-----------------------------------------------------------------------------------------------------------------------//

	


