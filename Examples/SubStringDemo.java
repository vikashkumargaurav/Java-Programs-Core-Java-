import java.util.* ;
class SubStringDemo 
{


	public static boolean isSubString(String sentence, String substring){
	
			
			int subLength = substring.length();

			int subIndex = 0;

			for(int i=0 ; i<sentence.length(); i++){
			
					if(subIndex==subLength){
					
						break;
					}


				if(substring.charAt(subIndex)==sentence.charAt(i)){
						
								subIndex++;
				
				}else{
				
					subIndex=0;
				}

			}

			System.out.println("totla" + subIndex);

			if(subIndex == (subLength)  ){
		
			 return true;
			}else{
			return false;
			}
	
	}







	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		String sentence = scan.nextLine();
		String subString = scan.nextLine();
		
		boolean res = isSubString(sentence, subString);

		System.out.println(res);
		
	}
}
