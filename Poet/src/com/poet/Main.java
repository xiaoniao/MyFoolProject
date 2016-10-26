package com.poet;

import java.io.File;

public class Main {

	public static String SAVE_PATH = "D:\\TEST"; // ����ĸ�Ŀ¼

	// ����
	public static String PACKAGE = "com.byb";
	public static String PACKAGE_DOMAIN = PACKAGE + ".domain";
	public static String PACKAGE_REPOSITORY = PACKAGE + ".repository";
	public static String PACKAGE_SERVICE = PACKAGE + ".service";
	public static String PACKAGE_CONTROLLER = PACKAGE + ".controller";

	// ������׺
	public static String REPOSITORY_SUFFIX = "Repository";
	public static String SERVICE_SUFFIX = "Service";
	public static String Controller_SUFFIX = "Controller";

	public static void main(String[] args) {

		File rootDir = new File("F:\\biao");
		for (File file : rootDir.listFiles()) {
			String sql = FileUtils.readFileByLines(file);

			Parser parser = new Parser();
			TableInfo tableInfo = parser.parse(sql);

			PoetCreater poetCreater = new PoetCreater();
			poetCreater.createDomain(tableInfo);
			poetCreater.createRepository(tableInfo);
			poetCreater.createService(tableInfo);
		}

	}
}
