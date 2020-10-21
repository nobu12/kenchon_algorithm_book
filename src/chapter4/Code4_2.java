package chapter4;

/**
 * 1からNまでの総和を計算する再帰関数
 * @author nobu
 *
 */
public class Code4_2 {

	private static int func(int n) {
		// 再帰関数を呼び出したことを報告する
		System.out.println("func(" + n + ") を呼び出しました");

		if (n == 0) return 0;

		// 再帰的に答えを求めて出力する
		int result = n + func(n - 1);
		System.out.println(n + " までの和 = " + result);

		return result;
	}

	public static void main(String[] args) {
		func(5);
	}

}
