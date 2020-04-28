#include <iostream>
using namespace std;
int main() 
{
	// Type your code her
  	int n,len,ans=0;
  	cin>>n;
  	while(n!=0){
      	ans=ans*10;
    	ans=ans+n%10;
      	n=n/10;
    }
  	cout<<(ans);
}