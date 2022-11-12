package common;

import java.util.Scanner;

public class ScanUtil {
	private static Scanner scanner = new Scanner(System.in); //Scanner sc도 메모리에 올려주기 위해 static을 붙임
	
	public static Scanner scanner() {
		return scanner;
	}
	
	
}

