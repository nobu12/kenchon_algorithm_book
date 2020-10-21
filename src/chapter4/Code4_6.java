package chapter4;

/**
 * フィボナッチ数列を求める再帰関数の再帰呼び出しの様子
 * @author nobu
 *
 */
public class Code4_6 {

	private static int fibo(int n) {
		// 再帰関数を呼び出したことを報告する
		System.out.println("fibo(" + n + ") を呼び出しました");

		// ベースケース
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		}

		// 再帰的に答えを求めて出力する
		int result = fibo(n - 1) + fibo(n - 2);
		System.out.println(n + " 項目 = " + result);

		return result;
	}

	public static void main(String[] args) {
		fibo(6);
	}

}
