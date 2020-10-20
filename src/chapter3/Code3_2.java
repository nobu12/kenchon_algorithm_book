package chapter3;

import java.util.Scanner;

/**
 * 特定の要素の存在する「添字」も取得する
 * @author nobu
 *
 */
public class Code3_2 {

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
		int foundId = -1; // 初期値は-1などありえない値に
		for (int i = 0; i < n; ++i) {
			if (a[i] == v) {
				foundId = i; // 見つかったら添字を記録
				break; // ループを抜ける
			}
		}

		// 結果出力（-1のときは見つからなかったことを表す）
		System.out.println(foundId);

		sc.close();
	}

}
