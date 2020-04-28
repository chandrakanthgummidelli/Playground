#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int flp1,flpd,flpsh,snp1,snpd,snpsh,amz1,amzd,amzsh;
  cin>>flp1>>flpd>>flpsh>>snp1>>snpd>>snpsh>>amz1>>amzd>>amzsh;
  flp1=flp1-(flp1*flpd/100)+flpsh;
  snp1=snp1-(snpd*snp1/100)+snpsh;
  amz1=amz1-(amz1*amzd/100)+amzsh;
  cout<<"In Flipkart Rs."<<flp1;
  cout<<"\nIn Snapdeal Rs."<<snp1;
  cout<<"\nIn Amazon Rs."<<amz1;
  if(flp1<=snp1&&flp1<=amz1)
    cout<<"\nHe will prefer Flipkart";
  else if(snp1<=amz1)
    cout<<"\nHe will prefer Snapdeal";
  else
    cout<<"\nHe will prefer Amazon";
}