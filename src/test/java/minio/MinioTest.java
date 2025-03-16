package minio;

import com.lip.minio.MinioDemo;
import io.minio.errors.*;
import org.junit.Test;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

/**
 * @author: Elon
 * @title: MinioTest
 * @projectName: ManyTechIWantLearnInShort
 * @description:
 * @date: 2025/3/14 16:36
 */

public class MinioTest {

    @Test
    public void minioTest() throws ServerException, InvalidBucketNameException, InsufficientDataException, ErrorResponseException, IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidResponseException, XmlParserException, InternalException {
        MinioDemo.uploading("C:\\Users\\Lenovo\\Pictures\\goland壁纸\\v2-45fcfb467fc76d0d34f3aec712bad93a_720w.png");
    }

}
