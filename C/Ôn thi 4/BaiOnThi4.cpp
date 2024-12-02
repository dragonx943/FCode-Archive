#include<stdio.h>

void chuongTrinh1() {
	fflush(stdin);
	
	int d;
	int a[100]; 
	int nhanVien[100];
	char tenNhanVien[100][100];
	int tuoiNhanVien[100];
	int soNamKN[100];
	printf("Nhap so nhan vien hien co: ");
	scanf("%d", &d);

	fflush(stdin);

	for (int i=0; i <= d-1; i++) {
		fflush(stdin);
		printf("Nhap ten cua nhan vien %d: ", i+1);
		fgets(tenNhanVien[i], sizeof(tenNhanVien[i]), stdin);
		printf("Nhap tuoi cua nhan vien %d: ", i+1);
		scanf("%d", &tuoiNhanVien[i]);
		printf("Nhap so nam kinh nghiem cua nhan vien %d: ", i+1);
		scanf("%d", &soNamKN[i]);
	}
	
	fflush(stdin);
	printf("================================================\n");
	printf("Thong tin cua tung nhan vien: \n");
	for (int i=0; i <= d-1; i++) {
		printf("Nhan vien %d: \n", i+1);
		printf("Ten nhan vien: %s", tenNhanVien[i]);
		printf("Tuoi: %d\n", tuoiNhanVien[i]);
		printf("So nam kinh nghiem: %d\n", soNamKN[i]);
		if (tuoiNhanVien[i] < 55) {
			printf("Nhan vien dang lam!\n");
		}
		else {
			printf("Nhan vien da nghi huu!\n");
		}
		printf("++++++++++++++++++++++++++++++++++++\n");
	}
}

int chuongTrinh2(int a) {
	if (a % 2 == 0) {
		printf("N la so chan!\n");
	}
	else {
		printf("N la so le!\n");
	}
	
	printf("Cac so chan tu 1 den %d: \n", a);
	for (int i=1; i <= a; i++) {
		if (i % 2 == 0) {
			printf("%d ", i);
		}
	}
	printf("\n");
}

void chuongTrinh3() {
	int d;
	int soCV[100];
	printf("Nhap so nhan vien hien co: ");
	scanf("%d", &d);

	fflush(stdin);
	
	for (int i=0; i <= d-1; i++) {
		printf("Nhap so cong viec cua nhan vien %d: ", i+1);
		scanf("%d", &soCV[i]);
		fflush(stdin);
	}
	
	int tong = 0;
	int max = soCV[0];
	for (int i=0; i <= d-1; i++) {
		tong += soCV[i];
		if (soCV[i] > max) {
			max = soCV[i];
		}
	}
	
	float TrungBinh = (float)tong / d;
	printf("================================================\n");
	printf("============== Tong ket thong tin: \n");
	printf("So luong nhan vien: %d\n", d);
	printf("So cong viec trung binh: %.2f\n", float(TrungBinh));
	printf("So cong viec nhieu nhat: %d\n", max);
}

int main() {
	int select;
	do {
		printf("+-----------------------MENU-----------------------+\n");
		printf("1. Nhap thong tin nhan vien\n");
		printf("2. Xu ly so le\n");
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
				printf("Nhap so n: ");
				scanf("%d", &n);
				chuongTrinh2(n);
				break;
			case 3:
				printf("Thuc hien chuong trinh 3!\n");
				chuongTrinh3();
				break;
			default:
				printf("Nhap sai so, vui long thu lai!\n");
				break;
		}
	} while (select != 0);
  return 0;
}
