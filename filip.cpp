#include<iostream>
using namespace std;
int main(){
  int a,b,r,sum = 0,sum1=0,cnt=0;
  cin >> a >> b;
  if( a != b && a != 0 && b != 0){
    while(a> 0){
      r = a % 10;
      sum = sum*10 + r;
      a/=10;
    }
    while(b > 0){
      r = b % 10;
      sum1 = sum1 * 10 + r;
      b/=10;
    }
    if(sum > sum1)
      cout << sum;
    else
      cout << sum1;
  }
  
}