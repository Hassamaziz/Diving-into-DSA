#include <iostream>
using namespace std;
int main(){
    int arr[6]={1,2,3,4,5,1};
    int ans = 0;
    for (int i = 0; i < 6; i++)
    {
        ans = ans^arr[i];
        // cout << "first "<< ans;
    }

    for(int i =1;i<6;i++){
    ans = ans^i;
    // cout << "second "<< ans;
    }
    cout<<"The duplicate number is "<<ans<<endl;

    
}