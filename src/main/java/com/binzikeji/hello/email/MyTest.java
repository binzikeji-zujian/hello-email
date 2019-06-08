package com.binzikeji.hello.email;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

/**
 * @author: Chundekepa
 * @create: 2019-03-15 20:35
 **/
public class MyTest {
    public static void main(String[] args) throws EmailException {
        Email email = new SimpleEmail();
        email.setHostName("smtp.qq.com");
        email.setSmtpPort(465);
        // 用户名和密码为邮箱的账号和密码（不需要进行base64编码）
        email.setAuthenticator(new DefaultAuthenticator("binzikeji@qq.com", "axukkqfjsaguddgi"));
        email.setSSLOnConnect(true);
        email.setFrom("binzikeji@qq.com");
        email.setSubject("TestMail");
        email.setMsg("This is a test mail ... :-)");
        email.addTo("1127057739@qq.com");
        email.send();
    }
}
