#include<stdio.h>

int main() {
	int i = 0;
	int tong = 0;
	while (i <= 100) {
		if (i % 2 == 0) {
			tong += i;
		}
		i++;
	}
	printf("Tong la: %d", tong);
	return 0;
}
