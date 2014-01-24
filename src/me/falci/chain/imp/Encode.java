package me.falci.chain.imp;

import me.falci.chain.Chain;
import me.falci.chain.ManagerChain;

public class Encode implements Chain {

	@Override
	public void doChain(ManagerChain chain) {
		System.out.println("Encode antes");
		
		chain.next();
		
		System.out.println("Encode depois");
		
	}

}
