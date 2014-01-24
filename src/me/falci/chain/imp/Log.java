package me.falci.chain.imp;

import me.falci.chain.Chain;
import me.falci.chain.ManagerChain;

public class Log implements Chain{

	@Override
	public void doChain(ManagerChain chain) {
		System.out.println("LOG antes");
		
		chain.next();
		
		System.out.println("LOG depois");
	}
	
}
