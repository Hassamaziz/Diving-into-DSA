#include<iostream>
#include<array>
using namespace std;
int main(){

int exArr[3]= {1,2,3};

array<int,4> arr = {1,2,3,4};

int size = arr.size();
for (int i = 0; i < size; i++)
{
    cout<< arr[i] << " ";
}
cout << endl;


cout << "The element at 2 index: "<< arr.at(2) << endl;

cout << "Is Empty or Not "<< arr.empty()<<endl;

cout << "First Element"<< arr.front()<<endl;

cout << "Last Element"<< arr.back()<<endl;



}