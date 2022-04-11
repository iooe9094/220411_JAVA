package ex;

public class string_exe {

	public static void main(String[] args) {
		
// 자바 String 유용한 메소드 정리
//		
// 1. substring : 문자열 자르기
//		사용법 : substring()
//		substring(int start) : start부터 끝까지 문자열을 자르기
//		substring(int start, int end) : start부터 end까지 자름
//		return값 : 잘린 문자열
		
//		String tmp_str = "abcdedfgh";
//		String sub1 = tmp_str.substring(5); // 결과값 dfgh
//		String sub2 = tmp_str.substring(1,4); // bcd
//		
//		System.out.println("sub1 = " + sub1);
//		System.out.println("sub2 = " + sub2); // end는 포함되지 않는다.
		
// 2. length : 문자열의 길이 구하기
//		사용법 : length()
//		리턴값 : 정수, 문자열 길이
//		
//		String string1 = "java";
//		String string2 = "메소드 설명";
//		
//		System.out.println("string1.length() = " + string1.length());
//		System.out.println("string2.length() = " + string2.length());
		
// 3. split : 문자열 나누기
//		String[] split(String divider)
//		함수의 설명 : 문자열을 자를 분리자로 나눠서 문자열 배열에 담아 반환함 
//		첫 번째 매개변수 : 분리자 
//		리턴값 : 분리자로 잘린 문자열 배열 
//		
//	    String str_num = "123^4567^890";
//	    String[] arr = str_num.split("\\^"); // 분리자: ^ 특수문자는 앞에 \\ 붙임 
//		
//	    System.out.println("arr[0] = " + arr[0]);
//	    System.out.println("arr[0] = " + arr[1]);
//	    System.out.println("arr[0] = " + arr[2]);
		
// 4. equals : 문자열 일치 여부 검사 
//		boolean equals(Object obj)
//		첫 번째 매개변수 : 문자열 객체가 들어옴 
//		리턴값 : 일치하면 참(true), 틀리면 거짓(false)
//		
//		String s = "Hello Java";
//		boolean c1 = s.equals("Hello Java");
//		boolean c2 = s.equals("hello Java");
//		
////		문자열 비교 시 " == " 안됨. 
////		ex) if("abc" == "abc") 사용불가
////		    if("abc".equals("abc") == true) : 0 사용가능
////		    [참고] if('a' == 'a') 사용가능 / 한 문자일 경우이기 때문
//
//		System.out.println("c1 = " + c1);
//		System.out.println("c2 = " + c2);
		
// 5. contains : 문자열에 포함된 문자가 있는지 검사 
//		boolean contain(문자열)
//		첫 번째 매개변수 : 검사할 문자열 
//		리턴값 : 검사할 문자열이 있으면 true, 없으면 false
//		
//		String string1 = "abcdefgh";
//		boolean a1 = string1.contains("efg");
//		boolean a2 = string1.contains("xy");
//		
//		System.out.println("a1 = " + a1);
//		System.out.println("a2 = " + a2);
		
// 6. startWith, endsWith : 문자열 시작 또는 끝 부분에 일치하는 문자열이 있는지 검사
//	    boolean startsWith(String s) : 문자열 s로 '시작'하는지 검사, 맞으면 true 틀리면 false
//	    boolean endsWith(String s) : 문자열 s로 '끝'나는지 검사, 맞으면 true 틀리면 false
//		
//	    String string1 = "http://www.naver.com";
//	    boolean b1 = string1.startsWith("http");
//	    boolean b2 = string1.startsWith("https");
//	    boolean b3 = string1.endsWith("com");
//	    boolean b4 = string1.endsWith("net");
//	    
//	    System.out.println("b1 = " + b1);
//	    System.out.println("b2 = " + b2);
//	    System.out.println("b3 = " + b3);
//	    System.out.println("b4 = " + b4);
		
// 7. replace : 문자열을 임의의 문자열로 바꾸기 
//      String replace(원본 문자열, 바꿀 문자열)
//		리턴값 : 바뀐 문자열 
//		
//		String tmp_str = "ABCDEF";
//		
//		String string2 = tmp_str.replace("DE", "XX");
//		
//		System.out.println("string2 = " + string2);
		
// 8. trim : 문자열 좌우의 공백 없애기 
//      String trim()
//      리턴값 : 문자열 처음과 끝의 공백을 없앤 문자열
//		
//	    String tmp_str = "  hello java test     ";
//	    String trim_test = tmp_str.trim();
//	    
//	    System.out.println("origin = " + tmp_str);
//	    System.out.println("trim_test = " + trim_test);
		
// 9. toLowerCase : 문자열의 대문자를 소문자로 바꾸기
//		String toLowerCase()
//		리턴값 : 소문자로 모두 바꾼 문자열
//		
//		String tmp_str = "Java Programming Test";
//		String tmp_lower = tmp_str.toLowerCase();
//		
//		System.out.println("tmp_lower = " + tmp_lower);
		
// 10. toUpperCase : 문자열의 소문자를 대문자로 바꾸기
//      String toUpperCase()
//		리턴값 : 대문자로 모두 바꾼 문자열
//		
//		String tmp_str = "Java Programming Test";
//		String tmp_upper = tmp_str.toUpperCase();
//		
//		System.out.println("tmp_upper = " + tmp_upper);
		
// 11. charAt() : 문자열에서 매개변수의 index번호에 해당하는 문자 하나를 반환
//		char charAt(int index)
//	    첫 번째 매개변수 : 문자열 배열의 index 번호
//		리턴값 : 문자열 index 번호에 해당하는 문자 하나(char)
//		
//		String str = "abcdefg";
//		
//		char chr = str.charAt(1);
//		char chr2 = str.charAt(str.length() - 1); // 마지막 인덱스 번호 찾기
//		
//		System.out.println("chr = " + chr);
//		System.out.println("chr2 = " + chr2);
		
// 12. indexOf(찾을문자열) : 문자열 중 찾을 문자열이 나오는 첫 index번호를 반환
//		int indexOf(String str)
//		첫 번째 매개변수 : 찾을 문자열
//		리턴값 : 정수, 찾은 문자열의 index 번호, 찾은 문자열이 없으면 -1(무조건)
		
		String str = "abcdefg hi";
		
		int index = str.indexOf("a"); // 한 문자
		int index2 = str.indexOf("hi"); // 여러 문자
		int index3 = str.indexOf("j"); // 없는 문자
		
		System.out.println("index = " + index);
		System.out.println("index2 = " + index2);
		System.out.println("index3 = " + index3);
	}
}
