package in.technous.filehandling;
import java.io.*;
public class BufferedInputstreamEx
{
    public void bufferedinputstream()
    {
        try

        {
            FileInputStream fis = new FileInputStream("j2.txt");
            BufferedInputStream bi = new BufferedInputStream(fis);
            int i = 0;
            while ((i = bi.read()) != -1)
            {
                System.out.println((char) i);
            }
            bi.close();


        }
        catch(Exception e)
        {
            System.out.println(e);
        }

    }

}
