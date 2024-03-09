class OneDimensionalArray{

    public static void main(String[] args){

        int a[] = {2,4,6,8,10};
        for(int i = 0; i<a.length; i++){
            System.out.println(a[i]);
        }

        System.out.println("\n");
        
        int b[] = {1,3,5,7,9,11};
        for(int j=b.length-1; j>=0; j--){
            System.out.println(b[j]);
        }
    }
}