#include <iostream>
using namespace std;
#include <algorithm>
int main() {
int n;
    cin>>n;
    for (int i=0;i<n;i++)
    {
        string str = "";
        cin>>str;
        reverse(str.begin(), str.end()); 
        cout << str<<endl;
    }
	return 0;
}


