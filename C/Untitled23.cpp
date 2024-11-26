#include<stdio.h>
#define PI 3.14

int main() {
	int banKinh;
	printf("Nhap ban kinh: ");
	scanf("%d", &banKinh);
	
	float chuVi = 2*PI*banKinh;
	float dienTich = banKinh*banKinh*PI;
	
	printf("Chu vi: %.3f", chuVi);
	printf("\nDien tich: %.3f", dienTich);
	
	return 0;
}
