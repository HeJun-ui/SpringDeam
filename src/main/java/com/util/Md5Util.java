package com.util;


import org.apache.commons.codec.digest.DigestUtils;

/**
 * @author HeJun
 * @date 2022/7/02 11:31
 */
public class Md5Util {

    //秘钥常量
    public final static String md5key = "Hejun";

    /**
     * MD5方法
     *
     * @param text 明文
     * @return 密文
     * @throws Exception
     */
    public static String md5(String text) {
        //加密后的字符串
        String encodeStr = DigestUtils.md5Hex(text + md5key);
        System.out.println("MD5加密后的字符串为:encodeStr=" + encodeStr);
        return encodeStr;
    }

    /**
     * MD5验证方法
     *
     * @param text 明文
     * @param md5  密文
     * @return true/false
     * @throws Exception
     */
    public static boolean verify(String text, String md5) {
        //根据传入的密钥进行验证
        String md5Text = md5(text);

        return md5Text.equalsIgnoreCase(md5);
    }

}
