#include <stdio.h>
#include <math.h>

/* 
Problem statement: Write a function to find out the largest and smallest number of a given array.
*/

void minMax(int arr[], int n) // arr is array with 'n' elements.
{

    int min = arr[0], max = arr[0], i=0;

    while (i < n)
    {  
        if(arr[i] < min) {
            min = arr[i];
        }
        if(arr[i] > max) {
            max = arr[i];
        }
        i++;
    }
    
    printf("\n");
    printf("The largest no in the array is: %d\n", max);
    printf("The smallest no in the array is: %d\n", min);


}

/* 
Problem statement: Write a function to find out the numbers greater than the average of the array.
*/

int greaterThanAverage(int arr[], int n) //arr is an array with 'n' elements.
{
    int count = 0, avg=0;

    // Finding the average of the elements in the array.
    for (int i = 0; i < n; i++)
    {
        avg += arr[i];
    }

    avg = avg/n;          //Dividing the sum of elements by no of elements to find average
    printf("\nThe average is: %d\n", avg);


    for (int i = 0; i < n; i++)
    {
        if (arr[i] > avg)
        {
            count++;
        }
        
    }
    
    return count;
}

/* 
Problem statement: Write a function to print the prime numbers in the given array.
*/

int primeOrNot(int n) //n is the integer to check for prime status
{
    int flag; //Flag determines whether the number is prime or not.

    if (n == 1 || n == 0) {     //Covering edge cases of when the number is 1 or 0.
        return 0;
    }  

    for (int i = 2; i <= sqrt(n); i++)
    {
        if(n%i == 0) {      // If in any division, the no is divisible with remainder 0, flag will be set to 0, and loop will be exited.
            return 0;
        }

        else if(n%i != 0) {
            flag = 1;
        }
    }

    return flag;
    
}

/* 
Problem statement: Write a function to find out the largest and smallest number of a given array.
*/

void printPrimes(int arr[], int n) //arr is an array with 'n' elements.
{
    int count = 0;
    printf("\nThe prime numbers in this array are:\n");

    for (int i = 0; i < n; i++)
    {
        int flag = primeOrNot(arr[i]);

        if (flag == 1)
        {
            printf("%d\t", arr[i]);
            count++;
            \
        
        
        }
        
    }
    printf("\n");

    if (count == 0)     // In case there are no prime numbers, this conditional will activate.
    {
        printf("None\n");
    }
    
}


int main() {

    int lenOfArr = 5;

    int arr[lenOfArr];

    // code for accepting user inputs in array

    for(int i = 0; i<lenOfArr; i++) {

        printf("Enter element %d of arr: ", i+1);
        scanf("%d", &arr[i]);
    }


    //minmax function does not return a value. it simply prints the max and min.
    minMax(arr, lenOfArr);

    //greaterThanAverage function to return the number of elements greater than the average of elements in the array
    int out = greaterThanAverage(arr, lenOfArr);
    printf("The no of elements greater than the average are: %d\n", out);

    //printPrimes function is a void function and will simply print the prime numbers in the array.
    printPrimes(arr, lenOfArr);

    return 0;



}