package Task4;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

class FileService {

    final String DEFAULT_PATH = "Files/myFile.txt";
    StringBuffer inputBuffer = new StringBuffer();
    private FileInputStream inputStream;
    private BufferedReader br;
    String requiredString = null;
    private String line;
    private FileOutputStream fileOut;
    private String toReplace;
    private Path path;


    FileService(String[] args) {
        try {
            if (args.length == 3) {
                path = Paths.get(args[0]);
                this.inputStream = new FileInputStream(path.toString());
                this.requiredString = args[1];
                this.toReplace = args[2];
                this.br = new BufferedReader(new InputStreamReader(inputStream));
            }else {
                System.out.println("Invalid arguments ");
                Connection.manualConnection();
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            Connection.manualConnection();
        }
    }




    FileService(String requiredString) {

        try {
            {
                path = Paths.get(DEFAULT_PATH);
                this.inputStream = new FileInputStream(path.toString());
                this.requiredString = requiredString;
               // this.toReplace = toReplace;
                this.br = new BufferedReader(new InputStreamReader(inputStream));
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }


    int countering() {
        int counter = 0;
        int split;
        try {
            while ((line = br.readLine()) != null) {
                split = line.split(requiredString, -1).length - 1;
                counter += split;
            }
            inputStream.getChannel().position(0);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return counter;
    }

    String fileoutput() {
        try {
            line = new String(Files.readAllBytes(path));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return line;
    }

    @Deprecated
    void replaceLines() {

        try {
            while ((line = br.readLine()) != null) {
                if (line.equals(requiredString)) {
                    line = toReplace;
                }
                inputBuffer.append(line).append("\r\n");
            }
            inputStream.getChannel().position(0);
            fileOut = new FileOutputStream(path.toString());
            fileOut.write(inputBuffer.toString().getBytes());
            fileOut.close();
        } catch (IOException e) {
            System.out.println("Something get wrong with reading/writing");
        }
    }


    void replaceLinesV2(String toReplace) {

        path = Paths.get("Files/myFile.txt");
        String content = null;

        try {
            content = new String(Files.readAllBytes(path));

            content = content.replaceAll(requiredString, toReplace);
            Files.write(path, content.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void replaceLinesV2() {

        path = Paths.get("Files/myFile.txt");
        String content = null;

        try {
            content = new String(Files.readAllBytes(path));

            content = content.replaceAll(requiredString, toReplace);
            Files.write(path, content.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}