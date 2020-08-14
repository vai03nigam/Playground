#include<iostream>
using namespace std;

int main()
{
 int n,i,count=0,max=0,index=0;
  
  cin>>n;
  
  int a[n];
  for(i=0;i<n;i++)
  {
    cin>>a[i];
  }
  
  for(i=0;i<n-1;i++)
  {
    count++;
    if(a[i]>a[i+1])
    {     
    if(count>max)
    {
      max=count;
      index=i-count+1;
    }
      count=0;
    }
  }
  count++;
  if(count>max)
  {
    max=count;
    index=i-count+1;
  }
  for(i=index;i<index+max;i++)
  {
    cout<<a[i]<<" ";
  }
}