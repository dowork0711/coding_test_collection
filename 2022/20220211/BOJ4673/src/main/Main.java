public class Main {
    public static void main(String[] args) {
        
        int[] selfNumberArr = new int [10000];
        
        for (int i = 1; i < selfNumberArr.length + 1; i++) {
            selfNumberArr[selfNumber(i)]++;
        }

        for (int j = 1; j < selfNumberArr.length; j++) {
            if(selfNumberArr[j] == 0) {
                System.out.println(j);
            }
        }

    }

    public static int selfNumber(int num) {
        int sum = num;
        while (num != 0) {
            sum += num % 10;
            num /= 10;

            if (sum > 9999) {
                return 0;
            }
        }
        return sum;
    }
}
