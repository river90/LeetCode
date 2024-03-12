public class QuickSorT {
    public static void quickSort(int[] a,int start,int end){
        if(start>=end){
            return;
        }
        int i=start;
        int j=end;
        int p = a[i];
        while(i<j){
            while(a[j]>=p && i<j){
                j--;
            }
            while(a[i]<=p && i<j){
                i++;
            }
            if(i<j) {
                int t = a[j];
                a[j] = a[i];
                a[i] = t;
            }
        }
        a[start] = a[i];
        a[i] = p;
        quickSort(a,start,i-1);
        quickSort(a,i+1,end);
    }

    public static void main(String[] args) {
//        int[] arr = {3,7,1,5,9,2,1,13,8};
//        quickSort(arr,0,arr.length-1);
//        for(Integer a: arr){
//            System.out.println(a);
//        }
//        System.out.println(arr);
        String a = "aab";
        System.out.println(a.substring(2,3));
    }
}
