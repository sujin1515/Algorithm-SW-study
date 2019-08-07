import java.util.Scanner;
import java.io.FileInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

class Solution
{
	static HashMap<Character, Integer> hashMap = new HashMap<>();
    static int[] keyMap;
	static int Answer;
	static int N;
	
	public static void main(String args[]) throws Exception	{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        	StringTokenizer st = null;
        	String[] temp = null;
		init(); //해쉬맵 초기화 함수(키패드)

		int k = Integer.parseInt(br.readLine()); //시도할 test case수
		for(int i = 0; i< k; i++) { //test case를 0~k까지 시도
			System.out.print("#"+(i+1) + " ");
			st = new StringTokenizer(br.readLine(), " ");

			temp = st.nextToken().split(""); //첫줄 공백을 간격으로 temp변수에 넣기
			N = Integer.parseInt(st.nextToken()); 

			keyMap = new int[temp.length];
			for(int j = 0; j < temp.length; j++)
			    keyMap[j] = Integer.parseInt(temp[j]);

			st = new StringTokenizer(br.readLine(), " "); //둘째줄 st변수에 string넣기 
			for(int j = 0; j < N; j++)
			    Answer += FastCellPhoneKeypad(st.nextToken()); //함수실행

			System.out.println(Answer);
			Answer = 0;
		}
		br.close();
	}


	static void init() {
		hashMap.put(' ', 1);
        
		hashMap.put('a', 2);
		hashMap.put('b', 2);
		hashMap.put('c', 2);
        
		hashMap.put('d', 3);
		hashMap.put('e', 3);
		hashMap.put('f', 3);
        
		hashMap.put('g', 4);
		hashMap.put('h', 4);
		hashMap.put('i', 4);
        
		hashMap.put('j', 5);
		hashMap.put('k', 5);
		hashMap.put('l', 5);

		hashMap.put('m', 6);
		hashMap.put('n', 6);
		hashMap.put('o', 6);

		hashMap.put('p', 7);
		hashMap.put('q', 7);
		hashMap.put('r', 7);
		hashMap.put('s', 7);

		hashMap.put('t', 8);
		hashMap.put('u', 8);
		hashMap.put('v', 8);

		hashMap.put('w', 9);
		hashMap.put('x', 9);
		hashMap.put('y', 9);
		hashMap.put('z', 9);
	}

	static int FastCellPhoneKeypad(String word) {
	    if(word.length() != keyMap.length) //입력받은 문자와 keyMap의 길이 비교
	        return 0;
	    for(int i = 0; i < keyMap.length; i++) {
            if (keyMap[i] == hashMap.get(word.charAt(i))) {
                continue;
            } else
                return 0;
        }
        return 1;
    }
}
