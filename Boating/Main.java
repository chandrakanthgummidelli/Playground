#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int b_weight,adl,chl,total_weight;
  cin>>b_weight>>adl>>chl;
  total_weight=adl*75+chl*30;
  if(total_weight<=b_weight)
    cout<<"Boat is stable";
  else
    cout<<"Boat will drow";
}