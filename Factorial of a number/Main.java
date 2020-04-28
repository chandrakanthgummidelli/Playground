#include<iostream>
using namespace std;
int main(){
  // Type your code here
  int n,f=1;
  cin>>n;
  if(n==0||n==1)
    cout<<1;
  else if(n>2){
    for(int i=1;i<n+1;i++)
      f*=i;
  	cout<<f;
  }
}
