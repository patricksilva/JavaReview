import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.PrintWriter;
/*
	There are four buffered stream classes used to wrap unbuffered streams:
	BufferedInputStream and BufferedOutputStream create buffered byte streams,
	while BufferedReader and BufferedWriter create buffered character streams.
*/
public class CopyCharacters {
    public static void main(String[] args) throws IOException {

        BufferedReader inputStream = null;
        PrintWriter outputStream = null;

        try {
            inputStream = new BufferedReader( new FileReader("xanadu.txt") );
            outputStream = new PrintWriter( new FileWriter("characteroutput.txt") );

			int c;
            String s;
            //while ((c = inputStream.read()) != -1) {
            while ((s = inputStream.readLine()) != null) {
                outputStream.println(s);
				//outputStream.append(s);
                //outputStream.write(s);
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