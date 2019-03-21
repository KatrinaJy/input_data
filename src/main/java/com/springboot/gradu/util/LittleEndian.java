package com.springboot.gradu.util;

/**
 * 
 * @author GleeYoung
 *
 */
public class LittleEndian {
	private static byte[] toLittleEndianBytes(long data, int dataLen){
		byte result[] = new byte[dataLen];
		
		for(int i = 0; i < dataLen; i++)
			result[i] = (byte)((data >> (i * 8)) & 0xFF);
		
		return result;
	}
	
	/**
	 * ��byteתΪС���ֽ�����
	 * @param data Ҫת������
	 * @return С���ֽ�����
	 */
	public static byte[] toLittleEndianBytes(byte data){
		return toLittleEndianBytes(data, 1);
	}
	
	/**
	 * ��shortתΪС���ֽ�����
	 * @param data Ҫת������
	 * @return С���ֽ�����
	 */
	public static byte[] toLittleEndianBytes(short data){
		return toLittleEndianBytes(data, 2);
	}
	
	/**
	 * ��intתΪС���ֽ�����
	 * @param data Ҫת������
	 * @return С���ֽ�����
	 */
	public static byte[] toLittleEndianBytes(int data){
		return toLittleEndianBytes(data, 4);
	}
	
	/**
	 * ��longתΪС���ֽ�����
	 * @param data Ҫת������
	 * @return С���ֽ�����
	 */
	public static byte[] toLittleEndianBytes(long data){
		return toLittleEndianBytes(data, 8);
	}
	
	/**
	 * ��short����תΪС���ֽ���
	 */
	public static byte[] toLittleEndianBytes(short data[]){
		byte result[] = new byte[data.length * 2];
		
		for(int i = 0; i < data.length; i++){
			byte twoBytes[] = toLittleEndianBytes(data[i]);
			System.arraycopy(twoBytes, 0, result, i * 2, 2);
		}
		
		return result;
	}
	
	/**
	 * ��int����תΪС���ֽ���
	 */
	public static byte[] toLittleEndianBytes(int data[]){
		byte result[] = new byte[data.length * 4];
		
		for(int i = 0; i < data.length; i++){
			byte fourBytes[] = toLittleEndianBytes(data[i]);
			System.arraycopy(fourBytes, 0, result, i * 4, 4);
		}
		
		return result;
	}
	
	/**
	 * ���ֽ����鰴С��˳��תΪlongֵ������ǰ8���ֽڽ���ת����
	 * ��data={1, 2}����תΪ0000001000000001������ֵΪ513
	 * @param data С���ֽ�����
	 * @return longֵ
	 */
	public static long toLongValue(byte data[]){
		long result = 0;
		int index = data.length > 7 ? 7 : data.length - 1; //����ǰ�˸��ֽڽ���ת��
		
		for(; index >= 0; index--){
			result |= ((long)(data[index] & 0xFF)) << (index * 8);
		}
		
		return result;
	}
	
	/**
	 * ����С�˷��ƴ�������Ķ��short�𿪡�
	 * ��data={1, 0, 2, 0, 0, 1}���򷵻�ֵΪ{1, 2, 256}��
	 * @param data
	 * @return
	 */
	public static short[] toShortArray(byte data[]){
		short result[] = new short[data.length / 2];
		
		for(int i = 0; i < result.length; i++){
			byte twoBytes[] = new byte[2];
			
			System.arraycopy(data, i * 2, twoBytes, 0, 2);
			
			result[i] = (short)toLongValue(twoBytes);
		}
		
		return result;
	}
	
	/**
	 * ����С�˷��ƴ�������Ķ��int�𿪡�
	 * ��data={1, 0, 0, 0, 2, 0, 0, 0, 0, 1, 0, 0}���򷵻�ֵΪ{1, 2, 256}��
	 * @param data
	 * @return
	 */
	public static int[] toIntArray(byte data[]){
		int result[] = new int[data.length / 4];
		
		for(int i = 0; i < result.length; i++){
			byte fourBytes[] = new byte[4];
			
			System.arraycopy(data, i * 4, fourBytes, 0, 4);
			
			result[i] = (int)toLongValue(fourBytes);
		}
		
		return result;
	}
	
	/**
	 * ����С�˷��ƴ�������Ķ��long�𿪡�
	 * ��data={1, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0,}���򷵻�ֵΪ{1, 2, 256}��
	 * @param data
	 * @return
	 */
	public static long[] toLongArray(byte data[]){
		long result[] = new long[data.length / 8];
		
		for(int i = 0; i < result.length; i++){
			byte eightBytes[] = new byte[8];
			
			System.arraycopy(data, i * 8, eightBytes, 0, 8);
			
			result[i] = toLongValue(eightBytes);
		}
		
		return result;
	}
	
}
