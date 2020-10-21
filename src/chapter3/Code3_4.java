package chapter3;

import java.util.Scanner;

/**
 * ペア和の最小値を求める（K以上の範囲）
 * @author nobu
 *
 */
public class Code3_4 {

	private static final int INF = 20000000; // 十分大きな値に

	public static void main(String[] args) {
		// 入力を受け取る
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];

		for (int i = 0; i < n; ++i) {
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < n; ++i) {
			b[i] = sc.nextInt();
		}

		// 線形探索
		int minValue = INF;
		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < n; ++j) {
				// 和がK未満の場合は捨てる
				if (a[i] + b[j] < k) continue;

				// 最小値を更新
				if (a[i] + b[j] < minValue) {
					minValue = a[i] + b[j];
				}
			}
		}

		// 結果出力
		System.out.println(minValue);

		sc.close();
	}

}
