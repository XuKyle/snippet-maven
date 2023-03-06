package com.kylexu;

import com.google.common.base.Joiner;
import com.google.common.base.Splitter;

import java.util.regex.Pattern;

/**
 * <p>Description:</p>
 *
 * @author snowball
 * @version v1.0
 * @date 2023/3/4 09:26 | 星期六
 **/
public class StringTools {
    public static String trim(String s) {
        Pattern pattern = Pattern.compile("\\s+");
        return Joiner.on("")
                .join(Splitter.on(pattern).split(s));
    }
}
