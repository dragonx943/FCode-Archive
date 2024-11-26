#include <stdio.h>

int main() {
	float diem;
	
	printf("Nhap diem cua sinh vien: ");
	scanf("%f", &diem);
	
	if (diem >= 9) {
		printf("Xuat sac!!!!!\n");
	} else if (diem >= 8) {
		printf("Gioi!!!!!\n");
	} else if (diem >= 7) {
		printf("Kha!!!!!\n");
	} else if (diem >= 5) {
		printf("Trung binh!!!!!\n");
	} else if (diem >= 3) {
		printf("Yeu!!!!!\n");
	} else {
		printf("Kem!!!!!\n");
	}
	return 0;
}
