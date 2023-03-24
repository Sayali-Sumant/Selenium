package DEmo;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ActiTimeScreenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		LocalDateTime time = LocalDateTime.now();
		System.out.println(time);
		String timestamp = time.toString().replace(':','-');
		
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");	
		WebDriver wd=new ChromeDriver(op);
		
		
		TakesScreenshot ts=(TakesScreenshot) wd;
		
		wd.get("http://demo.actitime.com/login.do");
		
		File destfile = ts.getScreenshotAs(OutputType.FILE);

           
        File root_file=new File("./images/actitime1"+timestamp+".png");
      
        FileUtils.copyFile( destfile,root_file);
        // updated comments for git
// this is the second update for git from git
	}
	


	}


