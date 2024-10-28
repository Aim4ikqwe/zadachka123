import java.io.*;

public class Main {
    public static void main(String[] args) {

        try {
            int max = 0;
            int min = Integer.MAX_VALUE;
            BufferedReader is = new BufferedReader(new FileReader("C:\\file.txt"));
            String line;
            while ((line = is.readLine()) != null ){
                String[] array = line.split(" ");
                int first = Integer.parseInt(array[0]);
                int second = Integer.parseInt(array[1]);
                max += Math.max(first, second);
                if (Math.abs(first-second) % 3 !=0 ){
                    min = Math.min(min, Math.abs(first-second));
                }
            }
            if (max % 3 != 0){
                System.out.println(max);
            }
            else System.out.println(max - min);


            } catch (Exception ex) {
            System.out.println(ex.getMessage());

        }
    }
    }