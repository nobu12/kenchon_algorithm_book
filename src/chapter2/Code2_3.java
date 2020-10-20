package chapter2;

import java.util.Scanner;

/**
 * 偶数の列挙
 * @author nobu
 *
 */
public class Code2_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 2; i <= n; i += 2) {
				System.out.println(i);
		}

		sc.close();
	}

}
