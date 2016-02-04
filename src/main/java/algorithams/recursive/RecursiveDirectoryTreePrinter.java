package algorithams.recursive;

import java.io.File;

import org.apache.commons.lang.Validate;

/**
 * List directory as tree
 * 
 * @author stefan
 *
 */
public class RecursiveDirectoryTreePrinter {

    private static final String SPACE = "  ";

    private static final String DIRECTORY = "/home/stefan/workspace/algorithams/src/main";

    public static void main(String[] args) {
	print(new File(DIRECTORY), "");
    }

    private static void print(File file, String indent) {
	Validate.notNull(file);
	Validate.notNull(indent);

	// Print file name, before print name print indent
	System.out.print(indent);
	System.out.println(file.getName());

	if (file.isDirectory()) {
	    print(file.listFiles(), indent + SPACE);
	}

    }

    private static void print(File[] listFiles, String indent) {
	Validate.notNull(listFiles);
	Validate.notNull(indent);

	for (int i = 0; i < listFiles.length; i++) {
	    print(listFiles[i], indent);
	}
    }

}
