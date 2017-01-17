import java.util.ArrayList;

/**
 * Created by employee on 11/4/16.
 */
class Decomposer {

    public static void main(String[] args) {
        System.out.println(add(20));
    }

    static ArrayList<Integer> add(int number) {

        ArrayList<Integer> list = new ArrayList<>();
        int check = 2;
        if (number < 0)
            throw new RuntimeException("inputted a number = " + number);
        if(number==0)
            throw new RuntimeException("inputted a number = " + number);
        if (number ==1) {
            list.add(number);
            return list;
        }
        int i=check;
        for (;i <= number;) {
            if (number % i == 0) {
                list.add(i);
                number = number / i;
            }
            else i+=1;
        }
        return list;
    }

}
