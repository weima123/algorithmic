package com.algo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.core.env.Environment;
import org.springframework.core.env.SimpleCommandLinePropertySource;
import java.net.InetAddress;
import java.net.UnknownHostException;


/**
 * Created by mawei on 2017/6/9.
 */
@SpringBootApplication
@ServletComponentScan
public class ConsumerApplication {

    public static  final Logger log = LoggerFactory.getLogger(ConsumerApplication.class);

    @Autowired
    private Environment env;


    public static void main(String []args) throws UnknownHostException {
        SpringApplication app = new SpringApplication(ConsumerApplication.class);
        //CommandLinePropertySource：继承自EnumerablePropertySource。以输入命令行参数作为属性源的对象。
        // 命令行参数就是main方法传入的String[]数组值，在命令行中输入的字符串默认会以空格为分隔符被拆分成
        // String数组。
        SimpleCommandLinePropertySource source = new SimpleCommandLinePropertySource(args);
        Environment env = app.run(args).getEnvironment();
        log.info("Access URLs:\n----------------------------------------------------------\n\t" +
                        "Local: \t\thttp://127.0.0.1:{}\n\t" +
                        "External: \thttp://{}:{}\n----------------------------------------------------------"+
                env.getProperty("server.port"),
                InetAddress.getLocalHost().getHostAddress(),
                env.getProperty("server.port")
         );

    }
}
