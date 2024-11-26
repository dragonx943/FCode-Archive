#include <stdio.h>

int main() {
	int chieudai, chieurong, dientich;
	
	printf("Nhap chieu dai hinh chu nhat: ");
	scanf("%d", &chieudai);
	printf("Nhap chieu rong hinh chu nhat: ");
	scanf("%d", &chieurong);
	
	dientich = chieudai * chieurong;
	printf("Dien tich cua hinh chu nhat la: %d", dientich);
	
	return 0;
}
