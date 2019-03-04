import java.io.*;
public class Main{
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder(); // String 연산 시간을 줄이기 위해

		int n = Integer.parseInt(br.readLine()); // 입력할 숫자 갯수

		int k; // 입력한 값
		int max = 0; // stack안 큰 값
		int top = 0; // stack의 최상단값
		int[] stack = new int[n];

		while(n-- > 0){ // 입력받은 값의 수가 0보다 클 때 까지
			k = Integer.parseInt(br.readLine());
			if(k > max){
				for(int i=max+1; i<=k; i++){
					stack[top++] = i;
					sb.append("+\n"); // push
				}
				max = k;
			}else if(stack[top-1] != k) { // 종료조건(오름차순push에 의해 최상단의 값= k여야함. 아닐경우, 종료)
				System.out.println("NO");
				return; // 아예 메소드를 종료.
			}
			// 무조건 한번은 pop을 하기 때문에
			top--;
			sb.append("-\n"); // pop
		}
		System.out.println(sb);
}
