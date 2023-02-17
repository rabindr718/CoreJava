import javax.swing.JOptionPane; 
class Monoalphabetic {
	public static String key = "ISYVKJRUXEDZQMCTPLOFNBWGAH"; 
	public static void main(String[] args) {
	String text;
	int ch;
	ch = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter 1 to Encrypt and 2 toDecrypt!"));
		text = JOptionPane.showInputDialog(null, "Enter plain/cipher text to encrypt?"); text = text.toUpperCase();
		text = text.replaceAll("\\s","");
		char[] ptextchars = text.toCharArray();
		switch(ch){
		case 1:
		for(int i=0;i< text.length(); i++){
		ptextchars[i] = encrypt(ptextchars[i]); }
		break; case 2:
		for(int i=0;i< text.length(); i++){ ptextchars[i] = decrypt(ptextchars[i]);
		}
		break;
		default: System.out.println("Invalid Choice!");
		}
		System.out.println(ptextchars); }
		private static char encrypt(char a) { int pos = (int)a;
		pos = (pos % 91)- 65;
		a = key.charAt(pos);
		return a; }
		private static char decrypt(char a) { int ascii = 0;
		for(int i=0;i< key.length(); i++){
		if(key.charAt(i) == a) ascii = i + 65;
		}
		return (char)ascii; }

}
