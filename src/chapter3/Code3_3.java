package chapter3;

import java.util.Scanner;

/**
 * 最小値を求める
 * @author nobu
 *
 */
public class Code3_3 {

	private static final int INF = 20000000; // 十分大きな値に

	public static void main(String[] args) {
		// 入力を受け取る
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; ++i) {
			a[i] = sc.nextInt();
		}

		// 線形探索
		int minValue = INF;
		for (int i = 0; i < n; ++i) {
			if (a[i] < minValue) {
				minValue = a[i];
			}
		}

		// 結果出力
		System.out.println(minValue);

		sc.close();
	}

}
