#include<stdio.h>

int main() {
	int so;
	printf("Nhap so: ");
	scanf("%d", &so);
	
	do {
		if (so % 2 == 0) {
			printf("Day la so chan!");
			return 1;
		} else {
			printf("Day la so le!");
			return 1;
		}
	}
	
	while (so > 0);
	return 1;
}
