package ssr.prac.level.one;

public class VowelReplacement {
	
	public static boolean isVowel(char c){
		switch(c){
		case 'a': return true;
		case 'A': return true;
		case 'e': return true;
		case 'E': return true;
		case 'i': return true;
		case 'I': return true;
		case 'o': return true;
		case 'O': return true;
		case 'u': return true;
		case 'U': return true;
		default: return false;
		}		
	}

	public static void main(String[] args) {
		boolean flag = false;
		String str = "Deepak Patel";
		for(int i = 0; i<str.length(); i++ ){
			if(!isVowel(str.charAt(i))){
				System.out.print(str.charAt(i));
				flag = false;
				continue;
			}else{				
				if(!flag){
					flag = true;
					continue;
				}
			}if(flag){
				System.out.print(str.charAt(i-1) +""+str.charAt(i));
				flag = false;
			}
			
		}

	}

}
