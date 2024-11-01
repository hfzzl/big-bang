//Name: Muhammad Hafizzul Bin Abdul Manap

import java.io.FileWriter;
import java.io.IOException;

public class BigBang {
    public static void main(String[] args) {
        StringBuilder collection = new StringBuilder();
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                collection.append("BIGBANG");
            } else if (i % 3 == 0) {
                collection.append("BIG");
            } else if (i % 5 == 0) {
                collection.append("BANG");
            } else {
                collection.append(i);
            }
            if (i != 100) {
                collection.append("\",\"");
            }
        }

        String jsonArray = "[\"" + collection.toString() + "\"]";

        try (FileWriter file = new FileWriter("output.json")) {
            file.write(jsonArray);
            file.flush();
            System.out.println("Output generated successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
