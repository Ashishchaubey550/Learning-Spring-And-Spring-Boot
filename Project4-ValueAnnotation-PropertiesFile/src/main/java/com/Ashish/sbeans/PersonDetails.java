package com.Ashish.sbeans;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("pDetails")
public class PersonDetails {
    //Injecting the person Details
    @Value("${per.id}")
    private String pid;

    @Value("${per.name}")
    private String pname;

    @Value("${per.addrs}")
    private String paddrs;

    @Value("${per.age}")
    private String page;

    //hard coding the value
    @Value("ashish550chaubey@gmail.com")
    private String email;

    //injecting the System property Values

    @Value("${os.name}")
    private String osName;

    @Value("${os.version}")
    private String osVersion;

    //injecting env variable value

    @Value("${Path}")
    private String pathData;

    @Override
    public String toString() {
        return "PersonDetails{" +
                "pid=" + pid +
                ", pname='" + pname +
                ", paddrs='" + paddrs +
                ", page=" + page +
                ", email='" + email +
                ", osName='" + osName +
                ", osVersion='" + osVersion +
                ", pathData='" + pathData +
                '}';
    }
}
