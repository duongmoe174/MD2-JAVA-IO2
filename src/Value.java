import java.util.List;

public class Value {
    public static int findMax (List<Integer> numbers){
        int max = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if (max < numbers.get(i)) {
                max = numbers.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ReadAndWriteFile test = new ReadAndWriteFile();
        List<Integer> numbers = test.readFile("Number.txt");
        int maxValue = findMax(numbers);
        test.writerFile("result.txt", maxValue);
    }
}
