package com.java.bigfile;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;

public class Sample {

	public static void main(String[] args) throws Exception {
		URL url = new URL("http://192.168.0.180:8080/wms/assets/apk/value");
		HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();

		httpURLConnection.setRequestProperty("User-Agent", "liuzhuang");
		httpURLConnection.setRequestProperty("RANGE", "bytes=10");

		Map<String, List<String>> map = httpURLConnection.getHeaderFields();

		for (String string : map.keySet()) {
			System.out.println(string);
			
			List<String> list = map.get(string);
			for (String string2 : list) {
				System.out.println();
			}
		}

		InputStream inputStream = httpURLConnection.getInputStream();

		String string = slurp(inputStream, 1024);

		System.out.println(string);
	}

	public static String slurp(final InputStream is, final int bufferSize) {
		final char[] buffer = new char[bufferSize];
		final StringBuilder out = new StringBuilder();
		try (Reader in = new InputStreamReader(is, "UTF-8")) {
			for (;;) {
				int rsz = in.read(buffer, 0, buffer.length);
				if (rsz < 0)
					break;
				out.append(buffer, 0, rsz);
			}
		} catch (UnsupportedEncodingException ex) {
			/* ... */
		} catch (IOException ex) {
			/* ... */
		}
		return out.toString();
	}
}
