package school.lesson7;

import java.io.*;

public class AppData {

    private String[] header = {"Value1", "Value2", "Value3"};
    private int[][] data;


    public static void main(String[] args) {
         String header = "Value1";
        File file = new File("D:\\app.csv");
        try {
            FileWriter fileWriter = new FileWriter(file);

        fileWriter.write(header);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileReader fileReader = new FileReader(file);
            int x = 0;
            while ((x = fileReader.read()) > -1){
                System.out.println((char) x);
            }
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }

        }





