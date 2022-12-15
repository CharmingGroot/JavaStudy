package git_only.com.mc.b_stringClass;

public class B_StringEX6 {
	public static void main(String[] args) {
		int iVal = 100;
		String strVal = String.valueOf(iVal); // int를 String으로 캐스팅
		
		double dVal = 200.0;
		String strVal2 = dVal + ""; // 공백 더하면 String타입으로 캐스팅된다.
		
		double sum = Integer.parseInt("+"+ strVal)+Double.parseDouble(strVal2);
		double sum2 = Integer.valueOf(strVal) + Double.valueOf(strVal2);
		
		System.out.println(String.join("",strVal,"+",strVal2+"=")+sum); // 빈 문자열은 구분자를 전달하는 매개변수이다.
		System.out.println(strVal+"+"+strVal2+"="+sum2);
		
	}
}
