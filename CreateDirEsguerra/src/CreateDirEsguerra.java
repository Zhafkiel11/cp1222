
import java.io.File;
public class CreateDirEsguerra {

    public static void main(String args[]) {
       String dirname = "/tmp/user/java/bin";
       File d = new File(dirname);
       
       d.mkdirs();      
    }   
}
