package blockchain;

import java.util.ArrayList;

public class Main {
	
	private static ArrayList<Block> blockChain = new ArrayList<Block>(); 

	public static void main(String[] args) {
		
		// Create genesis block
		blockChain.add(new Block((new String[] {"First transaction info"}), 0 ));
		printBlockChain();
		
		// Create the rest of blocks
		createBlock(new String[] {"Juan tiene 10 btc", "Papu tiene 1 btc"});
		createBlock(new String[] {"Juan tiene 10 btc", "Papu tiene 1 btc"});
		createBlock(new String[] {"Juan tiene 10 btc", "Papu tiene 1 btc"});
		createBlock(new String[] {"Juan tiene 10 btc", "Papu tiene 1 btc"});
	}

	public static void createBlock(String[] transaction) {
		blockChain.add(new Block( transaction, blockChain.getLast().getBlockHash() ));
		printBlockChain();
	}
	
	public static void printBlockChain() {
		System.out.println("Blockchain actual (" + blockChain.size() + "):\n" + blockChain.toString() + "\n");
	}

}
