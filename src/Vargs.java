public class Vargs {
    /**
     * Variable length arguments to methods contain any number of arguments without unnecessary method overloading
     * 1. Only one variable length parameter can be specified
     * 2. It must be the last parameter if there are many
     * 3. It can accept an array as parameter as it is essentially the same
     * */


    public static int sum(int... numbers){
        int sum = 0;
        for(Integer num: numbers){
            sum+=num;
        }
        return sum;
    }

    // overkill --> algorithm to find the sum series of a number = n(n+1)/2 . eg 4 = 1+2+3+4
    public static void main(String[] args) {
        System.out.println(sum(1,2,3));
        System.out.println(sum(1,2,3,4,5,4,3));
        System.out.println(sum(1,2,3));
    }
}
