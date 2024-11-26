#include<stdio.h>
int main() {
	int i = 1;
	int tong = 0;
	int dem = 0;
	while(i<=20) {
		if(i%3 == 0) {
			tong+=i;
			dem++;
		}
		i++;
	}
	float Tb = (float)tong/dem;
	printf("Trung binh cua cac so chia het cho 3 la: %f", Tb);
	return 0;
}
