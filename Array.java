public class Array {
    public static void main(String[] args){
        int arr[]=new int[10];
        int n=5;
        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        arr[3]=40;
        arr[4]=50;
        System.out.println("Original Array:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int newElement=15;
        for(int i=n;i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=newElement;
        n++;
        System.out.println("After Insertion:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int element=55;
        arr[n]=element;
        n++;
        System.out.println("Insertion at end");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for(int i=0;i<n-1;i++){
            arr[i]=arr[i+1];
        }
        n--;
        System.out.println("After Deletion:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int key=60;
        int found=-1;
        for(int i=0;i<n;i++) {
            if (arr[i] == key) {
                found = i;
                break;
            }
        }
        if(found!=-1){
            System.out.println("Element " + key + " found at index "+ found);
        }else{
            System.out.println("Element " + key + " found at index "+ " not found");
        }

    }
}
