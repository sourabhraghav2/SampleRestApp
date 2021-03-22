package sample.rest.SampleRestApp;

import org.apache.tomcat.util.http.fileupload.MultipartStream;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SampleRestAppApplication {
	@GetMapping("test")
	public String testMethod(){
		return "Hi I am working !";
	}
	public static void main(String[] args) {
		SpringApplication.run(SampleRestAppApplication.class, args);
	}
}
