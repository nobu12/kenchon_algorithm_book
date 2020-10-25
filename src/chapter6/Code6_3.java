package chapter6;

import java.util.Scanner;

/**
 * 年齢当てゲームの実装
 * @author nobu
 *
 */
public class Code6_3 {

	public static void main(String[] args) {
		System.out.println("Start Game!");

		// Aさんの数の候補を表す区間を、[left, right) と表す
		int left = 20;
		int right = 36;

		// Aさんの数を１つに絞れないうちは繰り返す
		while (right - left > 1) {
			int mid = left + (right -left) / 2; // 区間の真ん中

			// mid以上かを聞いて、回答を yes/ no で受け取る
			System.out.println("Is the age less than " + mid + " ? (yes / no)");
			String ans;
			Scanner sc = new Scanner(System.in);
			ans = sc.next();

			// 回答に応じて、ありうる数の範囲を絞る
			if ("yes".equals(ans)) {
				right = mid;
			} else {
				left = mid;
			}
		}

		// ズバリ充てる！
		System.out.println("The age is " + left + "！");
	}

}
