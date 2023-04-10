package Test;

public class SecondLargestDecendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Test");

		int a[] = { 34, 26, 1, 90, 100, 99, 67 };
		int temp;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("second largest value: " + a[1]);
		for (int i = 0; i < a.length; i++) {
			System.out.println("Decending ordr arry values:" + a[i]);

		}
	}
}
