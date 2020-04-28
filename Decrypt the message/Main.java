#include <iostream>
using namespace std;
int main(){  
    int num1,num2;
  	cin>>num1>>num2;
  	int sum=num1+num2;
  	int sum1=0;
  	for(int i=1;i<sum;i++){
		if(sum%i==0)
          sum1+=i;
     }
  	 if(sum==sum1)
       cout<<"They can read the message";
  	 else
       cout<<"They can't read the message";
     return 0;
}

