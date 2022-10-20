import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = FileUtils.readFirstLineAsDigits("input.txt");
        System.out.println(nums);
    }
}
