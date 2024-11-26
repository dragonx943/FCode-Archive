#include<stdio.h>

int main() {
    int nam;
	printf("Nhap vao thang trong nam (1-12): ");
	scanf("%d", &nam);

    switch (nam)
    {
        case 12:
        case 1:
        case 2:
            printf("Mua dong!");
            break;
            
        case 3:
        case 4:
        case 5:
            printf("Mua Xuan!");
            break;
            
        case 6:
        case 7:
        case 8:
            printf("Mua Ha!");
            break;
            
        case 9:
        case 10:
        case 11:
            printf("Mua Thu!");
            break;
            
        default:
            printf("Thang khong hop le!");
            break;
	}
	
    return 0;
}
