package Interview.Java.PracticePrograms;

import java.util.Scanner;
import java.util.Stack;

public class NumberArray {

	//****************************Next greater element in same order as input*****************************************//
/*	public static void main(String[] args) {
		
		int arr[] = { 11, 13, 21, 3 };  
	    int n = arr.length;  
	    printNGE(arr, n);  
	}
	static void printNGE(int arr[], int n)  
	{  
	    Stack<Integer> s = new Stack<Integer>();  
	  
	    int arr1[] = new int[n];  
	  
	    // iterating from n-1 to 0  
	    for (int i = n - 1; i >= 0; i--)  
	    {  
	        We will pop till we get the  
	        greater element on top or stack gets empty
	        while (!s.isEmpty() && s.peek() < arr[i])  
	            s.pop();  
	  
	        if stack gots empty means there  
	        is no element on right which is greater  
	        than the current element.  
	        if not empty then the next greater  
	        element is on top of stack
	        if (s.empty())  
	            arr1[i] = -1;          
	        else
	            arr1[i] = s.peek();          
	  
	        s.push(arr[i]);  
	    }  
	  
	    for (int i = 0; i < n; i++)  
	        System.out.println(arr[i] + " ---> " + arr1[i]);  
	}
	}*/
//******************************  END  ************************************************//
//-------------------------------------------------------------------------------------------------------------------------//
	//******************************  Prime No  ***************************************//

	/*public static void main(String args[])
	   {		
		int temp;
		boolean isPrime=true;
		System.out.println("Hii");
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter any number:");
		//capture the input in an integer
		int num=scan.nextInt();
	        scan.close();
		for(int i=2;i<=num/2;i++)
		{
	           temp=num%i;
		   if(temp==0)
		   {
		      isPrime=false;
		      break;
		   }
		}
		//If isPrime is true then the number is prime else not
		if(isPrime)
		   System.out.println(num + " is a Prime Number");
		else
		   System.out.println(num + " is not a Prime Number");
	   }
}*/
	//******************************  END  ************************************************//
//-------------------------------------------------------------------------------------------------------------------------//
	//**********************************  ODD EVN No  ***************************************//
/*	public static void main(String[] args) {
		int num;
		System.out.println("Enter an Integer number:");

		// The input provided by user is stored in num
		Scanner input = new Scanner(System.in);
		num = input.nextInt();

		// If number is divisible by 2 then it's an even number else odd number

		if (num % 2 == 0)
			System.out.println("Entered number is even");
		else
			System.out.println("Entered number is odd");

	}
}*/
	//******************************  END  ************************************************//
//-------------------------------------------------------------------------------------------------------------------------//
	//*****************************  ARRAY element in ascending order  *******************//
	/*public static void main(String[] args) 
    {
    	int count, temp;
    	
    	//User inputs the array size
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of elements you want in the array: ");
        count = scan.nextInt();
    
        int num[] = new int[count];
        System.out.println("Enter array elements:");
        for (int i = 0; i < count; i++) 
        {
            num[i] = scan.nextInt();
        }
        scan.close();
        for (int i = 0; i < count; i++) 
        {
            for (int j = i + 1; j < count; j++) { 
                if (num[i] > num[j]) 
                {
                    temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }
        System.out.print("Array Elements in Ascending Order: ");
        for (int i = 0; i < count - 1; i++) 
        {
            System.out.print(num[i] + ", ");
        }
        System.out.print(num[count - 1]);
    }
}*/
	//******************************  END  ************************************************//
//-------------------------------------------------------------------------------------------------------------------------//
	//*****************************  LEAP Year  *******************************************//
	/*public static void main(String[] args) {

	int year;
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter any Year:");
	year = scan.nextInt();
	scan.close();
    boolean isLeap = false;

    if(year % 4 == 0)
    {
        if( year % 100 == 0)
        {
            if ( year % 400 == 0)
                isLeap = true;
            else
                isLeap = false;
        }
        else
            isLeap = true;
    }
    else {
        isLeap = false;
    }

    if(isLeap==true)
        System.out.println(year + " is a Leap Year.");
    else
        System.out.println(year + " is not a Leap Year.");
}*/
	
	//******************************  END  ************************************************//
//-------------------------------------------------------------------------------------------------------------------------//
	//*****************************  Fobbonani series Year  ******************************//
	
/*	public static void main(String args[]) {
		int n1 = 0, n2 = 1, n3, i, count = 10;
		System.out.print(n1 + " " + n2);// printing 0 and 1

		for (i = 2; i < count; ++i)// loop starts from 2 because 0 and 1 are
									// already printed
		{
			n3 = n1 + n2;
			System.out.print(" " + n3);
			n1 = n2;
			n2 = n3;
		}

	}
}*/
	
	
	//******************************  END  ************************************************//
//-------------------------------------------------------------------------------------------------------------------------//
	//*****************************  Factorial  *******************************************//
	/*static int factorial(int n) {
		if (n == 0)
			return 1;
		else
			return (n * factorial(n - 1));
	}
	public static void main(String args[]) {
		int i, fact = 1;
		int number = 4;// It is the number to calculate factorial
		fact = factorial(number);
		System.out.println("Factorial of " + number + " is: " + fact);
	}
}*/

	//******************************  END  ************************************************//
//-------------------------------------------------------------------------------------------------------------------------//
	//*****************************  LARGEST/SMALLEST no in an ARRAY change < >  **********//

/*	public static int getLargest(int[] a, int total) {
		int temp;
		for (int i = 0; i < total; i++) {
			for (int j = i + 1; j < total; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		return a[total - 1];
	}
	public static void main(String args[]) {
		int a[] = {1, 2, 5, 6, 3, 2};
		int b[] = {44, 66, 99, 77, 33, 22, 55};
		System.out.println("Largest: " + getLargest(a, 6));
		System.out.println("Largest: " + getLargest(b, 7));
	}
}*/
	
	//******************************  END  ************************************************//
//-------------------------------------------------------------------------------------------------------------------------//
	//*****************************  Remove duplicates from arrav  ************************//
	
	/*public static int removeDuplicateElements(int arr[], int n) {
		if (n == 0 || n == 1) {
			return n;
		}
		int[] temp = new int[n];
		int j = 0;
		for (int i = 0; i < n - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				temp[j++] = arr[i];
			}
		}
		temp[j++] = arr[n - 1];
		// Changing original array
		for (int i = 0; i < j; i++) {
			arr[i] = temp[i];
		}
		return j;
	}

	public static void main(String[] args) {
		int arr[] = {10, 20, 20, 30, 30, 40, 50, 50};
		int length = arr.length;
		length = removeDuplicateElements(arr, length);
		// printing array elements
		for (int i = 0; i < length; i++)
			System.out.print(arr[i] + " ");
	}
}*/