public class bubbleSort {
    public static void main(String args[]){
        int num[]={7,6,5,4,3,2,1};
        bubbleSort(num);
    }
    public static void bubbleSort(int num[])
    {
        for(int i=0;i<=num.length-1;i++)
        {
            for(int j=0;j<=num.length-2-i;j++)
            {
                if(num[j]>num[j+1])
                {
                    int temp=num[j];
                    num[j]=num[j+1];
                    num[j+1]=temp;
                }
            }
        }
        for(int i=0;i<=num.length-1;i++){
            System.out.print(num[i]+" ");
        }
    }
}
