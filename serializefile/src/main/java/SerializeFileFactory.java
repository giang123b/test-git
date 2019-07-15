import java.io.*;

public class SerializeFileFactory {
    public static boolean luuFile(Object data, String path){
        try{
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(data);
            oos.close();
            fos.close();
            return true;
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return false;
    }

    public static Object docFile(String path){
        try{
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Object data = ois.readObject();
            ois.close();
            fis.close();
            return data;
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
}
