package CCBS;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class test {
	public static void main(String[] args) {
		try {
			// read file content from file
			StringBuffer sb = new StringBuffer();

//			FileReader reader = new FileReader(
//					"D:\\si1204\\Desktop\\Test Case\\Test Case First\\CCBS\\Case01\\SB.TESTD.SB52DELO.CCBS20.TEST.cpy");
			FileReader reader = new FileReader(
					"D:\\si1204\\Desktop\\Test Case First\\CCBS\\Case02\\SB.TESTD.SF58M1.CCBS20.TEST.cpy");
			BufferedReader br = new BufferedReader(reader);

			String str = null;

			int i = 0;
			int sum = 0;
			while ((str = br.readLine()) != null) {
				sb.append(str + "\n");
				if ((!str.contains("*")) && str.contains("(")) {
					i = Integer.parseInt(str.substring(str.indexOf("(")+1,str.indexOf(")")));
					sum = sum + i;
System.out.println(i);
				}
				System.out.println(str);
				System.out.println(sum);
			}

			br.close();
			reader.close();

			// write string to file
			// FileWriter writer = new FileWriter("c://testWrite.txt");
			// BufferedWriter bw = new BufferedWriter(writer);
			// bw.write(sb.toString());
			//
			// bw.close();
			// writer.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
