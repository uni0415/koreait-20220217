package a07_반복.퀴즈;

import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int i = 0; i < num; i++) {
			System.out.println(num - i);
		}
	}
}
