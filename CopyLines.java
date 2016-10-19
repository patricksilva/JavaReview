import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.PrintWriter;


/**
	https://docs.oracle.com/javase/tutorial/essential/io/charstreams.html
	Invoking readLine returns a line of text with the line. 
	CopyLines outputs each line using println, which appends the line terminator
	for the current operating system. This might not be the same line terminator
	that was used in the input file.
*/
public class CopyLines {
    public static void main(String[] args) throws IOException {

        BufferedReader inputStream = null;
        PrintWriter outputStream = null;

        try {
            inputStream = new BufferedReader( new FileReader( "xanadu.txt" ) );
            outputStream = new PrintWriter( new FileWriter( "characteroutput.txt") );

           String s;
            while ((s = inputStream.readLine()) != null) {
                outputStream.println(s);
            }
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }
}