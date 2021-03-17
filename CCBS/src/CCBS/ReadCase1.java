package CCBS;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

public class ReadCase1 {
	public static void main(String[] args) throws IOException {

		String line = null;
		int num = 0;
		int sum = 0;
		int i = 0;
		StringBuffer sb = new StringBuffer();

		FileInputStream fis = new FileInputStream(
				"d:\\si1206\\Desktop\\Test Case\\Test Case First\\CCBS\\Case01\\SB.TESTD.SB52DELO.CCBS20.TEST.cpy");
		InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
		BufferedReader br = new BufferedReader(isr);
		FileOutputStream fos = new FileOutputStream("d:\\si1206\\Desktop\\測試用\\case1cpy.txt");
		OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
		BufferedWriter bw = new BufferedWriter(osw);
		PrintWriter pw = new PrintWriter(bw);
		Map map = new HashMap();
		while ((line = br.readLine()) != null) {
			if ((!line.contains("*")) && line.contains("(")) {
				num = Integer.parseInt(line.substring(line.indexOf("(")+1,line.indexOf(")")));
				sum += num;
				line = line + "長度為" + sum;
			}	
			if(line.contains("0E")) {
				line = line + "\r\n@ianus*type=dbcs";
			}
			if (!map.containsValue(line)) {
				map.put("key" + i, line);
				i++;
			}
		}
		for (int j = 0; j < map.size(); j++) {
			System.out.println(map.get("key" + j));
			pw.println(map.get("key" + j));
		}
		pw.close();
		bw.close();
		osw.close();
		fos.close();
		br.close();
		isr.close();
		fis.close();
	}
}
