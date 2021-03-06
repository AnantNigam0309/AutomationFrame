package utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;

import generics.constant;

public class fileHelper extends constant{

	File file= null;
	
	public fileHelper(){
		log.info("Object Initialized For fileHelper class ..");
	}
	
	public void createDirectory(String path,String directory){
		
	}
	
	public void createFile(String path,String fileName){
		try{
			String filePath=path+fileName;
			file=new File(filePath);
			if(file.createNewFile()){
				log.info("File Created with Name ::"+fileName);
			}else{
				log.info("Deleting File with Name ::"+fileName+" and calling createFile() again");
				deleteFile(filePath);
				createFile(path,fileName);
			}
		}catch(FileNotFoundException fio){
			log.info(fio.getMessage());
		}catch(Exception exp){
			log.info(exp.getMessage());
		}
	}
	
	public void removeAllDataFromDirectory(String path,String directory){
		
	}
	
	public void removeAlldataFromFile(String path){
		
	}
	
	public void deleteDirectory(String path){
		
	}
	
	public void deleteAllFileFromDirectory(String path){
		try{
			System.out.println(path);
			System.exit(1);
			FileUtils.cleanDirectory(new File(path));
		} catch (FileNotFoundException exp){
		    log.info(exp.getMessage());
		} catch (IOException exp) {
		    log.info(exp.getMessage());
		} catch (Exception exp){
			log.info(exp.getMessage());
		} finally{
			log.info("All Files Deleted from path :"+path);
		}
	}
	
	public void deleteFile(String path){
		try{
			file=new File(path);
			if(file.delete()){
				log.info("File at path :"+path+" got Deleted");
			}else{
				log.info("Function called to Delete File but Delete Operation Got Failed with No Exception");
			}
			
		} catch(Exception exp){
			log.info(exp.getMessage());
		} 
		
	}
	
	public List<String> readFileAsList(String path,String fileName){
		return null;
		
	}
	
	public void writeFileAsList(String path,String fileName,List<String> value){
		
	}
	
}
