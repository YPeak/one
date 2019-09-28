package com.yu.theone.util;

import org.springframework.validation.Errors;

/**
*@Description: 公共方法
*@Author: shuWei.yu
*@date: 2019/9/28 0028
*/
public class UtilMethod {

    /**
     * @Description: 判断字符串是否为空
     * @Author: shuWei.yu
     * @date: 2019/9/28 0028
     * @param string :
     * @return : boolean
     */
    private static boolean notEmpty(String string) {
        return null != string && string.trim().length() >= 1;
    }
    /**
     * @Description: 判断多个字符串字符串是否为空
     * @Author: shuWei.yu
     * @date: 2019/9/28 0028
     * @param strings :
     * @return : boolean
     */
    public static boolean notEmpty(String ... strings){
        for (String string : strings) {
            if(!notEmpty(string)){
                return false;
            }
        }
        return true;
    }

   /**
    * @Description: 获取注解异常信息
    * @Author: shuWei.yu
    * @date: 2019/9/28 0028
    * @param errors :
    * @return : java.lang.String
   */
    public static String getAnnotationErrors(Errors errors){
        String errorMsg = "";
        if(errors.hasErrors()){

        }
        return errorMsg;

    }

}
