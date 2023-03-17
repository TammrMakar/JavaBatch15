package Class32;

import Utils.ExcelReader;

import java.io.IOException;

public class ExceptionsDemo2 {
    public static void main(String[] args) throws IOException {

        //System.out.println(10/0);
       /* try {
            ExcelReader.read();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
*/

        test();

    }

    static void test() throws IOException {
       try{
            ExcelReader.read();
        }catch(Exception e){
          try {
              System.out.println(e);
          }catch (Exception exception){

          }


    }
        // ExcelReader.read();
}
}
