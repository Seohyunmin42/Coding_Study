package may_week1;

import java.util.Scanner;

public class Prob1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int cnt = 0;
		
		for(int i = 0; i < N; i++) {
			int input = sc.nextInt();
			int check = 0;
			
			for(int j = 2; j <= input; j++) {
				if(input % j == 0) check++;
			}
			if(check == 1) cnt++;
		}
		System.out.println(cnt);
	}
}
