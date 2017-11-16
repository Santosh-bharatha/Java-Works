package com.abstractclass;

public class MainListItem {
	
	public static void main(String args[]){
		MyLinkedList list = new MyLinkedList(null);
		list.traverse(list.getRoot());
		
		String stringData = "Darwin brisbane perth melbourne canberra";
		
		String[] data = stringData.split(" ");
		for(String s : data){
			list.addItem(new Node(s));
		}
		list.traverse(list.getRoot());
	}
	
	

}
