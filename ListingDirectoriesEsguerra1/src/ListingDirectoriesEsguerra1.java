import java.io.File;


public class ListingDirectoriesEsguerra1 {


    public static void main(String[] args) {
      File file =null;
      String[] paths;
      
      try{
          file =new File("/tmp");
          
          paths = file.list();
          
          for(String path:paths)
              
              System.out.println(path);
      
      
    } catch (Exception e){
    e.printStackTrace();
        }
    }
}
