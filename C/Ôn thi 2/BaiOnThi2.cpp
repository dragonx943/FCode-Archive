#include <stdio.h>
#include <string.h>

void baiTap1() {
    char a[100];
    printf("Nhap mot chuoi: ");
    getchar();
    gets(a);

    int doDai = strlen(a);
    printf("Chuoi dao nguoc: ");
    for (int i = doDai - 1; i >= 0; i--) {
        printf("%c", a[i]);
    }
    printf("\n");
}

void baiTap2() {
    char tu[100];
    printf("Nhap mot chuoi: ");
    getchar();
	  gets(tu);

    int doDai = strlen(tu);
    int boDem = 0;
    int a = 0;

    for (int i = 0; i < doDai; i++) {
        if (tu[i] != ' ' && tu[i] != '\n') {
            if (!a) {
                a = 1;
                boDem++;
            }
        } else {
            a = 0;
        }
    }

    printf("So tu trong chuoi: %d\n", boDem);
}

void baiTap3() {
    char hoTen[100];
    char maSo[20];
    float diemToan, diemLy, diemHoa;

    printf("Nhap ho va ten: ");
    getchar();
    gets(hoTen);

    printf("Nhap ma so sinh vien: ");
    gets(maSo);

    printf("Nhap diem Toan: ");
    scanf("%f", &diemToan);
    printf("Nhap diem Ly: ");
    scanf("%f", &diemLy);
    printf("Nhap diem Hoa: ");
    scanf("%f", &diemHoa);

    float diemTrungBinh = (diemToan + diemLy + diemHoa) / 3.0;

    printf("\nThong tin sinh vien:\n");
    printf("Ho va ten: %s\n", hoTen);
    printf("Ma so: %s\n", maSo);
    printf("Diem Toan: %.2f\n", diemToan);
    printf("Diem Ly: %.2f\n", diemLy);
    printf("Diem Hoa: %.2f\n", diemHoa);
    printf("Diem trung binh: %.2f\n", diemTrungBinh);
}

int main() {
    int select;
    do {
        printf("\nChon bai tap: \n");
        printf("1. Bai 1: Dao nguoc chuoi\n");
        printf("2. Bai 2: Dem so tu trong chuoi\n");
        printf("3. Bai 3: Nhap thong tin sinh vien\n");
        printf("0. Ket thuc chuong trinh\n");
        printf("Vui long nhap: ");
        scanf("%d", &select);

        switch (select) {
            case 1:
                baiTap1();
                break;
            case 2:
                baiTap2();
                break;
            case 3:
                baiTap3();
                break;
            case 0:
                printf("Ket thuc chuong trinh.\n");
                break;
            default:
                printf("Sai so! Vui long nhap lai!\n");
        }
    } while (select != 0);

    return 0;
}
