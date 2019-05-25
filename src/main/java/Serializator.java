import java.io.*;


public class Serializator {
    public void serializate(Object o, String path) {
        File file = new File(path);
        ObjectOutputStream objectOutputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
         fileOutputStream = new FileOutputStream(file);
            if(fileOutputStream != null){
                objectOutputStream = new ObjectOutputStream(fileOutputStream);
                objectOutputStream.writeObject(o);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fileOutputStream.close();
                objectOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public Object deserializate(String path){
        File file = new File(path);
        ObjectInputStream objectInputStream = null;
        Object object = null;
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            if(fileInputStream != null){
                objectInputStream =new ObjectInputStream(fileInputStream);
                object = objectInputStream.readObject();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return object;
    }
}
