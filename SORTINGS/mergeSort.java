package SORTINGS;

public class mergeSort {
    public static void mergesorting(int arr[], int si,int ei){
        
        if(si>=ei){
            return;
        }
        int mid=si+(ei-si)/2;
        mergesorting(arr, si, mid);
        mergesorting(arr, mid+1, ei);
        merge(arr,si,mid,ei);
    }
    public static void merge(int arr[],int si, int mid,int ei){
        int temp[]=new int[ei-si+1];
        int i=si;
        int j=mid+1;
        int k=0;
        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
            }
            else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }
        while (i<=mid){
            temp[k++]=arr[i++];
        } 
            
        while(j<=ei){
            temp[k++]=arr[j++];
        }
        for(k=0,i=si;k<temp.length;k++,i++){
            arr[i]=temp[k];
        }

    }
    public static void main(String[] args) {
        int arr[]={5,4,1,2,3};
        mergesorting(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++){
                    System.out.print(arr[i]+" ");
        }
    }
}
