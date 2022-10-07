Topic : concatining two string
problem: You are given two strings, a and b , separated by a new line. Each string will consist of lower case Latin characters ('a'-'z').
In the first line print two space-separated integers, representing the length of a and b respectively.
In the second line print the string produced by concatenating a and b (a+b).
In the third line print two strings separated by a space,a' and b'. a' and b'  are the same as a and b ,respectively, except that their first characters are swapped.
Sample Input 1:
abcd
ef

Sample Output 1:
4 2
abcdef
ebcd af

sample input 2:
fajayeuwptdshexp
qokarrkpi

Expected Output 2:

16 9
fajayeuwptdshexpqokarrkpi
qajayeuwptdshexp fokarrkpi

Explanation of the problem:
a= "abcd";
b= "ef";
|a|=4;
|b|=2;
a+b="abcdef";
a'= "ebcd";
b'= "af";

solution:

#include <iostream>
#include <string>
using namespace std;

int main() {
	string a="abcd";
    string b="ef";
    cin>>a;
    cin>>b;
    int len1=a.size();
    int len2=b.size();
    cout<<len1<<" "<<len2<<endl;
    string c=a+b;
    cout<<c<<endl;
    char c0=a[0];
    char c1=b[0];
    a[0]=c1;
    b[0]=c0;
    cout<<a<<" "<<b;
    return 0;
}
