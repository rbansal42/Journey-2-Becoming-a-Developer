#include <stdio.h>
#include <stdlib.h>

void arrayInsertion(int arr[], int *n, int size, int pos, int x) 
/*
arr is an array containing n elements, and is of size size. x is the element that is to be inserted at position pos.
*/
{

    if (*n == size)
    {
        printf("Overflow");
        exit(0);
    }
    

    for (int i = *n-1; i >= pos-1; i--)
    {
        arr[i + 1] = arr[i];
    }
    
    arr[pos] = x;
    *n = *n + 1;
}

int main() {

    int lenOfArr = 15;
    int arr[lenOfArr];

    int* noOfElementsinArr;
    *noOfElementsinArr = 5;

    for (int i = 0; i < *noOfElementsinArr; i++)
    {
        // printf("Enter number %d: ", i+1);
        // scanf("%d", &arr[i]);

        arr[i] = i;

    }

    printf("\n");
    for(int i = 0; i < *noOfElementsinArr; i++) {

        printf("%d\t", arr[i]);
    }

    arrayInsertion(arr, noOfElementsinArr, lenOfArr, 3, 10);
    printf("\n");
    for(int i = 0; i < *noOfElementsinArr; i++) {

        printf("%d\t", arr[i]);
    }



}
