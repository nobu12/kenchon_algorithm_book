package chapter2;

import java.util.Scanner;

/**
 * 最近点問題に対する全探索
 * @author nobu
 *
 */
public class Code2_4 {

	/**
	 * 2点 (x1, y1) と (x2, y2) との距離を求める関数
	 * @param x1
	 * @param y1
	 * @param x2
	 * @param y2
	 * @return
	 */
	private static double calcDist(double x1, double y1, double x2, double y2) {
		return Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
	}

	public static void main(String[] args) {
		// 入力データを受け取る
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double[] x = new double[n];
		double[] y = new double[n];
		for (int i = 0; i < n; ++i) {
			x[i] = sc.nextDouble();
			y[i] = sc.nextDouble();
		}

		// 求める値を、十分大きい値で初期化しておく
		double minimumDist = 100000000.0;

		// 探索開始
		for (int i = 0; i < n; ++i) {
			for (int j = i + 1; j < n; ++j) {
				// (x[i], y[i]) と (x[j], y[j]) との距離
				double distIJ = calcDist(x[i], y[i], x[j], y[j]);

				// 暫定最小値 minimumDist を distIJ と比べる
				if (distIJ < minimumDist) {
					minimumDist = distIJ;
				}
			}
		}

		// 答えを出力する
		System.out.println(minimumDist);

		sc.close();
	}

}
