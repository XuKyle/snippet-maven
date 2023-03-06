package com.kylexu;

import org.junit.Assert;
import org.junit.Test;

/**
 * <p>Description:</p>
 *
 * @author snowball
 * @version v1.0
 * @date 2023/3/4 09:26 | 星期六
 **/
public class StringToolsTest {

    @Test
    public void trim() {
        String trim = StringTools.trim(" a  b c    d");
        Assert.assertEquals("abcd", trim);
    }
}
