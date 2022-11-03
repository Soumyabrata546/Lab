package Fresh;

public class DupValueArray {
	//Write a Java program to find the
	//duplicate values of an array of integer values
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,3,6,4};
		int count=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
					System.out.println("Duplicate array Element is= "+arr[j]+"and occurance"+(count+1));
				}
			}
			count=0;
		}
			}
}
