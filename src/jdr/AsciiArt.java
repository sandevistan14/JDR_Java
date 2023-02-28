package jdr;

import entity.Hero;
import entity.Monster;

public class AsciiArt{
	
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_GREENBACKGROUND = "\u001B[42m"; 
    public static final String ANSI_WHITEBACKGROUND = "\u001B[47m";
    public static final String ANSI_REDBACKGROUND = "\u001B[41m";  
    public static final String ANSI_PURPLEBACKGROUND = "\u001B[45m";
    public static final String ANSI_YELLOWBACKGROUND = "\u001B[43m";
    public static final String ANSI_BLUEBACKGROUND = "\u001B[44m";




	public static void PrintDead(){
		System.out.print("\n");
		 System.out.print("\n");
		 System.out.print("\n");
		 System.out.print("                    .-------.\r\n"
		 		+ "                    |(~\\o/~)|\r\n"
		 		+ "                  _.||\\/X\\/||._\r\n"
		 		+ "               ,-\"  || \\ / ||  \"-,\r\n"
		 		+ "             ,'  () ||o X o|| ()  ',\r\n"
		 		+ "            / ()  ,-|| / \\ ||-,  () \\\r\n"
		 		+ "           : o  ,'  ||/\\X/\\||  ',  o ;\r\n"
		 		+ "        .----------._)~   ~(_.----------.\r\n"
		 		+ "        |\\/)~~(\\/\\   (~\\ /~)   /\\/)~~(\\/|\r\n"
		 		+ "        |(X () X) >o  >-X-<  o< (X () X)|\r\n"
		 		+ "        |/\\)__(/\\/  _(_/|\\_)_  \\/\\)__(/\\|\r\n"
		 		+ "        '----------' )     ( '----------'\r\n"
		 		+ "           ; o  ',  ||\\/~\\/||  ,'  o ;\r\n"
		 		+ "            \\ ()  '-|| \\o/ ||-'  () /\r\n"
		 		+ "             ',  () |(~\\ /~)| ()  ,'\r\n"
		 		+ "               '-._ ||\\/X\\/|| _.-'\r\n"
		 		+ "                   '|| \\ / ||'\r\n"
		 		+ "                    ||  X  ||\r\n"
		 		+ "                    ||\\(/\\/||\r\n"
		 		+ "                    ||=)O(=||\r\n"
		 		+ "                    ||/\\/)\\||\r\n"
		 		+ "                    ||  X  ||\r\n"
		 		+ "                    || / \\ ||\r\n"
		 		+ "                    ||/\\X/\\||\r\n"
		 		+ "                    |(_/o\\_)|\r\n"
		 		+ "                    '._____.'");
		 System.out.print("\n");
		 System.out.print("\n");
		 System.out.print("\n");
		 System.out.print("                    Game over");
		 System.out.print("\n");
		 System.out.print("\n");
		 System.out.print("\n");
	}
	public static void PrintMotherOfDeath(Monster monster) {
		System.out.println("\n");
		System.out.println(
				  "                                           .\"\"--..__\r\n"
				 + "                     _                     []       ``-.._\r\n"
				 + "                  .'` `'.                  ||__           `-._\r\n"
				 + "                 /    ,-.\\                 ||_ ```---..__     `-.\r\n"
				 + "                /    /:::\\\\               /|//}          ``--._  `.\r\n"
				 + "                |    |:::||              |////}                `-"+ ANSI_RED +". \\\r\n"  + ANSI_RESET 
				 + "                |    |:::||             //'///                    "+ ANSI_RED +"`.\\\r\n" + ANSI_RESET 
				 + "                |    |:::||            //  ||'                      "+ ANSI_RED +"`|\r\n" + ANSI_RESET 
				 + "                /    |:::|/        _,-//\\  ||\r\n"
				 + "               /`    |:::|`-,__,-'`  |/  \\ ||\r\n"
				 + "             /`  |   |'' ||           \\   |||\r\n"
				 + "           /`    \\   |   ||            |  /||\r\n"
				 + "         |`       |  |   |)            \\ | ||\r\n"
				 + "        |          \\ |   /      ,.__    \\| ||\r\n"
				 + "        /           `         /`    `\\   | ||\r\n"
				 + "       |                     /        \\  / ||\r\n"
				 + "       |                     |        | /  ||\r\n"
				 + "       /         /           |        `(   ||\r\n"
				 + "      /          .           /          )  ||\r\n"
				 + "     |            \\          |     ________||\r\n"
				 + "    /             |          /     `-------.|\r\n"
				 + "   |\\            /          |              ||\r\n"
				 + "   \\/`-._       |           /              ||\r\n"
				 + "    //   `.    /`           |              ||\r\n"
				 + "   //`.    `. |             \\              ||\r\n"
				 + "  ///\\ `-._  )/             |              ||\r\n"
				 + " //// )   .(/               |              ||\r\n"
				 + " ||||   ,'` )               /              //\r\n"
				 + " ||||  /                    /             || \r\n"
				 + " `\\\\` /`                    |             // \r\n"
				 + "     |`                     \\            ||  \r\n"
				 + "    /                        |           //  \r\n"
				 + "  /`                          \\         //   \r\n"
				 + "/`                            |        ||    \r\n"
				 + "`-.___,-.      .-.        ___,'        (/    \r\n"
				 + "         `---'`   `'----'`");
					System.out.println("|----------|");
					System.out.println("|HP :\t" + monster.getLife()+"|");
					System.out.println("|----------|");
					System.out.println("\n");
	}
	
	public static void PrintRedEyesDragon(Monster monster) {

		System.out.println("                                                                                                                                                                                  \r\n"
				+ "                                                                                                                                            ░░▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▓▓▓▓▓▓▓▓▓▓▒▒░░░░  \r\n"
				+ "    ░░▒▒▓▓▓▓▓▓▒▒▒▒▒▒░░                                                                                                            ░░▒▒▓▓▓▓▓▓▓▓▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██████████▓▓▒▒  \r\n"
				+ "  ▒▒██▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒                                                                                                    ▒▒▓▓▓▓▓▓▒▒▒▒▓▓▓▓▓▓▓▓▓▓██████████▓▓▓▓▓▓▓▓▒▒          \r\n"
				+ "░░░░░░▒▒██▓▓██████▓▓▓▓▓▓▓▓██▓▓                                                                                            ▒▒▓▓██▓▓▒▒▓▓▓▓▓▓▓▓▓▓████████▓▓▓▓▓▓▓▓▓▓▒▒                \r\n"
				+ "          ░░██▓▓██████▓▓▓▓▓▓▓▓▓▓▒▒                                                                                    ▓▓██▓▓▓▓▒▒▓▓▓▓▓▓▓▓██████████████▓▓▓▓▒▒                      \r\n"
				+ "              ▒▒██▓▓████▓▓▓▓██▓▓▓▓▓▓░░                                                                            ▓▓▓▓▓▓▓▓▒▒▓▓▓▓▓▓▓▓██████████████▓▓██░░                          \r\n"
				+ "                  ▒▒▓▓████▓▓▓▓▓▓▓▓▓▓▒▒▒▒                                                ▒▒                    ▒▒▓▓▓▓▓▓▓▓▒▒▓▓▓▓▓▓▓▓████████████████                                \r\n"
				+ "                    ░░██████▓▓▒▒▓▓██▓▓▓▓▒▒            ▒▒                                ▒▒                ░░▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██████████████░░                                  \r\n"
				+ "                        ██████▓▓▒▒▓▓██▓▓▓▓▓▓            ░░                              ▓▓              ▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██████▓▓▓▓▓▓░░                                      \r\n"
				+ "                          ██████▓▓▒▒▓▓▓▓▓▓▓▓▓▓          ██                              ▓▓            ▒▒▒▒▓▓▓▓▓▓▓▓▒▒▓▓▓▓▓▓▓▓▓▓████▓▓▓▓▒▒                                          \r\n"
				+ "                            ██████▓▓▒▒▓▓▓▓▓▓▓▓▓▓░░        ▒▒                            ▓▓        ░░▒▒░░▓▓▓▓▓▓▓▓▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒                                              \r\n"
				+ "                            ░░████▓▓▓▓▓▓▓▓▒▒▓▓▓▓▓▓░░      ▓▓                ░░          ▓▓      ▒▒▓▓▒▒▓▓▓▓▓▓▓▓▓▓▒▒▓▓▓▓▓▓▓▓▒▒▓▓▓▓▓▓▓▓▒▒▒▒▒▒░░                                      \r\n"
				+ "                                ████▓▓▓▓▓▓▒▒░░▓▓▓▓▓▓      ░░▓▓              ▓▓        ░░▓▓  ░░░░▒▒▓▓▒▒▓▓▓▓▓▓▒▒▒▒▒▒▓▓▓▓▓▓▓▓▒▒▓▓██▓▓▓▓▓▓▓▓▓▓▓▓▓▓██▒▒                                \r\n"
				+ "                        ▒▒▓▓▓▓████████▓▓▓▓▓▓▒▒▒▒▒▒▓▓▓▓      ▓▓              ▒▒▒▒      ▒▒▓▓  ▒▒▒▒▒▒▒▒▓▓▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒                            \r\n"
				+ "                    ▒▒▓▓▓▓▓▓▓▓▓▓▓▓████▓▓▒▒▓▓▒▒▓▓▒▒▒▒▓▓▓▓    ▓▓▓▓            ▒▒▓▓      ▓▓▓▓  ▓▓▓▓▒▒▒▒▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓░░                        \r\n"
				+ "                  ▓▓▓▓▓▓▓▓██▓▓▒▒▓▓▓▓████▓▓▓▓▒▒▒▒▒▒▒▒▒▒▓▓▓▓  ░░▓▓  ░░        ░░▓▓      ▓▓▓▓  ▒▒▒▒▓▓████▓▓▓▓▓▓▓▓▒▒▒▒░░▓▓▓▓▓▓▓▓▓▓▓▓▓▓████████████████▓▓▓▓▓▓▓▓▒▒                      \r\n"
				+ "                ██████████████████▓▓▓▓████▓▓▓▓▒▒▒▒▓▓▒▒▓▓▓▓░░  ▓▓▒▒░░        ▒▒▓▓▓▓  ▒▒▓▓▓▓▒▒▒▒████▓▓▓▓▓▓████████▓▓▒▒▓▓▓▓▓▓▓▓▓▓██████████████████████████▓▓▓▓▓▓                    \r\n"
				+ "              ▒▒▓▓██████████████████▓▓████▓▓▓▓▒▒▓▓▓▓▓▓▓▓▓▓▒▒  ▓▓██░░░░      ▓▓▓▓▓▓  ▓▓▓▓▓▓▒▒▓▓██▓▓▓▓▓▓████████▓▓▓▓▒▒▒▒▓▓▓▓▓▓▓▓████████████▓▓▓▓████▓▓▓▓██████▓▓▓▓                  \r\n"
				+ "              ▓▓██▓▓▒▒▒▒▒▒████████████████▓▓████▓▓▒▒▒▒▓▓▓▓██  ▒▒▓▓░░░░    ▓▓████▓▓░░▓▓▓▓░░▒▒██████████▓▓██████▓▓▒▒▓▓▓▓▒▒▓▓▓▓▓▓▓▓▓▓████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██▓▓▓▓                \r\n"
				+ "                                  ░░▓▓██████▓▓▓▓████▓▓▒▒▓▓▓▓▓▓░░▒▒▓▓    ▓▓░░████▓▓▓▓▒▒▒▒  ▒▒▒▒▒▒████▓▓▒▒▓▓▓▓████▓▓▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒  ░░░░▒▒▒▒▓▓██▓▓▓▓████████▓▓              \r\n"
				+ "                              ▓▓▓▓▓▓▓▓▓▓██████▓▓██▓▓████▒▒██▓▓▒▒▓▓██  ▓▓██▓▓▓▓▓▓▓▓▒▒▒▒▓▓▒▒    ██▓▓▓▓██████████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒                        ░░▒▒██▓▓▓▓▓▓            \r\n"
				+ "                            ██▓▓▓▓▓▓▓▓▓▓▓▓████▓▓▒▒▓▓████▓▓▓▓▓▓▓▓██▓▓▓▓▓▓▓▓▓▓██▒▒▓▓████▓▓▓▓    ██▒▒  ▒▒▓▓▓▓▓▓████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓                              ▓▓▓▓▒▒          \r\n"
				+ "                          ▓▓▓▓▓▓██████████▓▓▓▓██████▓▓████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██▓▓██▒▒▓▓  ▒▒██▒▒  ▒▒██▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▓▓▓▓▓▓▓▓▒▒▒▒▓▓░░                              ▓▓          \r\n"
				+ "                        ░░▓▓▓▓████████████████▓▓▓▓████▓▓██████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓████▓▓▓▓▒▒▓▓░░▓▓▒▒  ▒▒██▓▓▓▓▓▓▓▓██████▓▓▓▓▓▓▓▓▓▓▒▒▓▓▓▓▒▒▓▓                                ░░        \r\n"
				+ "                        ▓▓▓▓██████████████████████▓▓▓▓██████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██▓▓▓▓██▓▓▓▓▒▒░░▓▓▓▓▓▓▓▓▓▓██▓▓██▓▓▓▓▓▓▓▓▓▓▓▓▓▓████▓▓▓▓▓▓▓▓                                        \r\n"
				+ "                        ▓▓████████▒▒░░        ░░▓▓██████▓▓██▒▒▓▓▓▓▓▓▒▒▓▓▓▓██████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓  ▒▒▒▒░░      ▒▒▓▓██▓▓████▓▓▓▓▓▓                                      \r\n"
				+ "                      ░░▓▓▓▓▓▓▓▓                    ▒▒▓▓██▓▓▓▓▓▓▓▓▓▓██▓▓▓▓▓▓▓▓██▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██▒▒▒▒  ▒▒                ▒▒▓▓▓▓▓▓▓▓▓▓░░                                    \r\n"
				+ "                      ░░██▓▓▒▒                        ░░████▓▓▓▓▓▓██████▓▓▓▓▓▓████▓▓████▓▓▓▓▓▓██████▓▓▒▒░░▒▒▓▓                      ▒▒▓▓▓▓██▓▓                                    \r\n"
				+ "                      ░░▓▓▓▓                          ▓▓▓▓██▓▓▓▓██████████████▓▓▓▓▓▓▓▓████████▓▓▓▓▒▒▓▓▓▓▓▓▒▒                            ▓▓▓▓▓▓▓▓                                  \r\n"
				+ "                      ░░▓▓░░                          ▓▓▓▓██▓▓▓▓██▓▓██████████▓▓▒▒▓▓▓▓▓▓████▓▓██▓▓▓▓▓▓▒▒                                  ▒▒▓▓██▒▒                                \r\n"
				+ "                        ▓▓                            ██▓▓██▓▓▓▓▒▒  ████▓▓████▒▒▓▓▒▒▓▓▓▓██▓▓████▓▓▓▓▓▓▓▓    ▒▒                                ▓▓▓▓                                \r\n"
				+ "                        ▓▓                            ▓▓▓▓▓▓▓▓▓▓    ░░▓▓██▓▓▓▓▓▓▓▓▓▓▓▓██████▓▓████▓▓▓▓██    ██                                  ▒▒░░                              \r\n"
				+ "                        ░░                            ▓▓██▓▓▓▓▓▓░░    ▓▓▓▓▓▓▓▓██▓▓▓▓██▓▓▓▓██████▓▓▒▒▓▓▓▓░░░░▓▓                                    ▓▓                              \r\n"
				+ "                                              ░░      ▓▓██▓▓██▓▓▓▓    ░░██▓▓▓▓▓▓▓▓▓▓██▓▓██▓▓████▓▓▒▒▒▒▓▓▒▒▓▓▒▒                                      ░░                            \r\n"
				+ "                                              ░░░░    ▒▒██▓▓▓▓▓▓██░░▒▒  ██▓▓▓▓░░▓▓██▓▓██▓▓██▓▓▓▓▓▓▓▓▒▒▒▒████                                                                      \r\n"
				+ "                                                ▒▒▒▒    ▓▓██▓▓▓▓▒▒▓▓▓▓  ▓▓▓▓░░      ▓▓▒▒▓▓▓▓▓▓██▓▓▓▓▒▒▒▒▓▓▓▓                                                                      \r\n"
				+ "                                                  ▓▓▓▓▒▒▓▓██▓▓▓▓▓▓▓▓▓▓  ░░▒▒          ▓▓██▓▓██▓▓▓▓▓▓▒▒▓▓▓▓▓▓                                                                      \r\n"
				+ "                                                    ▓▓██▓▓▓▓▓▓▓▓▓▓▓▓▒▒              ░░▓▓▓▓████▓▓██▓▓▓▓▓▓▓▓▓▓                                                                      \r\n"
				+ "                                                        ▓▓████▒▒▓▓▓▓▒▒              ▒▒▓▓██████▓▓████▓▓▓▓▓▓▓▓                                                                      \r\n"
				+ "                                                          ████▓▓▓▓▓▓▓▓              ▓▓▓▓██████  ████▓▓▓▓▒▒▓▓░░                                                                    \r\n"
				+ "                                                          ▓▓▓▓"+ ANSI_RED +"▒▒" + ANSI_RESET +"▓▓▓▓▓▓▓▓          ▒▒▓▓██████  ▒▒  ▓▓▓▓▒▒▒▒▓▓▓▓                                                                    \r\n"
				+ "                                                          ▓▓▓▓▓▓██▓▓████▒▒        ▓▓▒▒██▓▓▓▓████░░██████▓▓██▓▓                                                                    \r\n"
				+ "                                                            ▓▓▓▓▓▓  ▒▒▓▓▓▓        ▓▓████▓▓████▓▓  ▓▓██▓▓▓▓▓▓▓▓▒▒                                                                  \r\n"
				+ "                                                            ░░▓▓██    ▒▒▓▓        ▓▓██▓▓░░████    ██▓▓██▓▓▓▓▓▓▓▓▓▓                                                                \r\n"
				+ "                                                              ▓▓▓▓      ░░        ▒▒██░░░░▓▓▓▓    ██▓▓██  ▓▓▒▒██▓▓██                                                              \r\n"
				+ "                                                              ▓▓▓▓                ░░    ▓▓██▒▒  ░░▓▓▓▓██      ██▓▓▓▓                                                              \r\n"
				+ "                                                                ▓▓                    ▒▒▓▓▓▓▒▒  ░░▓▓▓▓▒▒      ▓▓▓▓▓▓                                                              \r\n"
				+ "                                                                                  ░░██▓▓▓▓██    ██▓▓▓▓        ▒▒▓▓▓▓▒▒                                                            \r\n"
				+ "                                                                                ████▓▓▓▓██      ██▓▓▓▓        ▒▒▓▓▓▓▓▓                                                            \r\n"
				+ "                                                                              ▒▒░░▓▓▒▒██░░      ▓▓▓▓▒▒        ▒▒▓▓▓▓▓▓▓▓                                                          \r\n"
				+ "                                                                    ██          ▒▒  ▒▒        ▒▒██▓▓          ▓▓▓▓▓▓██▓▓░░                                                        \r\n"
				+ "                                                                    ▓▓              ▒▒        ██▓▓▒▒        ░░▓▓▓▓▓▓▓▓▓▓▒▒                                                        \r\n"
				+ "                                                                    ▓▓                      ░░██▓▓░░        ▒▒▓▓██▓▓▒▒▓▓▓▓                                                        \r\n"
				+ "                                                                    ▓▓                    ▒▒▓▓▓▓▓▓          ▓▓██▒▒▓▓░░▓▓▓▓                                                        \r\n"
				+ "                                                                    ▓▓░░                  ████▓▓            ▓▓░░  ▓▓    ▓▓                                                        \r\n"
				+ "                                                                    ▒▒▓▓              ░░  ████▒▒            ▓▓    ▓▓    ▒▒                                                        \r\n"
				+ "                                                                    ░░▓▓              ▒▒▓▓██▓▓              ▒▒    ▓▓                                                              \r\n"
				+ "                                                                      ▓▓▓▓░░░░░░  ▒▒▒▒██▓▓██                ░░    ░░                                                              \r\n"
				+ "                                                                      ░░▓▓▓▓▒▒▓▓▒▒▓▓▓▓██▓▓                                                                                        \r\n"
				+ "                                                                        ▒▒▓▓▓▓▓▓▓▓▓▓▓▓░░                                                                                          "
				);
		System.out.println("|----------|");
		System.out.println("|HP :\t" + monster.getLife()+"|");
		System.out.println("|----------|");
		System.out.println("\n");
	}
	public static void PrintBlueEyesDragon(Monster monster) {

		System.out.println("                                                                                                                                                                                  \r\n"
				+ "                                                                                                                                            ░░▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▓▓▓▓▓▓▓▓▓▓▒▒░░░░  \r\n"
				+ "    ░░▒▒▓▓▓▓▓▓▒▒▒▒▒▒░░                                                                                                            ░░▒▒▓▓▓▓▓▓▓▓▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██████████▓▓▒▒  \r\n"
				+ "  ▒▒██▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒                                                                                                    ▒▒▓▓▓▓▓▓▒▒▒▒▓▓▓▓▓▓▓▓▓▓██████████▓▓▓▓▓▓▓▓▒▒          \r\n"
				+ "░░░░░░▒▒██▓▓██████▓▓▓▓▓▓▓▓██▓▓                                                                                            ▒▒▓▓██▓▓▒▒▓▓▓▓▓▓▓▓▓▓████████▓▓▓▓▓▓▓▓▓▓▒▒                \r\n"
				+ "          ░░██▓▓██████▓▓▓▓▓▓▓▓▓▓▒▒                                                                                    ▓▓██▓▓▓▓▒▒▓▓▓▓▓▓▓▓██████████████▓▓▓▓▒▒                      \r\n"
				+ "              ▒▒██▓▓████▓▓▓▓██▓▓▓▓▓▓░░                                                                            ▓▓▓▓▓▓▓▓▒▒▓▓▓▓▓▓▓▓██████████████▓▓██░░                          \r\n"
				+ "                  ▒▒▓▓████▓▓▓▓▓▓▓▓▓▓▒▒▒▒                                                ▒▒                    ▒▒▓▓▓▓▓▓▓▓▒▒▓▓▓▓▓▓▓▓████████████████                                \r\n"
				+ "                    ░░██████▓▓▒▒▓▓██▓▓▓▓▒▒            ▒▒                                ▒▒                ░░▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██████████████░░                                  \r\n"
				+ "                        ██████▓▓▒▒▓▓██▓▓▓▓▓▓            ░░                              ▓▓              ▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██████▓▓▓▓▓▓░░                                      \r\n"
				+ "                          ██████▓▓▒▒▓▓▓▓▓▓▓▓▓▓          ██                              ▓▓            ▒▒▒▒▓▓▓▓▓▓▓▓▒▒▓▓▓▓▓▓▓▓▓▓████▓▓▓▓▒▒                                          \r\n"
				+ "                            ██████▓▓▒▒▓▓▓▓▓▓▓▓▓▓░░        ▒▒                            ▓▓        ░░▒▒░░▓▓▓▓▓▓▓▓▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒                                              \r\n"
				+ "                            ░░████▓▓▓▓▓▓▓▓▒▒▓▓▓▓▓▓░░      ▓▓                ░░          ▓▓      ▒▒▓▓▒▒▓▓▓▓▓▓▓▓▓▓▒▒▓▓▓▓▓▓▓▓▒▒▓▓▓▓▓▓▓▓▒▒▒▒▒▒░░                                      \r\n"
				+ "                                ████▓▓▓▓▓▓▒▒░░▓▓▓▓▓▓      ░░▓▓              ▓▓        ░░▓▓  ░░░░▒▒▓▓▒▒▓▓▓▓▓▓▒▒▒▒▒▒▓▓▓▓▓▓▓▓▒▒▓▓██▓▓▓▓▓▓▓▓▓▓▓▓▓▓██▒▒                                \r\n"
				+ "                        ▒▒▓▓▓▓████████▓▓▓▓▓▓▒▒▒▒▒▒▓▓▓▓      ▓▓              ▒▒▒▒      ▒▒▓▓  ▒▒▒▒▒▒▒▒▓▓▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒                            \r\n"
				+ "                    ▒▒▓▓▓▓▓▓▓▓▓▓▓▓████▓▓▒▒▓▓▒▒▓▓▒▒▒▒▓▓▓▓    ▓▓▓▓            ▒▒▓▓      ▓▓▓▓  ▓▓▓▓▒▒▒▒▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓░░                        \r\n"
				+ "                  ▓▓▓▓▓▓▓▓██▓▓▒▒▓▓▓▓████▓▓▓▓▒▒▒▒▒▒▒▒▒▒▓▓▓▓  ░░▓▓  ░░        ░░▓▓      ▓▓▓▓  ▒▒▒▒▓▓████▓▓▓▓▓▓▓▓▒▒▒▒░░▓▓▓▓▓▓▓▓▓▓▓▓▓▓████████████████▓▓▓▓▓▓▓▓▒▒                      \r\n"
				+ "                ██████████████████▓▓▓▓████▓▓▓▓▒▒▒▒▓▓▒▒▓▓▓▓░░  ▓▓▒▒░░        ▒▒▓▓▓▓  ▒▒▓▓▓▓▒▒▒▒████▓▓▓▓▓▓████████▓▓▒▒▓▓▓▓▓▓▓▓▓▓██████████████████████████▓▓▓▓▓▓                    \r\n"
				+ "              ▒▒▓▓██████████████████▓▓████▓▓▓▓▒▒▓▓▓▓▓▓▓▓▓▓▒▒  ▓▓██░░░░      ▓▓▓▓▓▓  ▓▓▓▓▓▓▒▒▓▓██▓▓▓▓▓▓████████▓▓▓▓▒▒▒▒▓▓▓▓▓▓▓▓████████████▓▓▓▓████▓▓▓▓██████▓▓▓▓                  \r\n"
				+ "              ▓▓██▓▓▒▒▒▒▒▒████████████████▓▓████▓▓▒▒▒▒▓▓▓▓██  ▒▒▓▓░░░░    ▓▓████▓▓░░▓▓▓▓░░▒▒██████████▓▓██████▓▓▒▒▓▓▓▓▒▒▓▓▓▓▓▓▓▓▓▓████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██▓▓▓▓                \r\n"
				+ "                                  ░░▓▓██████▓▓▓▓████▓▓▒▒▓▓▓▓▓▓░░▒▒▓▓    ▓▓░░████▓▓▓▓▒▒▒▒  ▒▒▒▒▒▒████▓▓▒▒▓▓▓▓████▓▓▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒  ░░░░▒▒▒▒▓▓██▓▓▓▓████████▓▓              \r\n"
				+ "                              ▓▓▓▓▓▓▓▓▓▓██████▓▓██▓▓████▒▒██▓▓▒▒▓▓██  ▓▓██▓▓▓▓▓▓▓▓▒▒▒▒▓▓▒▒    ██▓▓▓▓██████████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒                        ░░▒▒██▓▓▓▓▓▓            \r\n"
				+ "                            ██▓▓▓▓▓▓▓▓▓▓▓▓████▓▓▒▒▓▓████▓▓▓▓▓▓▓▓██▓▓▓▓▓▓▓▓▓▓██▒▒▓▓████▓▓▓▓    ██▒▒  ▒▒▓▓▓▓▓▓████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓                              ▓▓▓▓▒▒          \r\n"
				+ "                          ▓▓▓▓▓▓██████████▓▓▓▓██████▓▓████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██▓▓██▒▒▓▓  ▒▒██▒▒  ▒▒██▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▓▓▓▓▓▓▓▓▒▒▒▒▓▓░░                              ▓▓          \r\n"
				+ "                        ░░▓▓▓▓████████████████▓▓▓▓████▓▓██████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓████▓▓▓▓▒▒▓▓░░▓▓▒▒  ▒▒██▓▓▓▓▓▓▓▓██████▓▓▓▓▓▓▓▓▓▓▒▒▓▓▓▓▒▒▓▓                                ░░        \r\n"
				+ "                        ▓▓▓▓██████████████████████▓▓▓▓██████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██▓▓▓▓██▓▓▓▓▒▒░░▓▓▓▓▓▓▓▓▓▓██▓▓██▓▓▓▓▓▓▓▓▓▓▓▓▓▓████▓▓▓▓▓▓▓▓                                        \r\n"
				+ "                        ▓▓████████▒▒░░        ░░▓▓██████▓▓██▒▒▓▓▓▓▓▓▒▒▓▓▓▓██████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓  ▒▒▒▒░░      ▒▒▓▓██▓▓████▓▓▓▓▓▓                                      \r\n"
				+ "                      ░░▓▓▓▓▓▓▓▓                    ▒▒▓▓██▓▓▓▓▓▓▓▓▓▓██▓▓▓▓▓▓▓▓██▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██▒▒▒▒  ▒▒                ▒▒▓▓▓▓▓▓▓▓▓▓░░                                    \r\n"
				+ "                      ░░██▓▓▒▒                        ░░████▓▓▓▓▓▓██████▓▓▓▓▓▓████▓▓████▓▓▓▓▓▓██████▓▓▒▒░░▒▒▓▓                      ▒▒▓▓▓▓██▓▓                                    \r\n"
				+ "                      ░░▓▓▓▓                          ▓▓▓▓██▓▓▓▓██████████████▓▓▓▓▓▓▓▓████████▓▓▓▓▒▒▓▓▓▓▓▓▒▒                            ▓▓▓▓▓▓▓▓                                  \r\n"
				+ "                      ░░▓▓░░                          ▓▓▓▓██▓▓▓▓██▓▓██████████▓▓▒▒▓▓▓▓▓▓████▓▓██▓▓▓▓▓▓▒▒                                  ▒▒▓▓██▒▒                                \r\n"
				+ "                        ▓▓                            ██▓▓██▓▓▓▓▒▒  ████▓▓████▒▒▓▓▒▒▓▓▓▓██▓▓████▓▓▓▓▓▓▓▓    ▒▒                                ▓▓▓▓                                \r\n"
				+ "                        ▓▓                            ▓▓▓▓▓▓▓▓▓▓    ░░▓▓██▓▓▓▓▓▓▓▓▓▓▓▓██████▓▓████▓▓▓▓██    ██                                  ▒▒░░                              \r\n"
				+ "                        ░░                            ▓▓██▓▓▓▓▓▓░░    ▓▓▓▓▓▓▓▓██▓▓▓▓██▓▓▓▓██████▓▓▒▒▓▓▓▓░░░░▓▓                                    ▓▓                              \r\n"
				+ "                                              ░░      ▓▓██▓▓██▓▓▓▓    ░░██▓▓▓▓▓▓▓▓▓▓██▓▓██▓▓████▓▓▒▒▒▒▓▓▒▒▓▓▒▒                                      ░░                            \r\n"
				+ "                                              ░░░░    ▒▒██▓▓▓▓▓▓██░░▒▒  ██▓▓▓▓░░▓▓██▓▓██▓▓██▓▓▓▓▓▓▓▓▒▒▒▒████                                                                      \r\n"
				+ "                                                ▒▒▒▒    ▓▓██▓▓▓▓▒▒▓▓▓▓  ▓▓▓▓░░      ▓▓▒▒▓▓▓▓▓▓██▓▓▓▓▒▒▒▒▓▓▓▓                                                                      \r\n"
				+ "                                                  ▓▓▓▓▒▒▓▓██▓▓▓▓▓▓▓▓▓▓  ░░▒▒          ▓▓██▓▓██▓▓▓▓▓▓▒▒▓▓▓▓▓▓                                                                      \r\n"
				+ "                                                    ▓▓██▓▓▓▓▓▓▓▓▓▓▓▓▒▒              ░░▓▓▓▓████▓▓██▓▓▓▓▓▓▓▓▓▓                                                                      \r\n"
				+ "                                                        ▓▓████▒▒▓▓▓▓▒▒              ▒▒▓▓██████▓▓████▓▓▓▓▓▓▓▓                                                                      \r\n"
				+ "                                                          ████▓▓▓▓▓▓▓▓              ▓▓▓▓██████  ████▓▓▓▓▒▒▓▓░░                                                                    \r\n"
				+ "                                                          ▓▓▓▓"+ ANSI_BLUE +"▒▒" + ANSI_RESET +"▓▓▓▓▓▓▓▓          ▒▒▓▓██████  ▒▒  ▓▓▓▓▒▒▒▒▓▓▓▓                                                                    \r\n"
				+ "                                                          ▓▓▓▓▓▓██▓▓████▒▒        ▓▓▒▒██▓▓▓▓████░░██████▓▓██▓▓                                                                    \r\n"
				+ "                                                            ▓▓▓▓▓▓  ▒▒▓▓▓▓        ▓▓████▓▓████▓▓  ▓▓██▓▓▓▓▓▓▓▓▒▒                                                                  \r\n"
				+ "                                                            ░░▓▓██    ▒▒▓▓        ▓▓██▓▓░░████    ██▓▓██▓▓▓▓▓▓▓▓▓▓                                                                \r\n"
				+ "                                                              ▓▓▓▓      ░░        ▒▒██░░░░▓▓▓▓    ██▓▓██  ▓▓▒▒██▓▓██                                                              \r\n"
				+ "                                                              ▓▓▓▓                ░░    ▓▓██▒▒  ░░▓▓▓▓██      ██▓▓▓▓                                                              \r\n"
				+ "                                                                ▓▓                    ▒▒▓▓▓▓▒▒  ░░▓▓▓▓▒▒      ▓▓▓▓▓▓                                                              \r\n"
				+ "                                                                                  ░░██▓▓▓▓██    ██▓▓▓▓        ▒▒▓▓▓▓▒▒                                                            \r\n"
				+ "                                                                                ████▓▓▓▓██      ██▓▓▓▓        ▒▒▓▓▓▓▓▓                                                            \r\n"
				+ "                                                                              ▒▒░░▓▓▒▒██░░      ▓▓▓▓▒▒        ▒▒▓▓▓▓▓▓▓▓                                                          \r\n"
				+ "                                                                    ██          ▒▒  ▒▒        ▒▒██▓▓          ▓▓▓▓▓▓██▓▓░░                                                        \r\n"
				+ "                                                                    ▓▓              ▒▒        ██▓▓▒▒        ░░▓▓▓▓▓▓▓▓▓▓▒▒                                                        \r\n"
				+ "                                                                    ▓▓                      ░░██▓▓░░        ▒▒▓▓██▓▓▒▒▓▓▓▓                                                        \r\n"
				+ "                                                                    ▓▓                    ▒▒▓▓▓▓▓▓          ▓▓██▒▒▓▓░░▓▓▓▓                                                        \r\n"
				+ "                                                                    ▓▓░░                  ████▓▓            ▓▓░░  ▓▓    ▓▓                                                        \r\n"
				+ "                                                                    ▒▒▓▓              ░░  ████▒▒            ▓▓    ▓▓    ▒▒                                                        \r\n"
				+ "                                                                    ░░▓▓              ▒▒▓▓██▓▓              ▒▒    ▓▓                                                              \r\n"
				+ "                                                                      ▓▓▓▓░░░░░░  ▒▒▒▒██▓▓██                ░░    ░░                                                              \r\n"
				+ "                                                                      ░░▓▓▓▓▒▒▓▓▒▒▓▓▓▓██▓▓                                                                                        \r\n"
				+ "                                                                        ▒▒▓▓▓▓▓▓▓▓▓▓▓▓░░                                                                                          "
				);
		System.out.println("|----------|");
		System.out.println("|HP :\t" + monster.getLife()+"|");
		System.out.println("|----------|");
		System.out.println("\n");
	}
	
	public static void PrintMiddleFinger(Monster monster) {
		System.out.println("\n");
		 System.out.println("Oh no ! the slime provoke you !");
		 System.out.println("\n");
		 System.out.println("                      /´¯/)        |----------|");
		 System.out.println("                    ,/¯  /         |HP :    "+ monster.getLife()+ "|");
		 System.out.println("                   /    /          |----------|");
		 System.out.println("             /´¯/'   '/´¯¯`·¸      ");
		 System.out.println("          /'/   /    /       /¨¯\\ ");
		 System.out.println("        ('(   ´   ´     ¯~/'   ')  "); 
		 System.out.println("         \\                 '     /"); 
		 System.out.println("          ''   \\           _ ·´   "); 
		 System.out.println("            \\              (      "); 
		 System.out.println("              \\             \\    "); 
	}
	
	public static void PrintSlime(Monster monster) {
		 System.out.print("\n");
		 System.out.println("              ░░░░░░░░░░               |----------|");
		 System.out.println("          ░░░░        ░░░░░░           |HP :\t" + monster.getLife()+"|");
		 System.out.println("        ░░                  ░░         |----------|");
		 System.out.println("      ░░                    ░░░░    ");
		 System.out.println("    ░░                      ░░░░░░  ");
		 System.out.println("    ░░                        ░░░░  ");
		 System.out.println("  ░░                ░░    ░░  ░░░░░░");
		 System.out.println("  ░░                ██░░  ██    ░░░░");
		 System.out.println("  ░░                ██░░  ██    ░░░░");
		 System.out.println("  ░░            ░░            ░░░░░░");
		 System.out.println("  ░░░░░░                      ░░░░░░");
		 System.out.println("    ░░░░░░                  ░░░░░░  ");
		 System.out.println("    ░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░  ");
		 System.out.println("       ░░░░░░░░░░░░░░░░░░░░░░      ");
		 System.out.print("\n");
		 System.out.print("\n");
	}
	
	public static void PrintAction(Hero Hero1, boolean Flee) {
		if(Flee == true) {
		 System.out.print("What do you want to do ?");
		 System.out.print("\n");
		 System.out.print("|--------------------------------------------|");
		 System.out.print("\n");
		 System.out.print("|     Attack    |     Inv     |     Flee     |");
		 System.out.print("\n");
		 System.out.print("|--------------------------------------------|");
		 System.out.print("\n");
		 System.out.print("Hero HP : " + Hero1.getLife());
		 System.out.print("\n");}
		else{
			 System.out.print("What do you want to do ?");
			 System.out.print("\n");
			 System.out.print("|-----------------------------|");
			 System.out.print("\n");
			 System.out.print("|     Attack    |     Inv     |");
			 System.out.print("\n");
			 System.out.print("|-----------------------------|");
			 System.out.print("\n");
			 System.out.print("Hero HP : " + Hero1.getLife());
			 System.out.print("\n");}
	}
	
	public static void PrintWolf(Monster monster) {
		System.out.println("        _\r\n"
		+ "       / \\      _-'\r\n"
		+ "     _/|  \\-''- _ /\r\n"
		+ "__-' { |          \\\r\n"
		+ "    /             \\\r\n"
		+ "    /       \"o.  |o}\r\n"
		+ "    |            \\ ;\r\n"
		+ "                  ',\r\n"
		+ "       \\_         __\\\r\n"
		+ "         ''-_    \\.//\r\n"
		+ "           / '-____'\r\n"
		+ "          /\r\n"
		+ "        _'\r\n"
		+ "      _-'");
		System.out.println("|----------|");
		System.out.println("|HP :\t" + monster.getLife()+" |");
		System.out.println("|----------|");
		System.out.println("\n");
	}
	
	
}