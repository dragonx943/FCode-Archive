#include<stdio.h>

int main() {
	int a,b;
	printf("Nhap vao so a: ");
	scanf("%d", &a);
	printf("Nhap vao so b: ");
	scanf("%d", &b);
	
	int tong = a+b;
	int hieu = a-b;
	
	printf("Tong: %d", tong);
	printf("\nHieu: %d", hieu);
	return 0;
}
