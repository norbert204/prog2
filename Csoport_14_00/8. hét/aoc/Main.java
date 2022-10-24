import java.util.List;

class Main {

    public static void test() {
        int sum = 0;
    }

    public static void main(String[] args) {
        int sum = 0;
        List<Integer> nums = FileUtils.readFirstLineAsDigits("day01.txt");

        for (int i = 0; i < nums.size(); i++) {
            if (i == nums.size() - 1) {
                if (nums.get(i) == nums.get(0)) {
                    sum += nums.get(i);
                }
            }
            else if (nums.get(i) == nums.get(i + 1)) {
                sum += nums.get(i);
            }
        }

        System.out.println(sum);
    }
}