package chapter4;

import java.util.Scanner;

/**
 * フィボナッチ数列を求める再帰関数をメモ化
 * @author nobu
 *
 */
public class Code4_9 {

	private static boolean func(int i, int w, int[] a) {
		// ベースケース
		if (i == 0) {
			if (w == 0) {
				return true;
			} else {
				return false;
			}
		}

		// a[i - 1] を選ばない場合
		if (func(i - 1, w, a)) return true;

		// a[i - 1] を選ぶ場合
		if (func(i - 1, w - a[i - 1], a)) return true;

		// どちらも false の場合は false
		return false;
	}

	public static void main(String[] args) {
		// 入力
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int w = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; ++i) {
			a[i] = sc.nextInt();
		}

		// 再帰的に解く
		if (func(n, w, a)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

		sc.close();
	}

}
