package com.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		a = sc.nextInt();
		b = sc.nextInt();
		
		int i, j, k;
		i = a*(b%10);
		j = a*((b%100)/10);
		k = a*(b/100);
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(i+(j*10)+(k*100));
	}

}
