package generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.yaml.snakeyaml.Yaml;

import testManager.afterExecution;
import testManager.beforeExecution;
import utils.fileHelper;
import utils.jsonHelper;
import utils.objectHelper;
import utils.xlsHelper;
import utils.xmlReporter;
import utils.yamlHelper;

public class constant{
/**
 * This File Contains All The static reference used throughout the Framework
 */
	public static String rootPath = System.getProperty("user.dir").replace("\\", "/");
	public static String logFileLocation=rootPath+"/src/test/resources/logs/loggerFile.log";
	public static String xmlReportingPath=rootPath+"/src/test/resources/xmlResults/";
	public static String ymlPath=rootPath+"/src/test/resources/yamlFiles/";
	public static String xlsPath=rootPath+"/src/test/resources/xlsFiles/";
	public static String testFolderpath=rootPath+"/src/test/resources/testFolder/";
	
	public static String chromeDriverpath=rootPath+"/src/test/resources/drivers/chromedriver";
	public static String ieDriverpath=rootPath+"/src/test/resources/drivers/IEDriverServer.exe";
	public static String screenShotPath=rootPath+"/src/test/resources/screenShotCaptured/";
	
	public static String platform = "default";
	public static String browser = "default";
	public static String branch = "default";
	public static String buildNumber = "default";
	
	public static beforeExecution taskManagerBeforeExecution=new beforeExecution();
	public static afterExecution taskManagerAfterExecution=new afterExecution();
	public static objectInitializer initializer =new objectInitializer();
	public static fileHelper file = null;
	public static xmlReporter xmlReport=null;
	public static reporter repo=null;
	public static yamlHelper ymlHelper=null;
	public static Yaml ymlObject=null;
	public static Logger log = null;
	public static WebDriver driver=null;
	public static objectHelper objHelper=null;
	public static jsonHelper jsonHelp=null;
	public static xlsHelper xlsHlep=null;
	
	public static List<String> listCucumberReport = new ArrayList<String>();
	public static Map<String, Object> ymlMapper=null;

}
