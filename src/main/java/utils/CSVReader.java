package utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class CSVReader {

    public static Map<String, String> getTestData(String fileName) {

        Map<String, String> data = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader("src/test/resources/" + fileName))) {

            String line = br.readLine(); // headers
            String values = br.readLine(); // data row

            String[] headerArr = line.split(",");
            String[] valueArr = values.split(",");

            for (int i = 0; i < headerArr.length; i++) {
                data.put(headerArr[i].trim(), valueArr[i].trim());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return data;
    }
}
