package Fresh;
/*
 * we need to print the elements of the array 
 * which are present in odd positions. 
 * This can be accomplished by looping through 
 * the array and printing the elements of an array by incrementing 
 * i by 2 till the end of the array is reached.
 */
public class OddPostionArray {
	public static void main(String[] args) {
		char []arr= {'a','b','c','d','e'};
		for(int i=0;i<arr.length;i+=2) {
			System.out.println("Elements of odd Postion="+arr[i]);
		}
	}
	}
