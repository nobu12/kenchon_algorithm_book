package chapter6;

/**
 * 配列から目的の値を探索する二分探索法
 * @author nobu
 *
 */
public class Code6_1 {

	private static final int N = 8;
	private static final int[] a = new int[] {3, 5, 8, 10, 14, 17, 21, 39};

	// 目的の値keyの添字を返す（存在しない場合は-1）
	private static int binarySearch(int key) {
		int left = 0;
		int right = a.length - 1;
		while (right >= left) {
			int mid = left + (right - left) / 2;
			if (a[mid] == key) {
				return mid;
			} else if (a[mid] > key) {
				right = mid - 1;
			} else if (a[mid] < key) {
				left = mid + 1;
			}
		}

		return -1;
	}

	public static void main(String[] args) {
		System.out.println(binarySearch(10));
		System.out.println(binarySearch(3));
		System.out.println(binarySearch(39));

		System.out.println(binarySearch(-100));
		System.out.println(binarySearch(9));
		System.out.println(binarySearch(100));
	}

}
