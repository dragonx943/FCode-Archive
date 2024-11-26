#include<stdio.h>

int main() {
	int a = 10;
	while (a<20) {
		printf("Gia tri cua a: %d\n", a);
		a++;
		
		if (a<15) {
			break;
		}
	}
	return 0;
}
