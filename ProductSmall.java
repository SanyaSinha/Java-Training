import java.util.Arrays;
class ProductSmall{
    public static void main(String args[]){
    int arr[]={112,43,14,5,56,1,2};
    int sum =9;
  Arrays.sort(arr);
  System.out.println("Sorted array is: "+Arrays.toString(arr));
  int a=arr[0];
  int b=arr[1];
  if((a+b)<sum)
  {
    System.out.println(a*b);
  }
  else{
   System.out.println("invalid");
  }
}
}