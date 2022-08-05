package com.szl.letck.io.file;

import org.springframework.core.io.ClassPathResource;

import java.io.*;
import java.net.URLDecoder;
import java.net.URLEncoder;

/**
 * @ClassName All_kand_of_read_resources_file
 * @Desc  9种读取 resources 目录下文件方式
 * @Author szl
 * @Version 1.0
 * @Date 2022/7/30 22:30
 */
public class All_kand_of_read_resources_file {

    public static void main(String[] args) {
        All_kand_of_read_resources_file obj = new All_kand_of_read_resources_file();
//        obj.function1();
    }

    public static void getFileContent(Object fileInPath) throws IOException{
        BufferedReader bufferedReader = null;

        if(fileInPath == null){
            return;
        }

        if(fileInPath instanceof String) {
            bufferedReader = new BufferedReader(new FileReader(new File((String) fileInPath)));
        } else if (fileInPath instanceof InputStream){
            bufferedReader = new BufferedReader(new InputStreamReader((InputStream) fileInPath));
        }

        String line = null;

        while ((line = bufferedReader.readLine()) != null){
            System.out.println(line);
        }

        bufferedReader.close();
    }


    /**
     * 主要核心方法是使用getResource和getPath方法，这里的getResource("")里面是空字符串
     * @author szl
     * @date 2022/7/30 22:40
     * @param fileName
     */
    public void function1(String fileName) throws IOException {
        //注意getResource("")里面是空字符串
        String path = this.getClass().getClassLoader().getResource("").getPath();
        System.out.println(path);
        String filePath = path + fileName;
        System.out.println(filePath);

        getFileContent(filePath);
    }

    /**
     * 直接通过文件名getPath来获取路径
     * @author szl
     * @date 2022/7/30 22:44
     * @param fileName
     */
    public void function2(String fileName) throws IOException {
        String path = this.getClass().getClassLoader().getResource(fileName).getPath();
        System.out.println(path);
        //如果路径中带有中文会被URLEncoder,因此这里需要解码
        String filePath = URLDecoder.decode(path,"utf-8");
        System.out.println(filePath);

        getFileContent(filePath);
    }

    /**
     *  直接通过文件名+getFile()来获取
     * @author szl
     * @date 2022/7/30 22:47
     * @param fileName
        url.getFile()=/pub/files/foobar.txt?id=123456
        url.getPath()=/pub/files/foobar.txt
     */
    public void function3(String fileName) throws IOException {

        String path = this.getClass().getClassLoader().getResource(fileName).getFile();
        System.out.println(path);
        //如果路径中带有中文会被URLEncoder,因此这里需要解码
        String filePath = URLDecoder.decode(path,"utf-8");
        System.out.println(filePath);

        getFileContent(filePath);
    }

    /**
     * 使用getResourceAsStream方法获取流，上面的直接几种方式都需要获取文件路径
     * ，但是在SpringBoot中所有文件都在jar包中，没有一个实际的路径，因此可以使用下面的方式
     * 【重要】
     * @author szl
     * @date 2022/7/30 22:49
     * @param fileName
     */
    public void function4(String fileName) throws IOException {
        InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream(fileName);

        getFileContent(inputStream);
    }

    /**
     *直接使用getResourceAsStream方法获取流
     * 如果不使用getClassLoader，可以使用getResourceAsStream("/配置测试.txt")直接从resources根路径下获取
     *  【重要】
     * @author szl
     * @date 2022/7/30 22:52
     * @param fileName
     */
    public void function5(String fileName) throws IOException {
        InputStream inputStream = this.getClass().getResourceAsStream("/" +fileName);

        getFileContent(inputStream);
    }


    /**
     * 通过ClassPathResource类获取，建议SpringBoot中使用
     * springboot项目中需要使用此种方法，因为jar包中没有一个实际的路径存放文件
     *  【重要】
     * @author szl
     * @date 2022/7/30 22:56
     * @param fileName
     */
    public void function6(String fileName) throws IOException {
        ClassPathResource classPathResource = new ClassPathResource(fileName);
        InputStream inputStream = classPathResource.getInputStream();
        getFileContent(inputStream);
    }

    /**
     * 通过绝对路径获取项目中文件的位置（不能用于服务器）
     * @author szl
     * @date 2022/7/30 22:58
     * @param fileName
     */
    public void function7(String fileName) throws IOException {
        //E:\WorkSpace\Git\spring-framework-learning-example
        String rootPath = System.getProperty("user.dir");
        String filePath = rootPath + "\\chapter-2-springmvc-quickstart\\src\\main\\resources\\"+fileName;
        getFileContent(filePath);
    }


    /**
     * 通过绝对路径获取项目中文件的位置（不能用于服务器）
     * @author szl
     * @date 2022/7/30 23:01
     * @param fileName
     */
    public void function8(String fileName) throws IOException {
        //参数为空
        File directory = new File("");
        //规范路径：getCanonicalPath() 方法返回绝对路径，会把 ..\ 、.\ 这样的符号解析掉
        String rootCanonicalPath = directory.getCanonicalPath();
        //绝对路径：getAbsolutePath() 方法返回文件的绝对路径，如果构造的时候是全路径就直接返回全路径，
        // 如果构造时是相对路径，就返回当前目录的路径 + 构造 File 对象时的路径
        String rootAbsolutePath = directory.getAbsolutePath();
        System.out.println(rootCanonicalPath);
        System.out.println(rootAbsolutePath);
        String filePath = rootCanonicalPath + "\\chapter-2-springmvc-quickstart\\src\\main\\resources\\"+fileName;
        getFileContent(filePath);
    }

    /**
     * 通过绝对路径获取项目中文件的位置
     * 主要是通过设置环境变量，将文件传递到环境中，原理也是通过绝对路径获取的。
     * 示例中我设置了一个环境变量：TEST_ROOT=E:\\WorkSpace\\Git\\spring-framework-learning-example
     * @author szl
     * @date 2022/7/30 23:03
     * @param fileName
     */
    public void function9(String fileName) throws IOException {
        System.setProperty("TEST_ROOT","E:\\WorkSpace\\Git\\spring-framework-learning-example");
        //参数为空
        String rootPath = System.getProperty("TEST_ROOT");
        System.out.println(rootPath);
        String filePath = rootPath + "\\chapter-2-springmvc-quickstart\\src\\main\\resources\\"+fileName;
        getFileContent(filePath);
    }
}
