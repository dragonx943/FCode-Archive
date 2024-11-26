#include<stdio.h>

int main() {
	int a,b;
	
	char phepToan;
	printf("Nhap phep tinh (+, -, *, /): ");
	scanf("%s", &phepToan);
	
	printf("Nhap so a: ");
	scanf("%d", &a);
	printf("Nhap so b: ");
	scanf("%d", &b);
	
	switch(phepToan) {
		case '+':
			printf("%d + %d = %d", a, b, a + b);
			break;
		case '-':
			printf("%d - %d = %d", a, b, a - b);
			break;
		case '*':
			printf("%d * %d = %d", a, b, a * b);
			break;
		case '/':
			printf("%d / %d = %d", a, b, a / b);
			break;
	}
	
	return 0;
}
