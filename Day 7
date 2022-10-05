TOPIC : variable sized arrays
 
 Problem:
 
 For each pair of i and j values (i.e., for each query), 
 print a single integer that denotes the element located at index j of the array referenced by a[i] . 
 There should be a total of q lines of output.
 
 Sample input:
 
 2 2
 3 1 5 4
 5 1 2 8 9 3
 0 1
 1 3

sample output:

5
9
We perform the following q=2  queries:

Find the array located at index  i=0 , which corresponds to a[0] = [1,5,4] . We must print the value at index j=1 of this array which, as you can see 5, is .
Find the array located at index i=1 , which corresponds to a[1]=[1,2,8,9,3]. We must print the value at index j=3 of this array which, as you can see, is 9 .

 Solution:
 
#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    int num_array,num_queries,num_ele,idx,to_print; 
    cin>>num_array>>num_queries; 
    
    int *array[num_array];
    for(int i=0;i<num_array;i++){
        cin>>num_ele;
        array[i]=(int *)malloc(num_ele*sizeof(int));
        for(int j=0;j<num_ele;j++)
        cin>>array[i][j];
    }
     for(int i=0;i<num_queries;i++){
         cin>>idx>>to_print;
         cout<<array[idx][to_print]<<endl;
     }
    return 0;
}
