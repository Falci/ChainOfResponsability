package me.falci.chain;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class ManagerChain {
	Queue<Chain> fila = new LinkedList<>();
	
	public ManagerChain(Chain ... chains){
		fila.addAll(Arrays.asList(chains));
	}

	public void next() {
		if(fila.isEmpty()){
			return;
		}
		
		Chain chain = fila.poll();
		chain.doChain(this);
	}

}
