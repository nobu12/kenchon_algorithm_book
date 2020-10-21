package chapter4;

/**
 * フィボナッチ数列をfor文による反復で求める
 * @author nobu
 *
 */
public class Code4_7 {

	public static void main(String[] args) {
		long[] f = new long[50];
		f[0] = 0;
		f[1] = 1;
		for (int n = 2; n < 50; ++n) {
			f[n] = f[n - 1] + f[n - 2];
			System.out.println(n + " 項目： " + f[n]);
		}
	}

}
