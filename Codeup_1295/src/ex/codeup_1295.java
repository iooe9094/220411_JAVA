package ex;

import java.util.Scanner;

public class codeup_1295 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Scanner scn = new Scanner(System.in);
//		
//		String strInput = scn.next(); // 입력받기
//		
//		String strResult = ""; // 결과 출력 변수
//		
//		for(int i=0; i<strInput.length(); i++) {
//			String cLetter = strInput.charAt(i) + "";
//			
//			if(cLetter.equals(cLetter.toLowerCase()) == true) {
//				strResult += cLetter.toUpperCase();
//			} else if(cLetter.equals(cLetter.toUpperCase()) == true) {
//				strResult += cLetter.toLowerCase();
//			} else {
//				strResult += cLetter;
//			}
//		}
//		System.out.println(strResult);
		
// 아스키코드 이용
//		Scanner scn = new Scanner(System.in);
//		
//		String strInput = scn.next(); // 입력받기
//		
//		String strResult = ""; // 결과 출력 변수
//		
//		for(int i=0; i< strInput.length(); i++) {
//			char cLetter = strInput.charAt(i);
//			
//			// 아스키코드표의 대문자 -> 65부터 90까지
//			if(cLetter >= 65 && cLetter <= 90) {
//				strResult += (char)(cLetter + 32);
//			} else if(cLetter >= 97 && cLetter <= 122) {
//				strResult += (char)(cLetter - 32);
//			} else {
//				strResult += (char)cLetter;
//			}
//		}
//		System.out.println(strResult);
		
// 코드업 1408
		Scanner scn = new Scanner(System.in);
		
		String strInput = scn.next();
		
		String strResult = "";
		String strResult2 = "";
		
		for(int i=0; i<strInput.length(); i++) {
			// 문자열에서 한문자씩 뽑아내서 반복문 수행 
			char cLetter = strInput.charAt(i); // (int)A -> (char)65 -> A
			
			strResult += (char)(cLetter + 2); // (char)(65 + 1) => B
			// 입력받은 문자의 아스키코드값 * 7 % 80 + 48
			strResult2 += (char)((cLetter * 7) % 80 + 48);
		}
		// 첫 번째 암호화 출력
		System.out.println(strResult);
		// 두 번째 암호화 출력
		System.out.println(strResult2);
	}
}
