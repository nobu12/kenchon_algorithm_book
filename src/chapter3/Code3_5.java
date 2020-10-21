package chapter3;

import java.util.Scanner;

/**
 * 部分和問題に対するビットを用いる全探索解法
 * @author nobu
 *
 */
public class Code3_5 {

	public static void main(String[] args) {
		// 入力受け取り
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int w = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; ++i) {
			a[i] = sc.nextInt();
		}

		// bitは2^N通りの部分集合全体を動きます
		boolean exist = false;
		for (int bit = 0; bit < (1 << n); ++bit) {
			int sum = 0; // 部分集合に含まれる要素の和
			for (int i = 0; i < n; ++i) {
				// i番目の要素a[i]が部分集合に含まれているかどうか
				if (((bit & (1 << i)) >> i) == 1) {
					sum += a[i];
				}
			}

			// sumがwに一致するかどうか
			if (sum == w) exist = true;
		}

		if (exist) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

		sc.close();
	}

}
