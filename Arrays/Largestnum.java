package Arrays;

public class Largestnum {

    public static int Large(int arr[])
    {
        int temp=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>temp)
            {
                temp = arr[i];
            }

        }
        return temp;
        
    }
    public static void main(String[] args)
    {
        int arr[] = {5,8,10,2,30,45};
        int max = Large(arr);
        System.out.println(max);

    }
    
}
