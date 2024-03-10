class SwapNumbers{

    public static void main(String[] args){
        swapNumber(20,30);
        swapNumber(200,300);

    }

    public static void swapNumber(int a, int b){
        System.out.println("Before Swapping: ");
        System.out.println("a=" + a+ "\n" + "b=" + b);
        int temp;
        temp =a;
        a=b;
        b= temp;
        System.out.println("After Swapping: ");
        System.out.println("a=" + a + "\n" + "b=" + b);

        
    }

}