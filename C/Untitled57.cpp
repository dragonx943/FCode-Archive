#include<stdio.h>

int main() {
	int so;
	
	do {
		printf("Nhap so nguyen duong: ");
		scanf("%d", &so);
		
		if (so <= 0) {
			printf("So nhap vao khong hop le. Vui long nhap lai.\n");
		}
	}
	while (so <= 0);
	
	return 0;
}
