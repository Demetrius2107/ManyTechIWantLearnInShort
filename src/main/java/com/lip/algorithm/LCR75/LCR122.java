package com.lip.algorithm.LCR75;

/**
 * @author: Elon
 * @title: LCR122
 * @projectName: ManyTechIWantLearnInShort
 * @description: TODO
 * @date: 2025/3/17 13:51
 */
public class LCR122 {

  /*  假定一段路径记作字符串 path，其中以 "." 作为分隔符。现需将路径加密，加密方法为将 path 中的分隔符替换为空格 " "，请返回加密后的字符串。
    示例 1：
    输入：path = "a.aef.qerf.bb"
    输出："a aef qerf bb"*/

    public static void main(String[] args) {

    }


    public String pathEncryption(String path) {
        StringBuilder res = new StringBuilder();
        for(Character c : path.toCharArray())
        {
            if(c == '.') res.append(' ');
            else res.append(c);
        }
        return res.toString();
    }
}
