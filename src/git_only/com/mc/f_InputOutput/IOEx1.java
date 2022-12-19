package git_only.com.mc.f_InputOutput;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class IOEx1 {

	public static void main(String[] args) {

		// byte 타입 배열 생성
		byte[] inSrc = {1,2,3,4,5,6,7,8,9}; // 입력받을 값
		byte[] outSrc = null; // 내보낼 값, 아직은 없다
		byte[] temp = new byte[10]; // 넉넉히 바구니 공간 만들기
		
		ByteArrayInputStream input = null; // 아직 입력안받았으니까 널?
		ByteArrayOutputStream output = null; // 아직 내보낼 준비 안됐으니까 널
		

		input = new ByteArrayInputStream(inSrc); // 입력받은 상황
		output = new ByteArrayOutputStream(); // 내보낼 값 대기
		
		input.read(temp,0,temp.length); // 배열 temp의 최대 temp.length 개의 바이트를 읽어서 지정된위치 0부터 저장한다.
		output.write(temp,5,5); // temp 배열의 5부터 5개 만큼 읽어서 출력소스에 쓴다.
				
		outSrc = output.toByteArray(); // 스트림의 내용을 byte 배열로 반환한다. 다시 쏴줘야하니까?
		
		System.out.println("Input Source :" + Arrays.toString(inSrc));
		System.out.println("temp : " + Arrays.toString(temp));
		System.out.println("Output Source :" + Arrays.toString(outSrc));
		
		
	}

}
