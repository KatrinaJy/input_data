package com.springboot.gradu.util;

public class FybmUtil {

	/**
	 * ������ĸ�ķ�Ժ���ű��תΪ���֣���"A1"��תΪ361��"CZ1"��תΪ16813����Ϊ���ű���а�����ĸ������ʹ��36������ת��
	 * @param zmbh ����ĸ�ı��
	 */
	public static int convertZmbhToIntBh(String zmbh){
		int bh = 0;
		if(zmbh!=null){
			if(StringUtil.isBlank(zmbh))
				return 0;
			zmbh = zmbh.toUpperCase();
			
			for(int i = 0; i < zmbh.length(); i++){
				char current = zmbh.charAt(i);
				int num;
				
				if('0' <= current && current <= '9')
					num = current - '0';
				else if('A' <= current && current <= 'Z')
					num = current - 'A' + 10;
				else//��Ӧ�ó���
					num = current;
				
				bh += num * Math.pow(36, zmbh.length() - 1 - i);
			}
		}
		return bh;
	}
}