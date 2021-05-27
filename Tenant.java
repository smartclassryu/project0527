package tenantManegement;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Map.Entry;

public class Tenant {
	String name = null;
	String add = null;
	String tel = null;
	String famInfo = null;
	String[] tenantInfo = new String[3];
	
	Scanner scan = new Scanner(System.in);
	
	
	HashMap<String, String[]> tenant = new HashMap<String, String[]>();
	
	void input() {
		System.out.println("�ֹ����� �Է��� �����մϴ�.\n");

		
		while(true) {
			//�ʱ�ȭ
			name = null;
			add = null;
			tel = null;
			famInfo = null;
			
			
			System.out.println("�̸��� �Է��ϼ���.");
			name = scan.next();
			System.out.println("�ּҸ� �Է��ϼ���.");
			add = scan.next();
			System.out.println("��ȭ��ȣ�� �Է��ϼ���.");
			tel = scan.next();
			System.out.println("���������� �Է��ϼ���.");
			famInfo = scan.next();
			
			add = "�ּ�:"+add;
			tenantInfo[0] = "�̸�:"+name;
			tenantInfo[1] = "��ȭ��ȣ:"+tel;
			tenantInfo[2] = "��������:"+famInfo;
			
			
			tenant.put(add, tenantInfo);
			
			System.out.println("�ֹ����� �Է��� ����Ͻðڽ��ϱ�?(Y/N)\n");
			String ans = scan.next();
			if(ans.equals("Y") || ans.equals("y")) {
				System.out.println("�ֹ����� �Է��� ����մϴ�.\n");
			}else if(ans.equals("N") || ans.equals("n")) {
				System.out.println("�ֹ����� �Է��� �׸��Ӵϴ�.\n");
				break;
			}else {
				System.out.println("�߸��Է��ϼ̽��ϴ�. �ʱ�ȭ������ ���ư��ϴ�.");
				break;
			}
		}
	}
	
	void output() {
		String[] tenantInfo;
		System.out.println("��ü �ֹ����� ������ �����մϴ�.\n");

		Iterator iterator = tenant.entrySet().iterator();
		
		while(iterator.hasNext()) {
			Entry entry = (Entry) iterator.next();
			
			tenantInfo = (String[]) entry.getValue();
			
			System.out.print(add+"\t");
			for(int i =0; i < tenantInfo.length; i++) {
				System.out.print(tenantInfo[i]+"\t");
			}
			System.out.println("\n");
		}
	}
	
	void lookUp() {
		System.out.println("��ȸ�� �ּҸ� �Է��ϼ���");
		String findAdd = scan.next();
		
		System.out.println(findAdd+"�� �ּ��� ������ ��ȸ�մϴ�.\n");
		
		String[] findInfo = tenant.get(findAdd);
		
		System.out.println("�ּ�:");
	}
	

}