#include <stdio.h>

int main() {
    int soNguyen;
    printf("Nhap vao mot so nguyen: ");
    scanf("%d", &soNguyen);

    int so = 0;
    int i = 2;
    
    while(i < soNguyen) {
        if(soNguyen % 2 == 0) {
        	so++;
		}
        i++;
    }

    if(so > 0) {
        printf("%d khong phai la so nguyen to", soNguyen);
    } else {
        printf("%d la so nguyen to", soNguyen);
    }

    return 0;
}
