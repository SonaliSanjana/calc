import java.util.*;
class coursework{
	
	public final static void clearConsole(){
		try {   
			final String os = System.getProperty("os.name");
			if (os.contains("Windows")) {
				new ProcessBuilder("cmd", "/c","cls").inheritIO().start().waitFor();
			}else {
				System.out.print("\033[H\033[2J");
				System.out.flush();
			}
		}catch (final Exception e) {
			e.printStackTrace();
		}
	}

	
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		boolean running = true;
		
		 while (running) {


			System.out.println("                                        __   ______             __            ");
			System.out.println("                                       |  \\ /      \\           |  \\          ");
			System.out.println("                                        \\$$|  $$$$$$\\  ______  | $$  _______  ");
			System.out.println("                                       |  \\| $$   \\$$ |      \\ | $$ /       \\");
			System.out.println("                                       | $$| $$        \\$$$$$$\\| $$|  $$$$$$$");
			System.out.println("                                       | $$| $$   __  /      $$| $$| $$      ");
			System.out.println("                                       | $$| $$__/  \\|  $$$$$$$| $$| $$_____");
			System.out.println("                                       | $$ \\$$    $$ \\$$    $$| $$ \\$$     \\");
			System.out.println("                                        \\$$  \\$$$$$$   \\$$$$$$$ \\$$  \\$$$$$$$\n\n");
		
			System.out.println("   _   _                       _                        _____                                         _");
			System.out.println("  | \\ | |                     | |                      / ____|                                       | | ");
			System.out.println("  |  \\| |  _   _   _ __ ___   | |__     ___   _ __    | |        ___    _ __   __   __   ___   _ __  | |_    ___   _ __");
			System.out.println("  | . ` | | | | | | '_ ` _ \\  | '_ \\   / _ \\ | '__|   | |       / _ \\  | '_ \\  \\ \\ / /  / _ \\ | '__| | __|  / _ \\ | '__|");
			System.out.println("  | |\\  | | |_| | | | | | | | | |_) | |  __/ | |      | |____  | (_) | | | | |  \\ v /  |  __/ | |    | |_  |  __/ | | ");
			System.out.println("  |_| \\_|  \\__,_| |_| |_| |_| |_,__/   \\___| |_|       \\_____|  \\___/  |_| |_|   \\_/    \\___| |_|     \\__|  \\___| |_|     ");
			System.out.println("=========================================================================================================================\n\n");
		
			System.out.println("        [01] Decimal Converter ");
			System.out.println("        [02] Binary Converter ");
			System.out.println("        [03] Octal Converter ");
			System.out.println("        [04] Hexadecimal Converter ");
			System.out.println("        [05] Roman Number Converter ");
		
			System.out.print("\n\nEnter Option ->");
			int option=input.nextInt();
			clearConsole();
		
			String sp1="+--------------------------------------------+";
			String sp2="            ";
			String decimal="Decimal Converter";
			String binary="Binary Converter";
			String octal="Octal Converter";
			String hexadecimal="HexaDecimal Converter";
			String roman="Roman Number Converter";
	
			switch (option){
				case 1:
					System.out.printf("%s%n|%s%-32s|%n%s",sp1,sp2,decimal,sp1+"\n\n\n");
					boolean validinput=false;
					int num;
					do{
						System.out.print("Enter an Decimal number : ");
						num=input.nextInt();
						if (num>=0){
							validinput=true;
						}else if(num<0){
							System.out.println("Invalid Input...");
							System.out.print("\n\nDO you want to input number again(Y/N) -> ");
							char again=input.next().charAt(0);
							switch(again){
								case 'N':
									validinput=true;
									num=-1;
									clearConsole();
									break;
									
								case 'Y':
									validinput=false;
								}	
							}
						}while(!validinput);
						
						if (num>=0){
						String binary1 = "";
						String octal_1 = "";
						String hexadecimal_1 = "";
						char[] hexChars={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
						int tempnum=num;
        
						while (tempnum > 0) {
							int remainder = tempnum % 2;
							binary1 = remainder + binary1;
							tempnum = tempnum / 2;
							}
							
							System.out.println("\n\nBinary: " + binary1);

						tempnum=num;
						while (tempnum > 0) {
							int remainder = tempnum % 8;
							octal_1 = remainder + octal_1;
							tempnum = tempnum / 8;
							}
							
							System.out.println("Octal: " + octal_1);
							
						tempnum=num;
						while (tempnum > 0) {
							int remainder = tempnum % 16;
							hexadecimal_1 = hexChars[remainder] + hexadecimal_1;
							tempnum = tempnum / 16;
							}
						System.out.println("Hexadecimal: " + hexadecimal_1);
						
						System.out.print("\n\nDo you want to go to the homepage? (Y/N) -> ");
						char choice = input.next().charAt(0);
						 if (choice == 'Y'){
							 num=-1;
							 clearConsole();
						}else{
							System.exit(0);
						}
					}
						
					break;
			
			
			
				case 2:
					System.out.printf("%s%n|%s%-32s|%n%s",sp1,sp2,binary,sp1);
					boolean validinput1=false;
					long num1;
					do{
						System.out.print("\n\nEnter an Binary number : ");
						num1=input.nextLong();
						long tempnum1=num1;
						while(tempnum1!=0){
								int ch=(int)tempnum1%10;
								if (ch!=0 && ch!=1){
									System.out.println("Invalid Input...");
									System.out.print("\n\nDO you want to input number again(Y/N) -> ");
									char again=input.next().charAt(0);
									switch(again){
										case 'N':
											validinput1=true;
											num1=-1;
											ch=0;
											clearConsole();
											break;
									
										default:
											validinput1=false;
											break;
									}	
									break;
								}else{
									validinput1=true;
								}
									tempnum1=tempnum1/10;
						}
					}while(!validinput1);
					long tempnum2=num1;
					if (num1>0){ 
						double n=0;
						double des=0;
						double dig;
						while(tempnum2!=0){
							dig=tempnum2%10;
							des=des+(dig*Math.pow(2,n));
							tempnum2=tempnum2/10;
							++n;
							}
					System.out.println("\n\nDecimal Number : " + (int)des);
					
					tempnum2=num1;
					int des1=(int)des;
					int remainder=0;
					String octal_2 = "";
						while (des1 > 0) {
							remainder = des1 % 8;
							octal_2 = remainder + octal_2;
							des1 = des1 / 8;
							}
							
					System.out.println("Octal: " +octal_2);
					
					String hexadecimal_1 = "";
					char[] hexChars={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
					tempnum2=num1;
					des1=(int)des;
					while (des1 > 0) {
							remainder = des1 % 16;
							hexadecimal_1 = hexChars[remainder] + hexadecimal_1;
							des1 = des1 / 16;
							}
						System.out.println("Hexadecimal: " + hexadecimal_1);
						
						
						System.out.print("\n\nDo you want to go to the homepage? (Y/N) -> ");
						char choice = input.next().charAt(0);
						 if (choice == 'Y'){
							 num1=-1;
							 clearConsole();
						}else{
							System.exit(0);
						}
					}
					
					break;
				
				case 3:
					System.out.printf("%s%n|%s%-32s|%n%s",sp1,sp2,octal,sp1);
					boolean validinput2=false;
					long num2;
					do{
						System.out.print("\n\nEnter an Octal number : ");
						num2=input.nextLong();
						long tempnum3=num2;
						while(tempnum3!=0){
								int ch=(int)tempnum3%10;
								if (ch<0 || ch>7){
									System.out.println("Invalid Input...");
									System.out.print("\n\nDO you want to input number again(Y/N) -> ");
									char again=input.next().charAt(0);
									switch(again){
										case 'N':
											validinput2=true;
											num2=-1;
											ch=-1;
											clearConsole();
											break;
									
										default:
											validinput2=false;
											break;
									}	
									break;
								}else{
									validinput2=true;
								}
									tempnum3=tempnum3/10;
						}
					}while(!validinput2);
					long tempnum4=num2;
					if (num2>0){ 
						double n=0;
						double des=0;
						double dig;
						while(tempnum4!=0){
							dig=tempnum4%10;
							des=des+(dig*Math.pow(8,n));
							tempnum4=tempnum4/10;
							++n;
							}
					System.out.println("\n\nDecimal Number : " + (int)des);
					
					tempnum4=num2;
					int des1=(int)des;
					int remainder=0;
					String binary2 = "";
						while (des1 > 0) {
							remainder = des1 % 2;
							binary2 = remainder + binary2;
							des1 = des1 / 2;
							}
							
							System.out.println("Binary: " + binary2);
					
					String hexadecimal_1 = "";
					char[] hexChars={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
					tempnum4=num2;
					des1=(int)des;
					while (des1 > 0) {
							remainder = des1 % 16;
							hexadecimal_1 = hexChars[remainder] + hexadecimal_1;
							des1 = des1 / 16;
							}
						System.out.println("Hexadecimal: " + hexadecimal_1);
						
						
						System.out.print("\n\nDo you want to go to the homepage? (Y/N) -> ");
						char choice = input.next().charAt(0);
						 if (choice == 'Y'){
							 num1=-1;
							 clearConsole();
						}else{
							System.exit(0);
						}
					}
					
					break;
				
				case 4:
					System.out.printf("%s%n|%s%-32s|%n%s",sp1,sp2,hexadecimal,sp1);
					boolean validinput3=false;
					boolean v2=true;
					String num3;
					do{
						System.out.print("\n\nEnter an HexaDecimal number : ");
						num3=input.next();
						int n = num3.length();
						for (int i = 0; i < n; i++) {
								char ch1 = num3.charAt(i);
								if ((ch1 < '0' || ch1 > '9') && (ch1 < 'A' || ch1 > 'F') && (ch1 < 'a' || ch1 > 'f')){
									System.out.println("Invalid Input...");
									System.out.print("\n\nDO you want to input number again(Y/N) -> ");
									char again=input.next().charAt(0);
									switch(again){
										case 'N':
											validinput3=true;
											v2=false;
											num3="T";
											ch1='H';
											clearConsole();
											break;
									
										default:
											validinput3=false;
											break;
									}	
									break;
								}else{
									validinput3=true;
								}
						}
					}while(!validinput3);
					if (v2==true){
					int des1=Integer.parseInt(num3,16);
					System.out.println("\n\nDecimal: " +(int) des1);
					
					String binary3 = "";
					String octal_3 = "";
					int des2=des1;
					while (des2 > 0) {
							int remainder = des2 % 2;
							binary3 = remainder + binary3;
							des2 = des2 / 2;
							}
							
					System.out.println("Binary: " + binary3);
					
					while (des1 > 0) {
							int remainder = des1 % 8;
							octal_3 = remainder + octal_3;
							des1 = des1 / 8;
							}
							
					System.out.println("Octal: " + octal_3);
					
					System.out.print("\n\nDo you want to go to the homepage? (Y/N) -> ");
						char choice = input.next().charAt(0);
						 if (choice == 'Y'){
							 num1=-1;
							 clearConsole();
						}else{
							System.exit(0);
						}	
					}
				
					
					break;
				
				case 5:
					System.out.printf("%s%n|%s%-32s|%n%s",sp1,sp2,roman,sp1);
					System.out.println("\n\n    [01] Decimal Number to Roman Number Converter ");
					System.out.println("\n    [02] Roman Number to Decimal Number Converter ");
					
					System.out.print("\n\nEnter Option ->");
					int option1=input.nextInt();
					clearConsole();
					
					String sp3="+----------------------------------------------------------------+";
					String rtd="Decimal Number to Roman Number Converter";
					String dtr="Roman Number to Decimal Number Converter";
					switch(option1){
						case 1:
							System.out.printf("%s%n|%s%-32s%s|%n%s",sp3,sp2,rtd,sp2,sp3);
							System.out.print("\n\n\nEnter a Decimal Number : ");
							int num4=input.nextInt();
							 String ans = "";

							while (num4>0) {
								if (num4 >= 1000) {
									ans += "M";
									num4 -= 1000;
									}
	
								else if (num4 >= 900 && num4 < 1000) {
									ans += "CM";
									num4 -= 900;
									}
								else if (num4 >= 500 && num4 < 900) {
									ans += "D";
									num4 -= 500;
									}
								else if (num4 >= 400 && num4 < 500) {
									ans += "CD";
									num4 -= 400;
									}
								else if (num4 >= 100 && num4 < 400) {
									ans += "C";
									num4 -= 100;
									}
								else if (num4 >= 90 && num4 < 100) {
									ans += "XC";
									num4 -= 90;
									}
								else if (num4 >= 50 && num4 < 90) {
									ans += "L";
									num4 -= 50;
									}
								else if (num4 >= 40 && num4 < 50) {
									ans += "XL";
									num4 -= 40;
									}
								else if (num4 >= 10 && num4 < 40) {
									ans += "X";
									num4 -= 10;
									}
								else if (num4 == 9) {
									ans += "IX";
									num4 -= 9;
									}	
								else if (num4 >= 5 && num4 < 9) {
									ans += "V";
									num4 -= 5;
									}
								else if (num4 == 4) {
									ans += "IV";
									num4 -= 4;
									}
								else if (num4 < 4) {
									ans += "I";
									num4--;
									}
								}
 
								System.out.println("        Roman Numeral :" + ans);
								System.out.print("\n\nDo you want to go to the homepage? (Y/N) -> ");
								char choice1 = input.next().charAt(0);
								if (choice1 == 'Y'){
									num1=-1;
									clearConsole();
								}else{
									System.exit(0);
								}	
							break;
							
						case 2:
							System.out.printf("%s%n|%s%-32s%s|%n%s",sp3,sp2,dtr,sp2,sp3);
							System.out.print("\n\n\nEnter an Roman Number :");
							String rome=input.next();
							int len = rome.length();

							rome = rome + " ";
							int result = 0;
							for (int i = 0; i < len; i++) {
								char ch   = rome.charAt(i);
								char next_char = rome.charAt(i+1);
            
								if (ch == 'M') {
									result += 1000;
								} else if (ch == 'C') {
									if (next_char == 'M') {
										result += 900;
										i++;
								} else if (next_char == 'D') {
										result += 400;
										i++;
								} else {
										result += 100;
									}
								} else if (ch == 'D') {
									result += 500;
								} else if (ch == 'X') {
									if (next_char == 'C') {
										result += 90;
										i++;
									} else if (next_char == 'L') {
										result += 40;
										i++;
									} else {
										result += 10;
									}
								} else if (ch == 'L') {
									result += 50;
								} else if (ch == 'I') {
									if (next_char == 'X') {
										result += 9;
										i++;
									} else if (next_char == 'V') {
										result += 4;
										i++;
									} else {
										result++;
									}
								} else { // if (ch == 'V')
									result += 5;
								}
							}
							System.out.println("        Decimal Number: "+result+"\n");
							
							System.out.print("\n\nDo you want to go to the homepage? (Y/N) -> ");
							char choice3 = input.next().charAt(0);
							if (choice3 == 'Y'){
								num1=-1;
								clearConsole();
							}else{
								System.exit(0);
							}	
							
							break;
						default :
							System.out.println("invalid option ");
							input.nextInt();
							break;
							}
							
					break;
			
				default :
					System.out.println("invalid option ");
					break;
			}

		}
	}
}



