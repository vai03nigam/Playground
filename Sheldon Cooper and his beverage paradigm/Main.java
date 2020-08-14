#include<bits/stdc++.h>
using namespace std;
static int f=0;
void check(int a[],int n,int x)
{
  sort(a,a+n);
  int i;
  for(i=0;i<n;i++)
  {
    int b=x-a[i];
    int start=i+1,end=n-1;
    while(start<end)
    {
      if((a[start]+a[end])==b)
      {
        f=1;
        return;
      }
      else if((a[start]+a[end])<b)
      {
        start++;
      }
      else if((a[start]+a[end])>b)
      {
        end--;
      }
    }
  }
  return;
}

int main()
{
  int n;
  cin>>n;
  int a[n];
  int i;
  for(i=0;i<n;i++)
  {
    cin>>a[i];
  }
  int x;
  cin>>x;
   check(a,n,x);
 if(f==1)
 {
   cout<<"TRUE";
 }
  else
  {
    cout<<"FALSE";
  }
}
  
    