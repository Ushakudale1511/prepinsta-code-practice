class practice {
    public static void main(String[] args) {
        int arr[]={4,5,0,1,9,0,5,0};
        int n= arr.length;
        int count=0;
        for(int i =0; i<n; i++){
            if (arr [i]!= 0){
                arr[count++]=arr[i];
            }
        }
        for(int i=count; i<n; i++){
            arr[i]=0;
        }
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + "  ");

    }
    
}
}
