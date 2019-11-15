package com.dbcourse.curriculum_design.utils;

import org.apache.commons.lang.StringEscapeUtils;

public class HtmlToPlainText {
    public static String toPlainText(String html){
        html = html.replaceAll("\\<.*?\\>","");
        return StringEscapeUtils.unescapeHtml(html).replaceAll("\\s*","");
    }
}
