package me.falci.chain;

import me.falci.chain.imp.Email;
import me.falci.chain.imp.Encode;
import me.falci.chain.imp.FTP;
import me.falci.chain.imp.Log;

public class Main {

	public static void main(String[] args) {
		Chain ftp = new FTP();
		Chain email = new Email();
		Chain log = new Log();
		Chain encode = new Encode();
		
		new ManagerChain(email, log, encode, ftp).next();
	}
}
