#include<stdio.h>

void tinhTong1() {
	int a,b,tong;
	printf("Nhap vao a: ");
	scanf("%d", &a);
	printf("Nhap vao b: ");
	scanf("%d", &b);
	tong = a+b;
	printf("Tong la: %d", tong);
}

void tinhTong2(int a, int b) {
	int tong = a + b;
	printf("Tong la: %d", tong);
}

int tinhTong3() {
	int a,b,tong;
	printf("Nhap vao a: ");
	scanf("%d", &a);
	printf("Nhap vao b: ");
	scanf("%d", &b);
	tong = a+b;
	printf("Tong la: %d", tong);
return tong;
}

int tinhTong4(int a, int b) {
	int tong;
	tong = a + b;
	printf("Tong la: %d", tong);
return tong;
}

int main() {
	tinhTong(3,4);
	return 0;
}
