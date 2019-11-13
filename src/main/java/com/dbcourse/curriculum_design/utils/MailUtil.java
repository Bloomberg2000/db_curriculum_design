package com.dbcourse.curriculum_design.utils;


import javax.mail.*;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;


public class MailUtil {

    private static final String SMTPAddress = "smtp.exmail.qq.com";
    private static final String SMTPPort = "465";
    private static final String SMTPAuth = "true";
    private static final String SMTPSSL = "true";

    // 邮箱需要设置的信息
    private static final String sendEmailAddress = "orange@noqaqs.cn";
    private static final String sendEmailPassword = "Pb123456";


    public static void sendCaptchaEmailToAddress(String captcha, String email) {
        Properties properties = new Properties();
        //设置发送邮件的基本参数
        //发送邮件服务器
        properties.put("mail.smtp.host", SMTPAddress);
        //发送端口
        properties.put("mail.smtp.port", SMTPPort);
        properties.put("mail.smtp.auth", SMTPAuth);
        properties.put("mail.smtp.ssl.enable", SMTPSSL);

        Session session = Session.getInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                //两个参数分别是发送邮件的账户和密码
                return new PasswordAuthentication(sendEmailAddress, sendEmailPassword);
            }
        });
        //创建邮件对象
        Message message = new MimeMessage(session);
        try {
            //设置发件人
            message.setFrom(new InternetAddress("lzy@noqaqs.cn"));
            //设置收件人
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(email));
            //设置主题
            message.setSubject("OrangeGo 注册验证码");
            //设置邮件正文  第二个参数是邮件发送的类型
            // TODO 验证码的文案
            message.setContent(String.format("你的验证码是 %s", captcha), "text/html;charset=UTF-8");
            //发送一封邮件
            Transport.send(message);
        } catch (MessagingException ignored) {

        }
    }
}
