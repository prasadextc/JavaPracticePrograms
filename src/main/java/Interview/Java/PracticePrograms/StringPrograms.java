package Interview.Java.PracticePrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class StringPrograms {

	// *****************************First string from the given array whose// reverse is present ****************************//
	/*public static void main(String[] args) {
		String str[] = {"geeks", "for", "skeeg"};
		int n = str.length;

		System.out.print(getWord(str, n));
	}

	// Function that returns true if s1
	// is equal to reverse of s2
	static boolean isReverseEqual(String s1, String s2) {

		// If both the strings differ in length
		if (s1.length() != s2.length())
			return false;

		int len = s1.length();
		for (int i = 0; i < len; i++)

			// In case of any character mismatch
			if (s1.charAt(i) != s2.charAt(len - i - 1))
				return false;

		return true;
	}

	// Function to return teh first word whose
	// reverse is also present in the array
	static String getWord(String str[], int n) {

		// Check every string
		for (int i = 0; i < n - 1; i++)

			// Pair with every other string
			// appearing after the current string
			for (int j = i + 1; j < n; j++)

				// If first string is equal to the
				// reverse of the second string
				if (isReverseEqual(str[i], str[j]))
					return str[i];

		// No such string exists
		return "-1";
	}

}*/
//***************************************** END ******************************************//
//---------------------------------------------------------------------------------------------------------------------------//
	
// *****************************INT to String and vice versa ****************************//
/*	public static void main(String[] args) 
    {
        String s = "2015";
         
        int i = Integer.parseInt(s);
         
        System.out.println(i);          //Output : 2015
        
        int i1 = 2015;
         
        String s1 = Integer.toString(i1);
         
        System.out.println(s1);     //Output : 2015
    }
}*/
//********************************************************* END *************************************//
//---------------------------------------------------------------------------------------------------------------------------//
	
// *****************************Count duplucate characters in the string ****************************//
	
	 
	  /*public static void main(String a[]){
		  StringArray obj = new StringArray();
	    System.out.println("String: BeginnersBook.com");
	    System.out.println("-------------------------");
	    obj.countDupChars("BeginnersBook.com");
	  
	    System.out.println("\nString: ChaitanyaSingh");
	    System.out.println("-------------------------");
	    obj.countDupChars("ChaitanyaSingh");
	 
	    System.out.println("\nString: #@$@!#$%!!%@");
	    System.out.println("-------------------------");
	    obj.countDupChars("#@$@!#$%!!%@");
	  }
	void Findrepeter() {
		String s = "mmababctamantlslmag";
		int distinct = 0;

		for (int i = 0; i < s.length(); i++) {

			for (int j = 0; j < s.length(); j++) {

				if (s.charAt(i) == s.charAt(j)) {
					distinct++;

				}
			}
			System.out.println(s.charAt(i) + "--" + distinct);
			String d = String.valueOf(s.charAt(i)).trim();
			s = s.replaceAll(d, "");
			distinct = 0;

		}

	}

	public void countDupChars(String str){
		 
	    //Create a HashMap 
	    Map<Character, Integer> map = new HashMap<Character, Integer>(); 
	 
	    //Convert the String to char array
	    char[] chars = str.toCharArray();
	 
	    // logic: char are inserted as keys and their count
	     //as values. If map contains the char already then
	     // increase the value by 1
	     
	    for(Character ch:chars){
	      if(map.containsKey(ch)){
	         map.put(ch, map.get(ch)+1);
	      } else {
	         map.put(ch, 1);
	        }
	    }
	 
	    //Obtaining set of keys
	    Set<Character> keys = map.keySet();
	 
	    // Display count of chars if it is
	     // greater than 1. All duplicate chars would be 
	     // having value greater than 1.
	     
	    for(Character ch:keys){
	      if(map.get(ch) > 1){
	        System.out.println("Char "+ch+" "+map.get(ch));
	      }
	    }
	  }
	 
}
*/
//********************************************************* END *************************************//
//---------------------------------------------------------------------------------------------------------------------------//
	
//***************************************************Remove White Spaces ****************************//
	
/*	public static void main(String[] args)
    {
        String str = "Core Java jsp servlets jdbc struts hibernate spring";
 
        //1. Using replaceAll() Method
 
        String strWithoutSpace = str.replaceAll(" ", "#");
        System.out.println(strWithoutSpace);
        String reverse = "";
        System.out.println("Method 1"); 
        int len=str.length();
        System.out.println(len);
        for(int i = len-1;i<=0;i--)
        
        	reverse += str.charAt(i);
        	System.out.println(reverse);

        //2. Without Using replaceAll() Method
 
        char[] strArray = str.toCharArray();
 
        StringBuffer sb = new StringBuffer();
 
        for (int i = 0; i < strArray.length; i++)
        {
            if( (strArray[i] != ' ') && (strArray[i] != '\t') )
            {
                sb.append(strArray[i]);
            }
        }
        System.out.println("Method 2"); 
        System.out.println(sb);           //Output : CoreJavajspservletsjdbcstrutshibernatespring
    }
}*/

//********************************************************* END *************************************//
//---------------------------------------------------------------------------------------------------------------------------//
	
//***************************************************Count the occurance of a************************//
	
/*	public static void main(String[] args)
    {
        String s = "Java is java again java again";
 
        char c = 'a';
 
        int count = s.length() - s.replace("a", "").length();
 
        System.out.println("Number of occurances of 'a' in "+s+" = "+count);
    }
}*/
	
//********************************************************* END *************************************//
//---------------------------------------------------------------------------------------------------------------------------//
		
//***************************************************String Reversal********************************//
/*	public static String Reverse1(String a){
		String reverse = "";
		int len = a.length();
		System.out.println(len);
	    	for (int i = len - 1 ; i<= 0 ; i-- )
	        reverse += a.charAt(i);
	    	return reverse;
	}
	public static StringBuffer Reverse2(String a){
		StringBuffer sb = new StringBuffer(a);
		return sb.reverse();
	}
    public static void main( String[] args )
    {
    	String original;
		Scanner in = new Scanner(System.in);
                System.out.println("Enter a string to reverse: ");
                original = in.nextLine();
                System.out.println("Reverse of entered string is: "+Reverse1(original));
                System.out.println("Reverse of entered string is: "+Reverse2(original));
                in.close();
    }
}*/
//********************************************************* END *************************************//
//---------------------------------------------------------------------------------------------------------------------------//
		
//************************************Words Reversal in given string********************************//
/*	public void reverseWordInMyString(String str)
	   {
		// The split() method of String class splits a string in several strings based on the
		  
		 // delimiter passed as an argument to it
		 
		String[] words = str.split(" ");
		String reversedString = "";
		for (int i = 0; i < words.length; i++)
	        {
	           String word = words[i]; 
	           String reverseWord = "";
	           for (int j = word.length()-1; j >= 0; j--) 
		   {
			// The charAt() function returns the character
			 // at the given position in a string
			 
			reverseWord = reverseWord + word.charAt(j);
		   }
		   reversedString = reversedString + reverseWord + " ";
		}
		System.out.println(str);
		System.out.println(reversedString);
	   }
	   public static void main(String[] args) 
	   {
		   StringArray obj = new StringArray();
		obj.reverseWordInMyString("Welcome to BeginnersBook");
		obj.reverseWordInMyString("This is an easy Java Program");
	   }
}*/
//********************************************************* END *************************************//
//---------------------------------------------------------------------------------------------------------------------------//
