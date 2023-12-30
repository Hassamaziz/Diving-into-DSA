#include <algorithm>
#include <iostream>
#include <unordered_map>
#include <vector>
using namespace std;

int main() {
    int i = 0;
    int j = 0;
    int arr1[5] = {1, 2, 2, 3, 3};
    int arr2[3] = {1, 2, 3};
    vector<int> ans;

    while (i < 5 && j < 3) {
        if (arr1[i] == arr2[j]) {
            ans.push_back(arr1[i]);
            i++;
            j++;
        } else if (arr1[i] < arr2[j]) {
            i++;
        } else {
            j++;
        }
    }

   
    for (int k = 0; k < ans.size(); k++) {
        cout << ans[k] << " ";
    }

    return 0;
}
