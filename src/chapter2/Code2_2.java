package chapter2;

import java.util.Scanner;

/**
 * 二重のfor文（O(N^2)）
 * @author nobu
 *
 */
public class Code2_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int count = 0;
		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < n; ++j) {
				++count;
			}
		}

		sc.close();
	}

}
