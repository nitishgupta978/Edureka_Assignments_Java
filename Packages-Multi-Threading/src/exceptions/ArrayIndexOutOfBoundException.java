package exceptions;

public class ArrayIndexOutOfBoundException {
	public static void main(String[] args) {
		int arr[]= {0,1,2,3,4,5};
		for(int i=0;i<=arr.length;i++) {
			System.out.println(i);
			
//			Here ArrayIndexOutOfBoundException for index 6
			System.out.println(arr[6]);
		}
	

}
}