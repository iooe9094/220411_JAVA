package ex;

import java.util.Arrays;
import java.util.Scanner;

public class Ex5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// 예제5-1
//		int[] iArr1 = new int[10];
//		int[] iArr2 = new int[10];
////		int[] iArr3 = new int[]{100, 95, 80, 70, 60};
//		int[] iArr3 = {100, 95, 80, 70, 60};
//		char[] chArr = {'a', 'b', 'c', 'd'};
//		
//		for (int i=0; i<iArr1.length; i++) {
//			iArr1[i] = i + 1;
//		}
//		
//		for (int i=0; i<iArr2.length; i++) {
//			iArr2[i] = (int)(Math.random()*10) + 1;
//		}
//		
//		for (int i=0; i<iArr1.length; i++) {
//			System.out.print(iArr1[i] + ",");
//		}
//		System.out.println();
//		
//		System.out.println(Arrays.toString(iArr2));
//		System.out.println(Arrays.toString(iArr3));
//		System.out.println(Arrays.toString(chArr));
//		System.out.println(iArr3);
//		System.out.println(chArr);
		
// 예제5-2
//		int sum = 0; // 총합 저장 변수
//		float average = 0f; // 평균 저장 변수
//		
//		int[] score = {100, 88, 100, 100, 90};
//		
//		for (int i=0; i<score.length; i++) {
//			sum += score[i]; // 배열값 모두 더함
//		}
//		average = sum / (float)score.length; // 결과값 floa타입으로 도출 위해 형변환.
//		
//		System.out.println("총합: " + sum);
//		System.out.println("평균: " + average);
		
// 예제5-3
//	int[] score = {79, 88, 91, 33, 100, 55, 95};
//	
//	int max = score[0]; // 배열 첫 번째 값으로 최대값 초기화
//	int min = score[0]; // 배열 첫 번째 값으로 최소값 초기화
//	
//    for(int i=1; i<score.length; i++) { // i=1인 이유는 배열의 두 번째 값부터 읽기 위해
//    	if(score[i] > max) {
//    		max = score[i];
//    	} else if(score[i] < min) {
//    		min = score[i];
//    	}
//    }
//		System.out.println("최대값 : " + max);
//		System.out.println("최소값 : " + min);
		
// 예제5-4
//		int[] numArr = {0,1,2,3,4,5,6,7,8,9};
//	    System.out.println(Arrays.toString(numArr));
//	    
//	    for (int i=0; i<100; i++) {
//	    	int n = (int)(Math.random() * 10); // 0~9 중 한 값을 랜덤으로 얻음
//	        int tmp = numArr[0];
//	        numArr[0] = numArr[n];
//	        numArr[n] = tmp;
//	    }
//	    System.out.println(Arrays.toString(numArr));
		
// 예제5-5
//		int[] ball = new int[45]; // 45개의 정수값을 저장하기 위한 배열 생성
//		
//		// 배열의 각 요소에 1~45의 값을 저장한다.
//		for(int i=0; i<ball.length; i++)
//			ball[i] = i + 1; // ball[0]에 1이 저장
//		
//		int tmp = 0; // 두 값을 바꾸는데 사용할 임시 변수
//		int j = 0; // 임의의 값을 얻어서 저장할 변수
//		
//		// 배열의 i번째 요소와 임의의 요소가 저장된 값을 서로 바꿔 섞는다.
//		// 0번째 부터 5번째 요소까지 모두 6개만 바꾼다.
//		for(int i=0; i<6; i++) {
//			j = (int)(Math.random() * 45);
//			tmp = ball[i];
//			ball[i] = ball[j];
//			ball[j] = tmp;
//		}
//		
//		// 배열 ball의 앞에서부터 6개의 요소를 출력.
//		for(int i=0; i<6; i++) {
//			System.out.printf("ball[%d]=%d%n", i, ball[i]);
//		}
		
// 예제5-6
//		String[] names = {"Kim", "Park", "Yi"};
//		
//		for(int i=0; i<names.length; i++) {
//			System.out.println("names["+i+"]:" + names[i]);
//		}
//		
//		String tmp = names[2]; // 배열 names의 세 번째 요소를 tmp에 저장
//		System.out.println("tmp : " + tmp);
//		names[0] = "Yu"; // 배열 Names의 첫 번째 요소를 "Yu"로 저장, 원래는 "Kim"
//		
//		for(int i=0; i<names.length; i++) {
//			System.out.println(names[i]);
//		}
		
// 예제5-7(생략)
// 예제5-8
//		int[][] score = {
//				{100,100,100},
//				{20,20,20},
//				{30,30,30},
//				{40,40,40}
//		};
//		int sum = 0;
//		
//		for (int i=0; i<score.length; i++) {
//			for(int j=0; j<score[i].length; j++) {
//				System.out.printf("score[%d][%d]=%d%n", i, j, score[i][j]);
//				
//				sum += score[i][j];
//			}
//		}
//
//		System.out.println("sum = " + sum);
		
// 예제5-9(개인적으로 해보기)
// 예제5-10
//		String[][] words = {
//				{"chair", "의자"},
//				{"computer", "컴퓨터"},
//				{"integer", "정수"}
//			};
//		
//	    Scanner scanner = new Scanner(System.in);
//	    
//	    for (int i=0; i<words.length; i++) { // 소스 이해 안되면 브레이크포인트 찍고 디버깅 해보기 
//	    	System.out.printf("Q%d. %s의 뜻은?", i+1, words[i][0]); // words[i][0] : 문제
//	    	
//	    	String tmp = scanner.nextLine();
//	    	
//	    	if(tmp.equals(words[i][1])) { // words[i][1] : 답
//	    		System.out.printf("정답입니다.%n%n");
//	    	} else {
//	    		System.out.printf("틀렸습니다. 정답은 %s입니다. %n%n", words[i][1]);
//	    	}
//	    }
		
// p.153 배열의 출력 - toString()
//		int[] arr = {0,1,2,3,4};
//		int[][] arr2D = {{11,12}, {21,22}};
//		
//		System.out.println(Arrays.toString(arr));
//		System.out.println(Arrays.deepToString(arr2D));
		
// p.153 배열의 비교 - equals(), deepEquals()
//		String[][] str2D = new String[][] {{"aaa","bbb"},{"AAA","BBB"}};
//		String[][] str2D2 = new String[][] {{"aaa","bbb"},{"AAA","BBB"}};
//		
//		System.out.println(Arrays.equals(str2D, str2D2));
//		System.out.println(Arrays.deepEquals(str2D, str2D2));
		
// p.153 배열의 복사 - copyOf(): 일차원배열, copyOfRange(): 다차원배열 비교
//		int[] arr = {0,1,2,3,4};
//		int[] arr2 = Arrays.copyOf(arr,  arr.length);
//		// 첫 번째 매개변수 : 배열
//		// 두 번째 매개변수 : 복사할 처음 index 번호
//		// 세 번째 매개변수 : 복사할 끝 index + 1 번호
//		int[] arr5 = Arrays.copyOfRange(arr2,2,4);
//		
//		for(int i=0; i<2; i++) {
//			System.out.println(arr5[i]);
//		}
//		System.out.println("=======");
//		for(int i=0; i<5; i++) {
//			System.out.println(arr2[i]);
//		}
		
// p.153 배열의 정렬 - sort()
//		int[] arr = {3,2,0,1,4};
//		Arrays.sort(arr);
//		System.out.println(Arrays.toString(arr));
	}
}
