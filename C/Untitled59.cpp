#include<stdio.h>

int main() {
	int namHoc;
	int soLuongHS;
	printf("Nhap so luong ho so can xet: ");
	scanf("%d", &soLuongHS);
	printf("Nhap nam hoc cua tung sinh vien!\n");
	for (int i = 1; i <= soLuongHS; i++) {
		printf("Nhap so ho so thu %d: ", i);
		scanf("%d", &namHoc);
		if (namHoc == 4) {
			printf("Ho so thu %d la sinh vien nam cuoi!\n", i);
		}
		else {
			printf("La sinh vien dang hoc, chua ra truong!\n");
		}
	}
	
	return 0;
}
