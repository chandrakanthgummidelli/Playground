#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int p,t,r;
  float si,a,d,f;
  cin>>p>>r>>t;
  si=(p*t*r)/100;
  a=p+si;
  d=(si*2)/100;
  f=a-d;
  cout<<si<<"\n"<<a<<"\n";
  cout<<d<<"\n";
  cout<<f;
}