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

	@Value("${lqbdocsdownload.rootpath}")
	private String lqbDocsRootPath;
    
	@RequestMapping("/hello")
    	public String hello() {
    		Path path = Paths.get(lqbDocsRootPath);
        	try {
			File zipFile = new File(lqbDocsRootPath+"/test.zip");
			if (Files.notExists(path)) {
			Files.createDirectories(path);
				System.out.println("folder created...");
			zipFile.createNewFile();
				System.out.println("zip file created......");
			} else {
				zipFile.createNewFile();
				System.out.println("folder already exists...");
				System.out.println("zip file created......");
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
        return "<center>*************.........<h2>App is running</h2>..........***********</center>";
    }

}
