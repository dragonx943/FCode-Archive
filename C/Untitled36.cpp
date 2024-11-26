#include<stdio.h>

int main() {
	int tuoi;
	
	printf("Nhap tuoi cua ban: ");
	scanf("%d", &tuoi);
	
	if (tuoi >= 0 && tuoi <= 12) {
		printf("Tre em!");
	} else if (tuoi >= 13 && tuoi <= 19) {
		printf("Thieu nien!");
	} else if (tuoi >= 20 && tuoi <= 59) {
		printf("Nguoi lon!");
	} else {
		printf("Nguoi gia!");
	}
	
	return 0;
}
