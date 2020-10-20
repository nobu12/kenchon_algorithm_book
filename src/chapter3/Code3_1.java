package chapter3;

import java.util.Scanner;

/**
 * 線形探索法
 * @author nobu
 *
 */
public class Code3_1 {

	public static void main(String[] args) {
		// 入力を受け取る
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int v = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; ++i) {
			a[i] = sc.nextInt();
		}

		// 線形探索
		boolean exist = false; // 初期値はfalseに
		for (int i = 0; i < n; ++i) {
			if (a[i] == v) {
				exist = true; // 見つかったらフラグを立てる
			}
		}

		// 結果出力
		if (exist) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

		sc.close();
	}

}
