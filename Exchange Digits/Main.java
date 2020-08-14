#include<bits/stdc++.h>
using namespace std;

int minimum=INT_MAX;
int ispossible=0;

int permutation(string a,int index,int size,int b)
{
  if(index==size)
  {
    int converted=stoi(a);
    if((converted-b)>0 && (converted<minimum))
    {
      minimum=converted;
      ispossible=1;
    }
  }
  else
  {
    int j;
    for(j=index;j<=size;j++)
    {
    swap(a[index],a[j]);
    permutation(a,index+1,size,b);
    swap(a[index],a[j]);
    }
  }
  return(minimum);
}
int main()
 {
  int a,b;
  cin>>a>>b;
  string str=to_string(a);
  int len=str.size();
  int result=permutation(str,0,len-1,b);
  ispossible?cout<<minimum:cout<<-1;
  return 0;
}