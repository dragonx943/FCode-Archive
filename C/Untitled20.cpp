#include<stdio.h>

int main() {
	int giaSP;
	float giam = 0.2;
	
	printf("Hay nhap gia goc cua san pham: ");
	scanf("%d", &giaSP);
	
	float giaSau = giaSP;
	giaSau *= giam;
	giaSP -= giaSau;
	
	printf("Gia cua san pham sau khi giam: %d", giaSP);
	
	return 0;
}
