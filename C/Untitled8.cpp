#include <stdio.h>

int main() {
	int a,b;
	int tong, hieu, tich;
	float thuong;
	
	printf("Nhap vao so a: ");
	scanf("%d", &a);
	
	printf("Nhap vao so b: ");
	scanf("%d", &b);
	
	tong = a+b;
	hieu = a-b;
	tich = a*b;
	
	printf("\nTong la: %d", tong);
	printf("\nHieu la: %d", hieu);
	printf("\nTich la: %d", tich);
	// printf("\nThuong la: %d", thuong);
	// Kiem tra neu b = 0 thi in ra "Loi"
	
	if (b != 0) {
		thuong = (float)a/b;
		printf("\nThuong la: %.2f", thuong);
	}
	else {
		printf("\nLoi - Khong the chia voi so 0!");
	}
	
	return 0;
}
