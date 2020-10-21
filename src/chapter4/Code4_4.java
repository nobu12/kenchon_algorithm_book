package chapter4;

/**
 * ユークリッドの控除法によって最大公約数を求める
 * @author nobu
 *
 */
public class Code4_4 {

	private static int GCD(int m, int n) {
		// ベースケース
		if (n == 0) return m;

		// 再帰呼び出し
		return GCD(n, m % n);
	}

	public static void main(String[] args) {
		System.out.println(GCD(51, 15));
		System.out.println(GCD(15, 51));
	}

}
