Topic of this day: stringstream(string)

Problem: One common use of this class is to parse comma-separated integers from a string (e.g., "23,4,56").
If the >> operator returns a value, that is a true value for a conditional. Failure to return a value is false.
Given a string of comma delimited integers, return a vector of integers.
There is one line of n integers separated by commas.
constraints : The length of str is less than 8*10^5.

sample input:
23,4,56
sample output:
23
4
56

Description:
stringstream is a stream class to operate on strings. It implements input/output operations on memory (string) based streams.
stringstream can be helpful in different type of parsing. The following operators/functions are commonly used here
Operator >> Extracts formatted data.
Operator << Inserts formatted data.
Method str() Gets the contents of underlying string device object.
Method str(string) Sets the contents of underlying string device object.
Its header file is sstream.
stringstream ss("23,4,56");
char ch;
int a, b, c;
ss >> a >> ch >> b >> ch >> c;  // a = 23, b = 4, c = 56
 
solution:
#include <sstream>
#include <vector>
#include <iostream>
using namespace std;

vector<int> parseInts(string str) {
  vector<int> result;
  stringstream s;
  s<<str;
  int temp;
  char ch;
  while(s>>temp){
      result.push_back(temp);
      s>>ch;
  }
  return result;
}

int main() {
    string str;
    cin >> str;
    vector<int> integers = parseInts(str);
    for(int i = 0; i < integers.size(); i++) {
        cout << integers[i] << "\n";
    }
    
    return 0;
}
