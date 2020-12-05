package ua.academy.lgs2;



public class Application {
	public static void main(String[] args) {
		Map<Integer,Integer> map = new Map<Integer,Integer>();
		
		map.addToMap();
		map.addToMap();
		map.addToMap();
		map.addToMap();
		map.printKeySet();
		map.printValueList();
		map.printMap();
		map.deleteByKey();
		map.deleteByValue();
		map.printKeySet();
		map.printValueList();
		map.printMap();
		
		
	}

}
