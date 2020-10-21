package chapter4;

import java.util.Arrays;

/**
 * フィボナッチ数列を求める再帰関数をメモ化
 * @author nobu
 *
 */
public class Code4_8 {

	// fibo(n) の答えをメモ化する配列
	private static long[] memo = new long[50];

	private static long fibo(int n) {
		// ベースケース
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		}

		// メモをチェック（すでに計算済みならば答えをリターンする）
		if (memo[n] != -1) return memo[n];

		// 答えをメモ化しながら、再帰呼び出し
		return memo[n] = fibo(n - 1) + fibo(n -2);
	}

	public static void main(String[] args) {
		// メモ化用配列を -1 で初期化する
		Arrays.fill(memo, -1);

		// fibo(49) をよびだす
		fibo(49);

		// memo[0], ..., memo[49] に答えが格納されている
		for (int n = 2; n < 50; ++n) {
			System.out.println(n + " 項目： " + memo[n]);
		}
	}

}
