package in.technous.filehandling;

import java.util.Scanner;

public class FileHandle
{
    public void filehandle()

//        public static void main(String[] args)
       {
            Scanner sc=new Scanner(System.in);
            System.out.println(" 1.BufferedOutputStream");
            System.out.println(" 2. ByteArrayInputStream");
            System.out.println(" 3. ByteOutputStream");
            System.out.println(" 4. DataInputOutput");
            System.out.println(" 5. FileReader");
            System.out.println("6. FileWriter");
            System.out.println(" 7.FileUpload");
            System.out.println("8. InputStream");
            System.out.println("9.OutputStream");
            System.out.println("10.BufferedInputStream");

            System.out.println("Enter your Choice::");
            int ch=sc.nextInt();
            switch(ch)
            {

                case 1:
                    BufferedOutputStreamEx b1=new BufferedOutputStreamEx();
                    b1.test1();
                    break;

                case 2:
                    ByteArrayInputStreamEx bb2=new ByteArrayInputStreamEx();
                    bb2.bytearrayinput();
                    break;
                case 3:
                    ByteOutputStreamEx bb3=new ByteOutputStreamEx();
                    bb3.bytearrayoutput();
                    break;
                case 4:
                    DataInputOutEx bb4=new DataInputOutEx();
                    bb4.datainputoutput();
                    break;
                case 5:
                    FileReaderEx bb5=new FileReaderEx();
                    bb5.filereader();
                    break;
                case 6:
                    FileWriterEx bb6=new FileWriterEx();
                    bb6.filewriter();
                    break;
                case 7:
                    FileUploadEx bb7=new FileUploadEx();
                    bb7.fileupload();
                    break;
                case 8:
                    InputStream ii1=new InputStream();
                    ii1.inputstream();
                    break;
                case 9:
                    OutputStream ii2=new OutputStream();
                    ii2.test();
                    break;
                case 10:
                    BufferedInputstreamEx bi=new BufferedInputstreamEx();
                    bi.bufferedinputstream();
                    break;
                default:
                    System.out.println("invalid");







            }

       }
}

