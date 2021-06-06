package Lab8;

import java.io.File;

public class FileProgram {

	public static void main(String args[]) {
    
    // initializing the source file
		File file_source=new File("D:\\Ayan_mlm 2\\Capgemini\\Internship\\Java eclipse\\Labbook JEE FS\\src\\Lab8\\source.txt"); 
    
    // initializing the target file
		File file_target=new File("D:\\Ayan_mlm 2\\Capgemini\\Internship\\Java eclipse\\Labbook JEE FS\\src\\Lab8\\target.txt"); 
		CopyDataThread ct = new CopyDataThread(file_source,file_target);
		ct.start();
	}
}
