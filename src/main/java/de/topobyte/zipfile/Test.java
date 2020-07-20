package de.topobyte.zipfile;

import java.io.IOException;
import java.util.Enumeration;

public class Test
{

	public static void main(String[] args) throws IOException
	{
		ZipFile file = new ZipFile("/tmp/gradle-wrapper.jar");
		Enumeration<? extends ZipEntry> entries = file.entries();
		while (entries.hasMoreElements()) {
			ZipEntry entry = entries.nextElement();
			System.out.println(entry.getName());
		}
	}

}
