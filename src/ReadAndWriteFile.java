import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public List<Integer> readFile (String filePath) {
        List<Integer> numbers = new ArrayList<>();
        try {
            File newFile = new File(filePath);
            if(!newFile.exists()) {
                throw new FileNotFoundException();
            }
            FileReader reader = new FileReader(newFile);
            BufferedReader newBuff = new BufferedReader(reader);

            String line = "";
            while ((line = newBuff.readLine()) != null) {
                numbers.add(Integer.parseInt(line));
            }
            newBuff.close();
        }
        catch (Exception e) {
            System.out.println("File này không có tồn tại! ");
        }
        return numbers;
    }

    public void writerFile (String filePath, int max) {
        try {
            FileWriter writer = new FileWriter(filePath, true);
            BufferedWriter buffWriter = new BufferedWriter(writer);

            buffWriter.write("Giá trị lớn nhất là: " + max);
            buffWriter.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
