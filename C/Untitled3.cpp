#include <stdio.h>

int main() {
	int math = 8, physics = 9, chemistry = 10;
	int trungbinh = (math + physics + chemistry) / 3;
	
	printf("Diem mon math: %d", math);
	printf("\nDiem mon physics: %d", physics);
	printf("\nDiem mon chemistry: %d", chemistry);
	printf("\nTrung binh 3 mon: %d", trungbinh);
	
	return 0;
}
