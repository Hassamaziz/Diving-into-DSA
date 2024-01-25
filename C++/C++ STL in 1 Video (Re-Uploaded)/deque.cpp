#include<iostream>
#include<deque>
using namespace std;
int main() {

    deque<int> d;
    d.push_back(1);
    d.push_front(3);
    cout << "Deque after push_back and push_front: ";
    for (auto i : d)
    cout << i << " ";
    cout << endl;
  
    // d.pop_front();
    // cout << "After popping an element from the front, Deque is: ";
    // for (auto i : d)
    // cout << i << " ";
    // cout << endl;
    //  d.pop_back();
    // cout << "After popping an element from the back, Deque is: ";
    // for (auto i : d)
    // cout << i << " ";
    // cout << endl;

    // cout << "Printing first element from deque: "<<endl;
    // cout << *d.begin() << endl;
    // cout << "Printing last element of deque:"<<endl;
    // cout << *d.rbegin() << endl;

    //  cout << "Printing first element from deque: "<<endl;
    // cout << d.at(0) << endl;
    
    cout << "Printing first element from deque: "<<endl;
    cout << d.front() << endl;
    cout << "Printing last element of deque:"<<endl;
    cout << d.back() << endl;

    // Erasing elements
    cout << "Deque before erase : "<<endl;
    for (auto i : d)
    cout << i << " ";
    cout << endl;
    d.erase(d.begin(),d.begin()+1);// remove the first element in the deque
    cout << "Deque after erase : "<<endl;
    for (auto i : d)
    cout << i << " ";
    cout << endl;




}