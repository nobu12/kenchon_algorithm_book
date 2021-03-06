package chapter2;

import java.util.Scanner;

/**
 * 一重のfor文（O(N)）
 * @author nobu
 *
 */
public class Code2_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int count = 0;
		for (int i = 0; i < n; ++i) {
			++count;
		}

		sc.close();
	}

}
