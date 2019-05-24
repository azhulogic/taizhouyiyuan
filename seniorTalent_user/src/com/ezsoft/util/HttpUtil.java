package com.ezsoft.util;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class HttpUtil {
	/**
	 * 
	 * @param urlString
	 * @param data json格式
	 * @return
	 */
	public static String sendJsonPost (String urlString, String data){
		HttpURLConnection  conn = null;
		BufferedReader br = null;
		try {
			URL url = new URL(urlString);
			conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("POST");   //设置本次请求的方式 ， 默认是GET方式， 参数要求都是大写字母
            conn.setConnectTimeout(5000);//设置连接超时
            conn.setRequestProperty("Content-Type", "application/json");
            conn.setDoInput(true);//是否打开输入流 ， 此方法默认为true
            conn.setDoOutput(true);//是否打开输出流， 此方法默认为false
            DataOutputStream dos = new DataOutputStream(conn.getOutputStream());
            dos.writeBytes(data);
            dos.flush();
            dos.close();
            conn.connect();//表示连接
            InputStream  in = conn.getInputStream();
            br = new BufferedReader(new InputStreamReader(in));
            StringBuilder response = new StringBuilder();
            String line;
            while ( (line = br.readLine()) != null){
            	response.append(line);
            }
            br.close();
            in.close();
            
            return response.toString();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return "";
		
	}
	
	public static String sendGet (String urlString, String data){
		HttpURLConnection  conn = null;
		BufferedReader br = null;
		try {
			URL url = new URL(urlString+"?"+data);
			conn = (HttpURLConnection) url.openConnection();
            conn.setConnectTimeout(5000);//设置连接超时
            conn.connect();//表示连接
            InputStream  in = conn.getInputStream();
            br = new BufferedReader(new InputStreamReader(in));
            StringBuilder response = new StringBuilder();
            String line;
            while ( (line = br.readLine()) != null){
            	response.append(line);
            }
            br.close();
            in.close();
            
            return response.toString();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return "";
		
	}
	
	public static String sendFormPost (String urlString, String data){
		HttpURLConnection  conn = null;
		BufferedReader br = null;
		try {
			URL url = new URL(urlString);
			conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("POST");   //设置本次请求的方式 ， 默认是GET方式， 参数要求都是大写字母
            conn.setConnectTimeout(5000);//设置连接超时
            conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            conn.setDoInput(true);//是否打开输入流 ， 此方法默认为true
            conn.setDoOutput(true);//是否打开输出流， 此方法默认为false
            DataOutputStream dos = new DataOutputStream(conn.getOutputStream());
            dos.write(data.getBytes("UTF-8"));
            dos.flush();
            dos.close();
            conn.connect();//表示连接
            InputStream  in = conn.getInputStream();
            br = new BufferedReader(new InputStreamReader(in));
            StringBuilder response = new StringBuilder();
            String line;
            while ( (line = br.readLine()) != null){
            	response.append(line);
            }
            br.close();
            in.close();
            
            return response.toString();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				if(br != null){
					br.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return "";
		
	}
	
	public static String sendXmlPost (String urlString, String data){
		HttpURLConnection  conn = null;
		BufferedReader br = null;
		try {
			URL url = new URL(urlString);
			conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("POST");   //设置本次请求的方式 ， 默认是GET方式， 参数要求都是大写字母
            conn.setConnectTimeout(5000);//设置连接超时
            conn.setRequestProperty("Content-Type", "application/xml");
            conn.setDoInput(true);//是否打开输入流 ， 此方法默认为true
            conn.setDoOutput(true);//是否打开输出流， 此方法默认为false
            PrintWriter out = new PrintWriter(new OutputStreamWriter(conn.getOutputStream(),"UTF-8"));
            // 发送请求参数
            out.print(data);
            out.flush();
            out.close();
            conn.connect();//表示连接
            InputStream  in = conn.getInputStream();
            br = new BufferedReader(new InputStreamReader(in));
            StringBuilder response = new StringBuilder();
            String line;
            while ( (line = br.readLine()) != null){
            	response.append(line);
            }
            br.close();
            in.close();
            
            return response.toString();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return "";
		
	}
}
