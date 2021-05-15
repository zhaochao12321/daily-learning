package stock;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * @Author: zhaochao
 * @Date: 2021/1/15 18:48
 */
public class Test1 {
    public static void main(String[] args) throws Exception
    {
        byte[] buffer = new byte[1024];

        // 生成的ZIP文件名为Demo.zip
        String strZipName = "C:/Demo.zip";//生成文件的目录及命令
        ZipOutputStream out = new ZipOutputStream(new FileOutputStream(strZipName));
        // 需要同时下载的两个文件result.txt ，source.txt
        File[] file1 = { new File("C:/2.txt"), new File("C:/1.exe"), new File("C:/3.xls")};
        for (int i = 0; i < file1.length; i++)
        {
            FileInputStream fis = new FileInputStream(file1[i]);
            out.putNextEntry(new ZipEntry(file1[i].getName()));
            int len;
            // 读入需要下载的文件的内容，打包到zip文件
            while ((len = fis.read(buffer)) > 0)
            {
                out.write(buffer, 0, len);
            }
            out.closeEntry();
            fis.close();
        }
        out.close();
        System.out.println("生成Demo.zip成功");
    }
}
