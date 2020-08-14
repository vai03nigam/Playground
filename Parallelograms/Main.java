#include<bits/stdc++.h>
using namespace std;

int main()
{
  int n,i;
  cin>>n;
  int a[n];
  for(i=0;i<n;i++)
  {
    cin>>a[i];
  }
  
  map<int,int> freq;
    
  for(i=0;i<n;i++)
  {
    freq[a[i]]++;
  }
  map <int ,int>:: iterator itr;
  
  int pos=0,neg=0,pgrm=0;
  vector <int> lines;
  
  for(itr=freq.begin(); itr!= freq.end() ;itr++)
  {
    if(itr->second >1)
    {
      lines.push_back(itr->second);
    }
  }
  
  vector<int>:: iterator itr1,itr2;
  for(itr1=lines.begin();itr1!=lines.end();itr1++)
  {
    for(itr2=itr1;itr2!=lines.end();itr2++)
    {
      if(itr1!=itr2)
      {
        pgrm+=(((*itr1)*(*itr1-1))/2)*(((*itr2)*(*itr2-1))/2);
      }
    }
  }
  cout<<pgrm;	
  return 0;
}