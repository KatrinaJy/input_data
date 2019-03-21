package com.springboot.gradu.util;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FileOperateUtil {

	/**
	 * �����ļ�
	 * 
	 * @param request
	 * @param response
	 * @param downLoadPath
	 * @param contentType
	 * @param realName
	 * @throws Exception
	 */
	public static void download(HttpServletRequest request,
                                HttpServletResponse response, String downLoadPath,
                                String contentType, String realName) throws Exception {
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;

		long fileLength = new File(downLoadPath).length();

		// response.setContentType(contentType);
		response.setHeader("Content-disposition", "attachment; filename="
				+ new String(realName.getBytes(), "ISO-8859-1"));
		response.setHeader("Content-Length", String.valueOf(fileLength));

		bis = new BufferedInputStream(new FileInputStream(downLoadPath));
		bos = new BufferedOutputStream(response.getOutputStream());
		byte[] buff = new byte[2048];
		int bytesRead;
		while (-1 != (bytesRead = bis.read(buff, 0, buff.length))) {
			bos.write(buff, 0, bytesRead);
		}
		bis.close();
		bos.close();
	}
	
	public static boolean writeLog(String filename,String text){
		File file=new File(filename);
//		if(!file.exists())
//			file.createNewFile();
		FileWriter fw;
		try {
			fw = new FileWriter(file,true);
			BufferedWriter bw=new BufferedWriter(fw);
			bw.write(text);
			bw.close();
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	/**
	 * ���ض������ȡ�ļ�
	 * 
	 * @param f
	 * @param charset
	 * @return
	 * @throws IOException 
	 */
	public static String getStringFromFile(File f, String charset) throws IOException {
		StringBuffer sb = new StringBuffer(); // �ļ��ܳ��Ļ�����ʹ��StringBuffer
		FileInputStream fis = new FileInputStream(f);
		InputStreamReader isr = new InputStreamReader(fis, charset);
		BufferedReader br = new BufferedReader(isr);
		String line = null;
		while ((line = br.readLine()) != null) {
			sb.append(line).append("\r\n");
		}
		br.close();
		isr.close();
		fis.close();
		return sb.toString();
	}
	
	/**
	 * NIO way
	 * 
	 * @param filename
	 * @return
	 * @throws IOException
	 */
	public static byte[] toByteArray(String filename) throws IOException {
 
		File f = new File(filename);
		if (!f.exists()) {
			throw new FileNotFoundException(filename);
		}
 
		FileChannel channel = null;
		FileInputStream fs = null;
		try {
			fs = new FileInputStream(f);
			channel = fs.getChannel();
			ByteBuffer byteBuffer = ByteBuffer.allocate((int) channel.size());
			while ((channel.read(byteBuffer)) > 0) {
				// do nothing
				// System.out.println("reading");
			}
			return byteBuffer.array();
		} catch (IOException e) {
			e.printStackTrace();
			throw e;
		} finally {
			try {
				channel.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				fs.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void createFileByBytes(byte[] bfile, String filePath, String fileName){
		BufferedOutputStream bos=null;
		FileOutputStream fos=null;
		File file=null;
		try{
			File dir=new File(filePath);
			if(!dir.exists() && dir.isDirectory()){
				dir.mkdirs();
			}
			file=new File(filePath+File.separator+fileName);
			fos=new FileOutputStream(file);
			bos=new BufferedOutputStream(fos);
			bos.write(bfile);
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if(bos!=null){
				try{
					bos.close();
				}catch(IOException e1){
					e1.printStackTrace();
				}
			}
			if(fos!=null){
				try{
					fos.close();
				}catch(IOException e1){
					e1.printStackTrace();
				}
			}
		}
	}
}
