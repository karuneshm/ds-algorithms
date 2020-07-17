package com.karunesh.course;

import java.util.Scanner;

public class QuickFindUF {
	
	private int [] id;
	
	public QuickFindUF(int n) {
		id = new int[n];
		for(int i = 0; i<n; i++) {
			id[i] = i;
		}
	}
	
	public boolean connected(int p, int q) {
		return id[p] == id[q];
	}
	
	public void union(int p, int q) {
		
		int pid = id[p];
		int qid = id[q];
		
		for(int i = 0; i<id.length ;i++) {
			if(id[i] == pid) id[i] = qid;
		}
	}
	
	
	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		QuickFindUF findUF = new QuickFindUF(N);
		while(scanner.hasNext()) {
			int p = scanner.nextInt();
			int q = scanner.nextInt();
			if(!findUF.connected(p, q)) {
				findUF.union(p, q);
				System.out.println(p+ " "+q);
			} else {
				System.out.println(p+","+q+ " are connected");
			}
		}
		
		scanner.close();
	}

}
