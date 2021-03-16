package CCBS;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;



public class ReadAndWriteCPY {
	
	public static void main(String[] args) {
		
		String line = null;
		int num = 0; 
		int	sum = 0;
		StringBuffer sb = new StringBuffer();

		try {
			FileInputStream fis = new FileInputStream("d:\\si1206\\Desktop\\Test Case\\Test Case First\\CCBS\\Case01\\SB.TESTD.SB52DELO.CCBS20.TEST.cpy");
			InputStreamReader isr = new InputStreamReader(fis,"UTF-8");
			BufferedReader br = new BufferedReader(isr);
			FileOutputStream fos = new FileOutputStream("‪d:\\si1206\\Desktop\\測試用\\test1.txt");
			OutputStreamWriter osw = new OutputStreamWriter(fos,"UTF-8");
			BufferedWriter bw = new BufferedWriter(osw);
			PrintWriter pw = new PrintWriter(bw);
			while((line = br.readLine()) != null) {
				sb.append(line + "\n");
				if ((!line.contains("*")) && line.contains("(")) {
					num = Integer.parseInt(line.substring(line.indexOf("(")+1,line.indexOf(")")));
					sum += num;
				}
				pw.println(line + "current length " + sum);
				System.out.println(line + "current length " + sum);

			}
			pw.close();
			bw.close();
			osw.close();
			fos.close();
			br.close();
			isr.close();
			fis.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	
}

