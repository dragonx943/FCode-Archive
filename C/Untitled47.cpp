#include<stdio.h>

int main() {
	int so;
	int tong = 0;
	
	do {
		printf("Nhap so nguyen duong: ");
		scanf("%d", &so);
		if (so >0) {
			tong+=so;
		}
	} while(so>0);
	printf("Tong cua cac so duong da nhap: %d", tong);
	
	return 0;
}
