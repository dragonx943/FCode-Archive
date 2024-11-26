#include <stdio.h>
#define PRICE_PER_ITEM 20.5

int main () {
	int quantity = 10;
	float tongtien = quantity * PRICE_PER_ITEM;
	
	printf("Gia san pham: %.2f", PRICE_PER_ITEM);
	printf("\nSo luong mua: %d", quantity);
	printf("\nTong tien thanh toan: %.2f", tongtien);
	
	return 0;
}
