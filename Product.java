import java.io.*;
public class Product {
    public void addProduct(String pType,String pName) throws IOException {
        File f1 = new File("TextFiles/ProductInfo.txt");
        if(!f1.exists()) {
            f1.createNewFile();
        }

        FileWriter fileWritter = new FileWriter(f1.getName(),true);
        BufferedWriter bw = new BufferedWriter(fileWritter);
        bw.write(pType+":"+pName);
        bw.close();
        System.out.println("Done");
    }

    public void accept(NodeVisitor nodeVisitor) {
        nodeVisitor.visitProduct(this);

    }
}
