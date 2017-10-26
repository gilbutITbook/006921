import java.io.*;

public class CSVStringTablePrinter extends CSVStringReader {
    public CSVStringTablePrinter(String string) {
        super(string);
    }

    public void print() throws IOException {
        System.out.println("<table>");
        for (int row = 0; true; row++) {
            String[] item = readCSV();
            if (item == null) {
                break;
            }
            System.out.print("<tr>");
            for (int column = 0; column < item.length; column++) {
                System.out.print("<td>");
                System.out.print(item[column]);
                System.out.print("</td>");
            }
            System.out.println("</tr>");
        }
        System.out.println("</table>");
    }
}
