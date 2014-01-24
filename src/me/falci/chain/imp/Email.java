package me.falci.chain.imp;

import me.falci.chain.Chain;
import me.falci.chain.ManagerChain;

public class Email implements Chain {

	@Override
	public void doChain(ManagerChain chain) {
		System.out.println("Enviando email...");
		
		chain.next();
	}

}
