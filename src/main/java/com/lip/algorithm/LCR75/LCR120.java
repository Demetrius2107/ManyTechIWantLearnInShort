package com.lip.algorithm.LCR75;

import java.util.HashSet;
import java.util.Set;

/**
 * @author: Elon
 * @title: LCR120
 * @projectName: ManyTechIWantLearnInShort
 * @description: TODO
 * @date: 2025/3/17 10:48
 */
public class LCR120 {

    public static void main(String[] args) {
        int[] documents = {2, 5, 3, 0, 5, 0};
        int res  = findRepeatDocument1(documents);
        System.out.println(res);
        int res2 = findRepeatDocument2(documents);
    }

    // 暴力
    public static int findRepeatDocument1(int[] documents) {
        for(int i = 0 ; i < documents.length; i ++){
            for(int j = i + 1; j < documents.length; j++){
                if(documents[i] == documents[j]){
                    return documents[i];
                }
            }
        }
        return 0;
    }


    // 哈希表
    public static int findRepeatDocument2(int[] documents){
        Set<Integer> hSet = new HashSet<>();
        for(int doc : documents){
            if(hSet.contains(doc)) return doc;
            hSet.add(doc);
        }
        return -1;
    }


    // 原地交换
    public static int findRepeatDocument3(int[] documents){
        int i = 0;
        while(i  < documents.length){
            if(documents[i] == i){
                i++;
                continue;
            }
            if(documents[documents[i]] == documents[i]){
                return documents[i];
            }
            int temp = documents[i];
            documents[i] = documents[temp];
            documents[temp] = temp;
        }
        return -1;
    }

}
