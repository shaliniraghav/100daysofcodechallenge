TOPIC: REVERSE ORDER OF ARRAY

PROBLEM:
Print the N integers of the array in the reverse order, space-separated on a single line.
SAMPLE INPUT:
4
1 4 3 2
SAMPLE OUTPUT:
2 3 4 1

SOLUTION:

#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

int main(){
    int num;
    cin>>num;
    int arr[num];
    for(int i=0;i<num;i++){
        cin>>arr[i];
    }
    for(int j=num-1;j>=0;j--){
        cout<<arr[j]<<" ";
    }
    return 0;
}

