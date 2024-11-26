#include<stdio.h>

int main() {
	float diemThi;
	
	printf("Nhap diem thi cua sinh vien: ");
	scanf("%f", &diemThi);
	
	if (diemThi >= 5.0) {
		printf("Dat!");
	} else {
		printf("Khong dat!");
	}
	return 0;
}
