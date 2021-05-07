package CopyFileNhiPhan;

import java.io.*;
import java.util.Scanner;

public class CopyFile {
    public static void copyFile(File source , File dest) throws IOException{
        InputStream is= null;
        OutputStream os= null;
        try{
            is= new FileInputStream(source);
            os= new FileOutputStream(dest);
            byte[] bytes = new byte[123];
            int length;
            while ((length= is.read(bytes))>0){
                os.write(bytes,0,length);
            }

        }finally {
            is.close();
            os.close();
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.printf("Enter source file:");
        String sourcePath = in.nextLine();
        System.out.printf("Enter destination file:");
        String destPath = in.nextLine();

        copyFile(sourcePath, destPath);

    }

    private static void copyFile(String sourcePath, String destPath) {
        File sourceFile = new File(sourcePath);
        File destFile = new File(destPath);
        try{
            copyFile(sourceFile,destFile);
        }catch (IOException e){
            System.err.println("Can't copy file");
        }
    }

}
