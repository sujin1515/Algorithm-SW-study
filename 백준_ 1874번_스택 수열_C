#include <stdio.h>
int main(void){
	//c언어 미리 선언 및 초기화
   int n,i; // 입력할 숫자 개수
	int k; // 입력한 값
	int max = 0; // stack안 큰 값
	int top = 0; // stack의 최상단값
	int arindex =0;//배열의 인덱스값(주의)
	int stack[100000];
	char sb[100000]; 

	scanf("%d", &n);
	while(n--){ // 입력받은 값의 수가 0보다 클 때 까지
			scanf("%d", &k);
			if(k > max){
				for(i=max+1; i<=k; i++){
					stack[top++] = i;
					sb[arindex++] ='+';
				}
				max = k;
			}else if(stack[top-1] != k) { // 종료조건
				printf("NO");
				return; //메소드 종료.
			}
			top--;
			sb[arindex++] ='-';
		}
		for(i=0; i<arindex; i++)
			printf("%c\n", sb[i]);
		return 0;	
}
