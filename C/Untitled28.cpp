#include<stdio.h>
#include <string.h>

int main() {
	int tuoi;
	
	printf("Nhap so tuoi cua ban: ");
	scanf("%d", &tuoi);
	
	if (tuoi >= 18) {
		char password[100];
		printf("Nhap mat khau de dang ky: ");
		scanf("%s", password);
		
		int doDaiMatKhau = strlen(password);
		if (doDaiMatKhau >= 8) {
			printf("Da dang ky thanh cong!");
		}
		else {
			printf("Mat khau phai co it nhat 8 ki tu, da huy dang ky!");
		}
	}
	
	else {
		printf("Ban khong du tuoi de tham gia dang ky!");
	}
	
	return 0;
}
