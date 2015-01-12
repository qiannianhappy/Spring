package com.qin.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;

public class UtilTools {

	public static String addBrShow(String txt) {
		System.out.println("enter  addbrshow");
		if (txt != null) {
			txt = txt.replaceAll("\n", "<br>");
			txt = txt.replaceAll(" ", "&nbsp;");
		}
		return txt;
	}

	public static boolean isAjax(HttpServletRequest request) {
		if (request != null
				&& "XMLHttpRequest".equalsIgnoreCase(request
						.getHeader("X-Requested-With")))
			return true;
		return false;
	}

	// 判断输入是否为整数或带两位小数的正实数
	public static boolean isNumeric(String str) {
		Pattern pattern = Pattern.compile("^[0-9]+.{0,1}[0-9]{0,2}$");
		Matcher isNum = pattern.matcher(str);
		if (!isNum.matches()) {
			return false;
		}
		return true;
	}

	// 判断输入是否为整数
	public static boolean isInteger(String str) {
		Pattern pattern = Pattern.compile("^[0-9]+$");
		Matcher isNum = pattern.matcher(str);
		if (!isNum.matches()) {
			return false;
		}
		return true;
	}

	// 生成MD5加密字符串
	public static String MD5(String pwd) {
		pwd = pwd.trim();
		String Digest = "";
		try {
			MessageDigest currentAlgorithm = MessageDigest.getInstance("md5");
			currentAlgorithm.reset();
			currentAlgorithm.reset();
			byte[] mess = pwd.getBytes();// 获取要加密的byte数组
			byte[] hash = currentAlgorithm.digest(mess);// 获取加密以后的byte数组
			for (int i = 0; i < hash.length; i++) {
				int v = hash[i];
				if (v < 0)
					v = 256 + v; // 如果 v < 0 将其变换为 > 0 的数，否则不好转换成字符，哪有ASC代码<0的呀
				if (v < 16)
					Digest += "0"; // 如果该v<16说明转换为16进制数就是只有个为，例如15转换成
									// F，现在补上一个0就成了 0F 长度就相等了
				Digest += Integer.toString(v, 16).toUpperCase() + "";
			}
		} catch (NoSuchAlgorithmException e) {
			System.out.println("MD5算法没有加载");
			e.printStackTrace();
		}
		return Digest;
	}
	
	
	/**
	 *用于四舍五入
	 * @param temp_num
	 * @return
	 */
	public static String fourPointFive(String temp_num){
		try{
			double d = Double.valueOf(temp_num);
			long l = Math.round(d);
			String str = Long.toString(l);
			return str;
		}catch(Exception e){
			return temp_num;
		}
				
	}

}
