#include<stdio.h>

void nhapThongTinCaNhan() {
    char ten[100], diaChi[100], kyHoc[100], chuyenNganh[100];
    int tuoi = 0;
    
    getchar(); // Ngan chan nhay du lieu khi nhap
    
    printf("Nhap ten: ");
    fgets(ten, sizeof(ten), stdin);
    
    printf("Nhap tuoi: ");
    scanf("%d", &tuoi);
    getchar();
    
    while (tuoi < 1 || tuoi > 100) {
        printf("Tuoi khong hop le! Chay lai chuong trinh!\n");
        break;
    }
    
    printf("Nhap dia chi: ");
    fgets(diaChi, sizeof(diaChi), stdin);
    
    printf("Nhap ky hoc: ");
    fgets(kyHoc, sizeof(kyHoc), stdin);
    
    printf("Nhap chuyen nganh: ");
    fgets(chuyenNganh, sizeof(chuyenNganh), stdin);
    
    printf("===================================\n");
    printf("Thong tin bao gom:\n");
    printf("Ten: %s", ten);
    printf("Tuoi: %d\n", tuoi);
    printf("Dia chi: %s", diaChi);
    printf("Ky hoc: %s", kyHoc);
    printf("Chuyen nganh: %s", chuyenNganh);
}

int tinhTong(int n) {
	int tong;
	
	for (int i=1; i <= n; i++) {
		tong+=i;
	}
	
	printf("Tong tu 1 den %d la: %d\n", n, tong);
}

void thongTinSinhVienCacLop () {
	int soLop;
	printf("Nhap so lop: ");
	scanf("%d", &soLop);
	
	int a[100];
	for (int i=1; i<=soLop; i++) {
		int soSV = 0;
		printf("Nhap so luong sinh vien lop %d: ", i);
		scanf("%d", &a[i]);
	}
	
	printf("===================================\n");
	for (int i=1; i<=soLop; i++) {
		printf("So luong sinh vien lop %d: %d\n", i, a[i]);
	}
	
	int b[100] = {0};
	int boDem = 0;
	
	for (int i = 0; i <= soLop; i++) {
        if (a[i] < 30) {
            b[boDem] = i;
            boDem++;
        }
    }
	
	printf("Cac lop co so luong SV nho hon 30 la:\n");
	for (int j=0; j < boDem; j++) {
		printf("%d ", b[j]);
	}
}

int main() {
    int luaChon;
    do {
        printf("+--------------------------Menu------------------------+\n");
        printf("1. Nhap thong tin ca nhan\n");
        printf("2. Tinh tong\n");
        printf("3. Thong tin sinh vien cac lop\n");
        printf("0. Thoat\n");
        printf("+--------------------------------------------------------+\n");
        printf("Moi chon: ");
        scanf("%d", &luaChon);

        switch (luaChon) {
            case 1:
                nhapThongTinCaNhan();
                break;
            case 2:
            	int n;
				printf("Nhap so n: ");
				scanf("%d", &n);
                tinhTong(n);
                break;
            case 3:
                thongTinSinhVienCacLop();
                break;
            case 0:
                printf("Thoat ung dung!");
                break;
            default:
                printf("Lua chon khong hop le, vui long chon lai!\n");
        }
    } while (luaChon != 0);

    return 0;
}
