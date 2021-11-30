package _05_vault;

import java.util.Random;



/**
 * 
 * A vault with a secret code
 *
 */
public class VaultHacker {
	public static void main(String[] args) {
		Vault v = new Vault();
		SecretAgent sa = new SecretAgent();
		int code = sa.findCode(v);
		boolean success = v.tryCode(code);
		System.out.println("Opened it: " + success + " with " + code);
	}
}

class SecretAgent {
	final int MAX_CODE= 1000000;
	
	public int findCode(Vault v) {
		for (int i = 0; i < MAX_CODE; i++) {
			if (v.tryCode(i)) {
				return i;
			}
		}
		return -1;
	}
}