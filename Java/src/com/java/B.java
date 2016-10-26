package com.java;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public class B extends A {

	public static void main(String[] args) {
		System.out.println("aaa");
	}
	// public B() {
	// }
	//
	// public static void main(String[] args) {
	// new B();
	// System.out.println(B.getList().size());
	//
	// new B();
	// System.out.println(B.getList().size());
	//
	// new B();
	// System.out.println(B.getList().size());
	//
	// new B();
	// System.out.println(B.getList().size());
	//
	// new B();
	// System.out.println(B.getList().size());
	// }

	// public static void main(String[] args) throws IOException {
	// // �ַ�������һ���ĳ���
	// String str = "PJ4XOB2000050���԰�492-1FB";
	// float len0 = str.length();
	// System.out.println("ԭʼ���ַ�������Ϊ------->" + len0);
	//
	// String ys = compress(str);
	// float len1 = ys.length();
	// System.out.println("ѹ������ַ�������Ϊ----->" + len1);
	//
	// String jy = unCompress(ys);
	// System.out.println("\n��ѹ������ַ���Ϊ--->" + jy);
	// System.out.println("��ѹ������ַ�������Ϊ--->" + jy.length());
	//
	// System.out.println("\nѹ������Ϊ" + len1 / len0);
	//
	// // �ж�
	// if (str.equals(jy)) {
	// System.out.println("��ѹ���ٽ�ѹ�Ժ��ַ�����ԭ������һģһ����");
	// }
	// }
	//
	// /**
	// * �ַ�����ѹ��
	// *
	// * @param str
	// * ��ѹ�����ַ���
	// * @return ����ѹ������ַ���
	// * @throws IOException
	// */
	// public static String compress(String str) throws IOException {
	// if (null == str || str.length() <= 0) {
	// return str;
	// }
	// // ����һ���µ� byte ���������
	// ByteArrayOutputStream out = new ByteArrayOutputStream();
	// // ʹ��Ĭ�ϻ�������С�����µ������
	// GZIPOutputStream gzip = new GZIPOutputStream(out);
	// // �� b.length ���ֽ�д��������
	// gzip.write(str.getBytes());
	// gzip.close();
	// // ʹ��ָ���� charsetName��ͨ�������ֽڽ�����������ת��Ϊ�ַ���
	// return out.toString("ISO-8859-1");
	// }
	//
	// /**
	// * �ַ����Ľ�ѹ
	// *
	// * @param str
	// * ���ַ�����ѹ
	// * @return ���ؽ�ѹ������ַ���
	// * @throws IOException
	// */
	// public static String unCompress(String str) throws IOException {
	// if (null == str || str.length() <= 0) {
	// return str;
	// }
	// // ����һ���µ� byte ���������
	// ByteArrayOutputStream out = new ByteArrayOutputStream();
	// // ����һ�� ByteArrayInputStream��ʹ�� buf ��Ϊ�仺��������
	// ByteArrayInputStream in = new
	// ByteArrayInputStream(str.getBytes("ISO-8859-1"));
	// // ʹ��Ĭ�ϻ�������С�����µ�������
	// GZIPInputStream gzip = new GZIPInputStream(in);
	// byte[] buffer = new byte[256];
	// int n = 0;
	// while ((n = gzip.read(buffer)) >= 0) {// ��δѹ�����ݶ����ֽ�����
	// // ��ָ�� byte �����д�ƫ���� off ��ʼ�� len ���ֽ�д��� byte���������
	// out.write(buffer, 0, n);
	// }
	// // ʹ��ָ���� charsetName��ͨ�������ֽڽ�����������ת��Ϊ�ַ���
	// return out.toString("GBK");
	// }

	private static String encode = "utf-8";// "ISO-8859-1"

	public String getEncode() {
		return encode;
	}

	/* * �ַ���ѹ��Ϊ�ֽ����� */
	public static byte[] compressToByte(String str) {
		if (str == null || str.length() == 0) {
			return null;
		}
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		GZIPOutputStream gzip;
		try {
			gzip = new GZIPOutputStream(out);
			gzip.write(str.getBytes(encode));
			gzip.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return out.toByteArray();
	}

	/* * �ַ���ѹ��Ϊ�ֽ����� */
	public static byte[] compressToByte(String str, String encoding) {
		if (str == null || str.length() == 0) {
			return null;
		}
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		GZIPOutputStream gzip;
		try {
			gzip = new GZIPOutputStream(out);
			gzip.write(str.getBytes(encoding));
			gzip.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return out.toByteArray();
	}

	/* * �ֽ������ѹ���󷵻��ַ��� */
	public static String uncompressToString(byte[] b) {
		if (b == null || b.length == 0) {
			return null;
		}
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		ByteArrayInputStream in = new ByteArrayInputStream(b);
		try {
			GZIPInputStream gunzip = new GZIPInputStream(in);
			byte[] buffer = new byte[256];
			int n;
			while ((n = gunzip.read(buffer)) >= 0) {
				out.write(buffer, 0, n);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return out.toString();
	}

	/* * �ֽ������ѹ���󷵻��ַ��� */
	public static String uncompressToString(byte[] b, String encoding) {
		if (b == null || b.length == 0) {
			return null;
		}
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		ByteArrayInputStream in = new ByteArrayInputStream(b);
		try {
			GZIPInputStream gunzip = new GZIPInputStream(in);
			byte[] buffer = new byte[256];
			int n;
			while ((n = gunzip.read(buffer)) >= 0) {
				out.write(buffer, 0, n);
			}
			return out.toString(encoding);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void testdd() {
		
	}
	
	@Override
	public boolean isA() {
		// TODO Auto-generated method stub
		super.isA();
		return true;
	}
}
