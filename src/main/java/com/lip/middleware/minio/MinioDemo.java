package com.lip.middleware.minio;

import io.minio.MinioClient;
import io.minio.PutObjectArgs;
import io.minio.errors.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

/**
 * @author: Elon
 * @title: MinioDemo
 * @projectName: ManyTechIWantLearnInShort
 * @description: TODO
 * @date: 2025/3/14 16:18
 */
public class MinioDemo {
    public static void main(String[] args) {

    }


    public static String uploading(String filePath) throws IOException, ServerException, InvalidBucketNameException, InsufficientDataException, ErrorResponseException, NoSuchAlgorithmException, InvalidKeyException, InvalidResponseException, XmlParserException, InternalException {
        FileInputStream fileInputStream = null;
        fileInputStream = new FileInputStream(filePath);

        MinioClient minioClient = MinioClient
                .builder()
                .credentials("hMJWVhYppk3TJ9BgYquh", "DFUnJtXKY4rDG8JXW7qxvauSXuP6O87wpFcXZEob")
                .endpoint("http://127.0.0.1:9000")
                .build();

        String fileName = new File(filePath).getName();

        if (fileName == null || fileName.isEmpty()) {
            throw new IOException("无效的文件名");
        }

        String objectName = fileName;
        PutObjectArgs putObjectArgs = PutObjectArgs
                .builder()
                // 文件名
                .object(objectName)
                // 文件类型
                .contentType("image/png")
                // 桶名
                .bucket("image-test")
                // 文件流
                .stream(fileInputStream, fileInputStream.available(), -1)
                .build();

        minioClient.putObject(putObjectArgs);

        // 设置Minio存储桶bucket的访问策略Policy
        String bucketPolicy = "{"
                + "  \"Version\": \"2012-10-17\","
                + "  \"Statement\": ["
                + "    {"
                + "      \"Effect\": \"Allow\","
                + "      \"Principal\": {\"AWS\": \"*\"},"
                + "      \"Action\": [\"s3:GetObject\"],"
                + "      \"Resource\": [\"arn:aws:s3:::" + "image-test" + "/*\"]"
                + "    }"
                + "  ]"
                + "}";
        // 设置为公开
        minioClient.setBucketPolicy("image-test", bucketPolicy);
        // 生成长期链接，返回前端用于渲染
        String downloadUrl = minioClient.getObjectUrl("image", objectName);
        System.out.println("长期链接" + downloadUrl);


        //删除临时文件
        // 判断文件是否存在
       /* if(Files.exists(Paths.get(filePath))) {
            try {
                // 删除文件
                Files.delete(Paths.get(filePath));
                System.out.println("临时文件删除成功");
            } catch (IOException e) {
                // 异常处理
                e.printStackTrace();
            }
        } else {
            System.out.println("临时文件不存在");
        }*/
        return downloadUrl;

    }
}
