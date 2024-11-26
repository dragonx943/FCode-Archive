#include <stdio.h>

int main() {
	int tuoi, soVe;
	
	printf("Nhap tuoi cua ban: ");
	scanf("%d", &tuoi);
	printf("Nhap so ve cua ban: ");
	scanf("%d", &soVe);
	
	if (tuoi >= 18 && tuoi <= 25 || soVe >= 3) {
		printf("Giam gia!");
	}
	else {
		printf("Khong giam gia!");
	}
	
	return 0;
}
