#include<stdio.h>

int main() {
	int a = 10;
	
	TEST: do {
		if (a == 15) {
			a = a + 1;
			goto TEST;
		}
		printf("Gia tri cua a: %d\n", a);
		a++;
	}
	while (a < 20);
	return 0;
}
