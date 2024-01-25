#include <iostream>
using namespace std;


void sortOne(int arr[],int n){
    int left =0;
    int right = n-1;
    while (left<right)
    {
        while (arr[left]==0 && left<right)
        {
            left++;
        }
        while (arr[right]==1 && left < right)
        {
           right--;
        }
        if (left<right){
            swap(arr[left],arr[right]);
            left++;
            right--;

        }        
    }
    
}

void printArry(int arr[],int size){
    for (int i = 0; i < size; ++i) {
       
        cout << arr[i] << " " ;
}
cout << endl;
}
int main(){

    int arr[8]={1,0,1,0,0,0,0,0};

sortOne(arr,8);
printArry(arr,8);
    

}