package me.falci.chain.imp;

import me.falci.chain.Chain;
import me.falci.chain.ManagerChain;

public class FTP implements Chain{

	@Override
	public void doChain(ManagerChain chain) {
		System.out.println("A��o FTP...");
		
		chain.next();		
	}

}
