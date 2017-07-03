package test;

import java.util.Collection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class hardTest {

	// public static Collection<String> folderNames(String xml, char
	// startingLetter) throws Exception {
	// Collection<String> result;
	// for(String spltVal : xml.split("<folder name=\"\">")) {
	// System.out.println(spltVal);
	// }
	// return result;
	// }

	public static void main(String[] args) throws Exception {
		String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" + "<folder name=\"c\">"
				+ "<folder name=\"program files\">" + "<folder name=\"uninstall information\" />" + "</folder>"
				+ "<folder name=\"users\" />" + "</folder>";
		String regex = "[<?>\"/]";
		for (String splt : xml.split(regex)) {
			System.out.println(splt);
		}
//		String result = xml.substring(xml.indexOf("folder name=\""), xml.length());

		// System.out.println(s);
		// Collection<String> names = folderNames(xml, 'u');
		// for(String name: names)
		// System.out.println(name);
	}
}
