class Return{

int find(int A[], int size) {
   int ret = -1;
   for(int i = 0;i< size; i++) {
       if(A[i]>ret) {
           ret = A[i];
       }
   }
   return ret;
}
 
int main() {
   int A[] = {1, 4, 7, 13, 99, 0, 8, 5};
   System.out.println("Print to the ", find(A, 8));
   return 0;
}
}