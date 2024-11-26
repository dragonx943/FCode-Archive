#include<stdio.h>

int main() {
	int ngay;
	printf("Nhap ngay (1-7): ");
	scanf("%d", &ngay);
	
	switch(ngay) {
		case 1:
			printf("Chu nhat");
			break;
		case 2:
			printf("Thu hai");
			break;
		case 3:
			printf("Thu ba");
			break;
		case 4:
			printf("Thu nam");
			break;
		case 5:
			printf("Thu sau");
			break;
		case 6:
			printf("Thu bay");
			break;
		case 7:
			printf("Chu nhat");
			break;
	}
	
	return 0;
}
