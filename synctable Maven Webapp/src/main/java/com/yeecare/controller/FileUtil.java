package com.yeecare.controller;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileUtil {
	
	private final static String FILEPATH = "d:"+File.separator+"log";
	private static class FileU {
		private static FileUtil fileUtil = new FileUtil();
	}

	private FileUtil() {
	}

	public static FileUtil getInstance() {

		return FileU.fileUtil;
	}

	public void write(String str) {

		if (str.equals("") || str == null) {
			return;
		}
		try {
			File dir = new File(FILEPATH);
			if (!dir.exists()) {
				dir.mkdir();
			}
			String path = dir.getCanonicalPath() + File.separator
					+ getDate() + "_log.txt";
			File file = new File(path);
			if (!file.exists()) {
				file.createNewFile();
			}

			FileWriter fstream = new FileWriter(path, true);
			BufferedWriter out = new BufferedWriter(fstream);

			out.newLine();
			out.append(getDates());
			out.newLine();
			out.append(str);
			out.newLine();

			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	}
	
	
	private static  String getDate () {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		String dateString = format.format(new Date());
		return dateString;
		
	}
	
	
	private static  String getDates () {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:MM;ss");
		String dateString = format.format(new Date());
		return dateString;
		
	}

}
