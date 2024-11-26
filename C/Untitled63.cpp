#include <stdio.h>

int main() {
    int n, soNT = 1;
    printf("Nhap so tu ban phim: ");
    scanf("%d", &n);
    
    if (n <= 1) {
    	soNT = 0; // Cac so <= 1 khong phai la so nguyen to
    }
    
    else {
    	for (int i=2; i <= n/2; i++) {
        	if (n % i == 0) {
            	soNT = 0; // Khong phai so nguyen to
            	break;
        	}
    	}
	}
    
    if (soNT == 1) {
        printf("%d la so nguyen to\n", n);
    } else {
        printf("%d khong la so nguyen to\n", n);
    }
    
    return 0;
}
