#include <stdio.h>

int main() {
	int tuoi;
	printf("Nhap do tuoi cua ban: ");
	scanf("%d", &tuoi);
	
	if (tuoi >= 18 && tuoi <= 35) {
		printf("Ban da du tuoi de tham gia chuong trinh, an Enter de tiep tuc!");
	}
	else {
		printf("Ban khong du tuoi de tham gia chuong trinh, hay thu lai sau!");
	}

	return 0;
}
