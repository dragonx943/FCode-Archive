#include<stdio.h>

int main() {
	int soNhan = 1;
	while (soNhan <= 10) {
		printf("Bang cuu chuong %d\n", soNhan);
		int soBinhan = 1;
		while (soBinhan <= 10) {
			printf("%d * %d = %d\n", soNhan, soBinhan, soNhan * soBinhan);
			soBinhan++;
		}
		printf("\n");
		soNhan++;
	}
	return 1;
}

