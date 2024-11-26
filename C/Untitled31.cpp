#include<stdio.h>

int main() {
	int data;
	
	printf("Nhap so nguyen a: ");
	scanf("%d", &data);
	
	if (data %2 == 0) {
		printf("a la so chan");
	} else {
		printf("a khong phai la so chan");
	}
	return 0;
}
