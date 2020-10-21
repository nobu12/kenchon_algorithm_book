package chapter5;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Frog問題を動的計画法で解く
 * @author nobu
 *
 */
public class Code5_1 {

	public static void main(String[] args) {
		// 入力
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] h = new long[n];
		for (int i = 0; i < n; ++i) {
			h[i] = sc.nextInt();
		}

		// 配列 dp を定義（配列全体を無限大を表す値に初期化）
		long dp[] = new long[n];
		Arrays.fill(dp, Long.MAX_VALUE);

		// 初期条件
		dp[0] = 0;

		// ループ
		for (int i = 1; i < n; ++i) {
			if (i == 1) {
				dp[i] = Math.abs(h[i] - h[i - 1]);
			} else {
				dp[i] = Math.min(dp[i - 1] + Math.abs(h[i] - h[i - 1]), dp[i - 2] + Math.abs(h[i] - h[i - 2]));
			}
		}

		// 答え
		System.out.println(dp[n - 1]);

		sc.close();
	}

}
