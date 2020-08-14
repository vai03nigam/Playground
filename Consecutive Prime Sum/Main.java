#include <bits/stdc++.h>
using namespace std;

bool isprime(long long int b)
{
    long long int i;
  for(i=2;i<=sqrt(b);i++)
  {
    if(b%i==0)
    {
      return(false);
    }
  }
  return(true);
}

int main() 
{
    long long int n,i,sum=2,m;
  int count=0;
     cin>>n;
  m=n;
   
  if(n>1000000 && n<100000000)
    n=n/1000;
  if(n>=100000000)
    n=n/10000;
  
    for(i=3;i<=n;i++)
    {
      if(isprime(i))
      {
        sum=sum+i;
        if(isprime(sum) && sum<=m)
        {
           count++;
        }
      }
    }
  cout<<count;
        
    return 0;
}