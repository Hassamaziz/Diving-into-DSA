#include<iostream>
#include<vector>
using namespace std;
int main(){

vector<int> v /*= {1,2,3,4} */ ;

cout << "Capacity of this vector is "<<v.capacity()<<endl;

v.push_back(5); 
cout << "Capacity of this vector is "<< v.capacity()<< endl;

v.push_back(4); 
cout << "Capacity of this vector is "<< v.capacity()<< endl;

v.push_back(3); 
cout << "Capacity of this vector is "<< v.capacity()<< endl;

cout << "Size of vector is " << v.size()<<endl;


cout << "The element at 2 index: "<< v.at(2) << endl;


cout << "Is Empty or Not "<< v.empty()<<endl;

cout << "First Element"<< v.front()<<endl;

cout << "Last Element"<< v.back()<<endl;


cout << "Vector Before pop "<< endl;
for (int i = 0; i < v.size(); i++)
{
    cout<< v[i] << " ";
}
cout << endl;

v.pop_back();

cout << "Vector After pop "<< endl;
for (int i = 0; i < v.size(); i++)
{
    cout<< v[i] << " ";
}
cout << endl;


cout << "Vector size before clear "<< v.size() << endl;
cout << "Vector capacity before clear "<< v.capacity() << endl;

v.clear();

cout << "Vector size after clear "<< v.size() << endl;
cout << "Vector capacity after clear "<< v.capacity() << endl;


}