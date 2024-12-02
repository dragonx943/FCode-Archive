#include<stdio.h>

void chuongTrinh1() {
	int a;
	char tenNhanVien[100][100];
	int tuoiNhanVien[100];
	int soNamKN[100];
	printf("Nhap so nhan vien hien co: ");
	scanf("%d", &a);
	
	for (int i=0; i <= a-1; i++) {
		fflush(stdin);
		printf("Nhap thong tin cua nhan vien %d:\n", i+1);
		printf("Ten nhan vien %d: ", i+1);
		fgets(tenNhanVien[i], sizeof(tenNhanVien), stdin);
		printf("Tuoi nhan vien %d: ", i+1);
		scanf("%d", &tuoiNhanVien[i]);
		printf("So nam kinh nghiem cua nhan vien %d: ", i+1);
		scanf("%d", &soNamKN[i]);
	}
	
	for (int i=0; i <= a-1; i++) {
		printf("++++++++++++++++++++++++++++++++++++\n");
		printf("Thong tin cua nhan vien %d: \n", i+1);
		printf("Ten nhan vien: %s", tenNhanVien[i]);
		printf("Tuoi nhan vien: %d\n", tuoiNhanVien[i]);
		printf("So nam kinh nghiem: %d\n", soNamKN[i]);
		if (soNamKN[i] < 1) {
			printf("Tinh trang: Nhan vien moi!\n");
		} else {
			printf("Tinh trang: Nhan vien co kinh nghiem!\n");
		}
	}
}

int chuongTrinh2(int a) {
	if (a % 2 == 0) {
		printf("So %d la so chan!\n", a);
	} else {
		printf("So %d la so le!\n", a);
	}
	
	printf("Cac so tu 1 den %d la: \n", a);
	for (int i=1; i <= a; i++) {
		printf("%d ", i);
	}
	printf("\n");
}

void chuongTrinh3() {
	int a;
	int count=0;
	int soNamKN[100];
	int max=0;
	printf("Nhap so nhan vien hien co: ");
	scanf("%d", &a);
	
	for (int i=0; i <= a-1; i++) {
		fflush(stdin);
		printf("Nhap so nam kinh nghiem cua nhan vien %d: ", i+1);
		scanf("%d", &soNamKN[i]);
	}
	
	printf("So nhan vien hien co: %d\n", a);
	for (int i=0; i < a; i++) {
		if (soNamKN[i] > 3) {
			count++;
		}
	}
	printf("So nhan vien co so nam kinh nghiem > 3: %d\n", count);
	
	max = soNamKN[0];
	for (int i=1; i < a; i++) {
		if (soNamKN[i] > max) {
			max = soNamKN[i];
		}
	}
	printf("Tham nien lau nhat: %d\n", max);
}

int main() {
	int select;
	do {
		printf("+-----------------------MENU-----------------------+\n");
		printf("1. Nhap thong tin nhan vien\n");
		printf("2. Xu ly so chan\n");
		printf("3. Thong ke kinh nghiem nhan vien\n");
		printf("0. Thoat\n");
		printf("+-------------------------------------------------+\n");
		printf("Moi chon: ");
		scanf("%d", &select);
		
		switch (select) {
			case 1:
				printf("Thuc hien chuong trinh 1!\n");
				chuongTrinh1();
				break;
			case 2:
				int n;
				printf("Thuc hien chuong trinh 2!\n");
				printf("Vui long nhap so n: ");
				scanf("%d", &n);
				if (n <= 0) {
					printf("Khong phai so nguyen duong, ket thuc chuong trinh!\n");
					break;
				}
				chuongTrinh2(n);
				break;
			case 3:
				printf("Thuc hien chuong trinh 3!\n");
				chuongTrinh3();
				break;
			case 0:
				printf("Thoat chuong trinh!");
				break;
			default:
				printf("Sai so, vui long chon lai!\n");
				break;
		}
	} while (select != 0);
	return 0;
}
