package com.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {
    	Path path = Paths.get('/lqb/loans/pa');
        try {
            if (Files.notExists(path)) {
            	Files.createDirectories(path);
            	File file = new File(path+'/test.txt');
            	file.createNewFile();
            	   System.out.println(file.exists());
            } else {	
               System.out.println("Failed to create directory");
            }
        } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return "<center>*************.........<h2>App is running</h2>..........***********</center>";
    }

}
