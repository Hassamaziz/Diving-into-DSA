#include <iostream>
using namespace std;


void printArray(int arr[],int size){
    for (int i = 0; i < size; i++)
    {
        cout << arr[i] << " ";
    }
    
}

int findUnique(int arr[],int size){
int ans = 0;
for (int i = 0; i < size; i++)
{
    ans = ans^arr[i];
}
return ans;

   
}
int main(){
    int arr[9] = {2,2,7,8,7,8,5,10,10};
    
    int ans = findUnique(arr,9);

    cout<< ans;
    





}