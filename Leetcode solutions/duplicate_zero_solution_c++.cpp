class Solution {
public:
     void duplicateZeros(vector<int>& A) {
        
        vector<int> a;
         for(int i=0;i<A.size();i++){
             if(A[i]==0){
                 a.push_back(0);
                 a.push_back(0);
             }
             else{
                 a.push_back(A[i]);
             }
         }
         
         for(int i=0;i<A.size();i++){
             A[i]=a[i];
         }
    }
};