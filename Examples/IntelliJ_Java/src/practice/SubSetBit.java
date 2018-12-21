//  Total number of subset in a set = 2^n , where n is number of items in a subset

//package practice;

public class SubSetBit {

    private void generateSubset(int[] set) {

        int n = set.length; // total no of subsets = 2^n = 2^3 = 8

//      for( int i=0 ; i< Math.pow(2,set.length); i++)  OR

        for( int i=0 ; i< 1<<n ; i++){   //  1 => 0 0 0 1 after 1<<3 => 0 0 0 1 0 0 0 i.e i<8

            System.out.print("{ ");

            // Print current subset
                for( int j = 0 ; j< n; j++ ){

                    if (( i & ( 1 << j )) > 0)     // '&' => bitwise 'and' operator  , '<<' => Shift left operator

                        System.out.print(set[j] + " ");
                }

            System.out.println("}");
        }
    }

    public static void main(String[] args){
        int[] set = { 1, 2, 3, 4 };
        SubSetBit subSet = new SubSetBit();
        subSet.generateSubset(set);
    }
}
