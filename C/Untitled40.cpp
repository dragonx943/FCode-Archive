#include<stdio.h>

int main(){
 	char diem;
 	
    printf("Nhap vao diem so (A,B,C,D,F): ");
    scanf("%c", &diem);
    
        switch(diem) {
            case 'A':
                printf("Xuat sac!");
                break;
            case 'B':
                printf("Gioi!");
                break;
            case 'C':
                printf("Kha!");
                break;
            case 'D':
                printf("Trung binh!");
                break;
            case 'F':
                printf("Yeu!");
                break;
            default:
                printf("Khong hop le!");
                break;
        }       
       
    return 0;
}
