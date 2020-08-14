#include<iostream>
using namespace std;

int base(int n,int b)
{
  int rem,rev=0,i=1;
  while(n>0)
  {
    rem=n%b;
    rev=rev+rem*i;
    n=n/b;
    i=i*10;
  }
  return(rev);
}

int sum(int n)
{
  int sum=0,rem;
  while(n>0)
  {
    rem=n%10;
    sum=sum+rem;
    n=n/10;
  }
return(sum);
}
int main()
{
	int b,t;
  cin>>b>>t;
  int i,count=0;
  for(i=b; ;i++)
  {
    int temp=base(i,b);
    int sod=sum(temp);
    if(i%sod==0)
    {
      count++;
    }
    else
    {
      if(count==t)
      {
        break;
      }
      else
      {
        count=0;
      }
    }
  }
  cout<<base(i-t,b);
	return 0;
}