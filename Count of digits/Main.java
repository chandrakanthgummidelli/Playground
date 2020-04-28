#include<iostream>
using namespace std;
int main()
{
  // Type your code here
  int a,temp=0,count=0;
  cin>>a;
  do
  {
    temp=a%10;
    ++count;
    a=a/10;
  }while(a>0);
  cout<<count;
  
}