package jdr;

import java.util.ArrayList;

import entity.Hero;
import entity.Monster;

public class Map{
	public static char[][] MapEntity(char[][] mapentity){

		char[][] mapent = {
				 {'/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/',},
				 {'/',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','/',},
				 {'/',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','/',},
				 {'/',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','/',},
				 {'/',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','/',},
				 {'/',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','/',},
				 {'/',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','/',},
				 {'/',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','/',},
				 {'/',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','/',},
				 {'/',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','/',},
				 {'/',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','/',},
				 {'/',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','/',},
				 {'/',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','/',},
				 {'/',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','/',},
				 {'/',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','/',},
				 {'/',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','/',},
				 {'/',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','/',},
				 {'/',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','/',},
				 {'/',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','/',},
				 {'/',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','/',},
				 {'/',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','/',},
				 {'/',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','/',},
				 {'/',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','/',},
				 {'/',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','/',},
				 {'/',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','/',},
				 {'/',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','/',},
				 {'/',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','/',},
				 {'/',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','/',},
				 {'/',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','P',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','/',},
				 {'/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/',},
		 };
		mapentity = mapent;
		return mapentity;
	}
	
	
	
	
	
	
	
	public static char[][] Map(char[][] map){
		 char[][] map1 = {
				 {'/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/',},
				 {'/','.','.','G','X','F','F','F','.','C','X','X','X','X','.','X','.','.','C','.','.','.','X','X','C','X','.','.','G','/',},
				 {'/','.','.','.','X','F','F','X','X','X','X','X','X','X','.','X','.','X','X','X','X','.','.','.','.','X','.','.','.','/',},
				 {'/','.','.','.','X','F','F','X','.','.','.','C','X','X','.','X','.','.','.','.','X','.','X','X','.','.','.','.','.','/',},
				 {'/','.','.','.','X','F','F','X','.','X','.','X','X','X','.','X','X','X','.','.','.','.','X','X','.','X','.','.','.','/',},
				 {'/','F','X','X','X','F','F','X','.','X','.','X','C','.','.','.','.','X','.','.','X','.','C','X','.','X','X','X','.','/',},
				 {'/','F','X','C','.','.','F','X','.','X','.','X','X','.','.','.','.','X','C','X','X','.','X','X','.','X','.','.','.','/',},
				 {'/','F','F','F','.','.','.','X','.','X','.','X','X','.','X','X','.','X','X','X','.','.','.','X','.','X','.','.','.','/',},
				 {'/','F','F','F','F','.','.','X','.','X','.','.','.','.','X','X','.','.','.','.','.','S','.','.','.','X','.','X','X','/',},
				 {'/','F','F','F','.','.','.','X','.','X','X','X','X','X','X','X','X','X','X','X','.','.','.','X','.','X','.','.','.','/',},
				 {'/','F','.','.','.','.','.','F','F','X','.','.','.','.','C','X','.','.','C','X','X','.','X','X','.','X','.','.','.','/',},
				 {'/','F','.','X','X','X','.','F','F','X','.','.','.','.','.','X','.','.','.','.','.','.','.','.','.','X','.','.','X','/',},
				 {'/','.','.','X','.','X','.','.','F','X','C','.','.','.','.','.','.','.','.','X','.','X','.','X','.','X','.','.','X','/',},
				 {'/','.','.','X','.','F','F','.','.','X','G','.','.','.','.','X','X','X','.','X','C','X','.','X','.','X','X','.','X','/',},
				 {'/','.','.','X','.','X','F','F','.','X','C','.','.','.','.','X','.','X','.','X','.','X','.','X','.','.','.','.','.','/',},
				 {'/','.','.','X','X','X','F','F','F','X','.','.','.','.','.','X','.','X','.','X','.','X','.','X','.','.','.','.','.','/',},
				 {'/','.','.','.','.','.','F','F','F','X','.','.','.','.','.','X','.','X','.','X','.','X','.','X','X','X','X','X','.','/',},
				 {'/','X','X','.','.','.','.','F','F','X','X','X','X','X','.','X','.','X','.','X','.','.','.','.','.','X','.','.','.','/',},
				 {'/','C','.','.','.','.','F','F','F','F','F','F','G','X','.','X','.','X','.','X','.','.','.','.','.','.','.','.','C','/',},
				 {'/','X','X','.','.','F','F','F','F','F','F','X','X','X','.','X','X','X','.','X','X','X','X','X','.','X','.','.','.','/',},
				 {'/','.','.','.','F','F','F','F','X','X','X','X','C','.','.','.','C','.','.','.','.','C','X','C','.','X','.','.','.','/',},
				 {'/','.','.','.','F','F','F','F','.','.','.','.','.','.','.','.','.','X','X','X','X','X','X','X','.','X','X','X','X','/',},
				 {'/','F','F','F','F','F','F','F','X','X','X','X','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','/',},
				 {'/','F','F','F','F','F','F','F','F','F','F','X','X','X','.','X','X','X','.','X','X','.','X','.','.','X','.','.','.','/',},
				 {'/','F','F','F','F','F','X','.','X','F','F','F','F','X','.','X','C','X','.','X','X','.','X','.','.','X','.','.','.','/',},
				 {'/','X','.','X','X','F','X','.','X','F','F','F','F','X','.','X','.','X','.','X','X','.','X','.','.','X','.','G','.','/',},
				 {'/','.','.','.','X','F','X','C','X','F','F','F','F','X','.','X','.','X','.','X','X','.','X','.','.','X','.','.','.','/',},
				 {'/','.','.','.','X','F','X','X','X','F','F','F','F','X','.','X','.','.','.','.','.','.','X','.','.','X','.','.','.','/',},
				 {'/','C','G','C','X','F','F','F','F','F','F','F','F','X','.','X','.','.','.','X','X','X','X','.','.','.','.','.','.','/',},
				 {'/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/',},
		 };
		map = map1;
		return map;
	}
	
	
	
	public static char[][] MapMonster(char[][] mapmonster){
		 
		 char[][] mapmonster1 = {
				 {'/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/',},
				 {'/',' ',' ',' ',' ',' ',' ',' ','W',' ',' ',' ',' ',' ','E',' ',' ','W',' ','W',' ',' ',' ',' ',' ',' ',' ',' ',' ','/',},
				 {'/',' ','M',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','B',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','D',' ','/',},
				 {'/',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','/',},
				 {'/',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','W',' ',' ',' ',' ',' ',' ',' ','S',' ',' ',' ',' ',' ',' ',' ','/',},
				 {'/',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','/',},
				 {'/',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','S',' ',' ','/',},
				 {'/',' ',' ',' ',' ',' ','S',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','/',},
				 {'/',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','S',' ',' ',' ',' ',' ',' ',' ','/',},
				 {'/',' ',' ',' ',' ',' ','S',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','/',},
				 {'/',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','/',},
				 {'/',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','S',' ',' ','D',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','/',},
				 {'/',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','W',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','/',},
				 {'/',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','D',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','W',' ',' ','S',' ','/',},
				 {'/','S',' ',' ',' ',' ',' ',' ',' ',' ',' ','W',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','/',},
				 {'/',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','/',},
				 {'/',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','S',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','/',},
				 {'/',' ',' ',' ',' ','S',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','/',},
				 {'/',' ',' ','W',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','W',' ','/',},
				 {'/',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','S',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','/',},
				 {'/',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','S','S',' ',' ',' ',' ',' ',' ',' ',' ','/',},
				 {'/',' ',' ',' ',' ',' ',' ',' ',' ',' ','S',' ',' ',' ','S',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','/',},
				 {'/',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','/',},
				 {'/',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','S',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','/',},
				 {'/',' ',' ',' ',' ',' ',' ','S',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','S',' ','/',},
				 {'/',' ',' ',' ',' ',' ',' ','D',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','S','S',' ','W',' ','W','/',},
				 {'/',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','S',' ','S',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','S',' ','/',},
				 {'/',' ','D',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','/',},
				 {'/',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','/',},
				 {'/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/','/',},
		 };
		 mapmonster = mapmonster1;
		 return mapmonster;
		 
	}
	public static void PrintMap(char[][] map,char[][] mapentity, char[][]mapmonster) {
		 for(int i = 0;i < map.length; i += 1) {
			 for(int k = 0;k < map[i].length; k += 1) {
//				 if(mapentity[i][k] == 'P' && map[i][k] == 'F') {
//					 System.out.print(AsciiArt.ANSI_GREENBACKGROUND + mapentity[i][k] + AsciiArt.ANSI_RESET);
//				 }
				 if (mapentity[i][k] != ' ' && mapentity[i][k] != '/') {
					 System.out.print(AsciiArt.ANSI_YELLOWBACKGROUND + mapentity[i][k] + AsciiArt.ANSI_RESET);
				 }
				 else if(mapmonster[i][k] != ' ' && mapmonster[i][k] != '/' ) {
					 System.out.print( AsciiArt.ANSI_RED  + mapmonster[i][k] + AsciiArt.ANSI_RESET);
				 }
				 else {
					 if(map[i][k] == 'C') {
						 System.out.print(AsciiArt.ANSI_YELLOW + map[i][k] + AsciiArt.ANSI_RESET);
					 }
					 else if(map[i][k] == 'G') {
						 System.out.print(AsciiArt.ANSI_BLUE  + map[i][k] + AsciiArt.ANSI_RESET);
					 }
					 else if (mapentity[i][k] == '/') {
							 System.out.print(map[i][k] + AsciiArt.ANSI_RESET);
					 }
					 else if(map[i][k] == 'F') {
						 System.out.print(AsciiArt.ANSI_GREEN  + map[i][k] + AsciiArt.ANSI_RESET);
					 }
					 else if(map[i][k] == 'X'){
						 System.out.print(map[i][k]);
					 }
					 else{
						 System.out.print(map[i][k]);
					 }
				 }
			 }
			 System.out.print("\n");
		 }
	}
	public static boolean CheckAround(Hero Hero1,char[][] mapmonster) {
			 if((mapmonster[Hero1.getPosY()+1][Hero1.getPosX()-1] != ' ') && (mapmonster[Hero1.getPosY()+1][Hero1.getPosX()-1] != '/') ||
				 (mapmonster[Hero1.getPosY()-1][Hero1.getPosX()-1] != ' ') && (mapmonster[Hero1.getPosY()-1][Hero1.getPosX()-1] != '/') ||
				 (mapmonster[Hero1.getPosY()][Hero1.getPosX()] != ' ') && (mapmonster[Hero1.getPosY()][Hero1.getPosX()] != '/') ||
				 (mapmonster[Hero1.getPosY()+1][Hero1.getPosX()-2] != ' ') && (mapmonster[Hero1.getPosY()+1][Hero1.getPosX()-2] != '/') ||
				 (mapmonster[Hero1.getPosY()+1][Hero1.getPosX()-2] != ' ') && (mapmonster[Hero1.getPosY()+1][Hero1.getPosX()-2] != '/') ||
				 (mapmonster[Hero1.getPosY()-1][Hero1.getPosX()-2] != ' ') && (mapmonster[Hero1.getPosY()-1][Hero1.getPosX()-1] != '/') ||
				 (mapmonster[Hero1.getPosY()+1][Hero1.getPosX()] != ' ') && (mapmonster[Hero1.getPosY()+1][Hero1.getPosX()] != '/') ||
				 (mapmonster[Hero1.getPosY()-1][Hero1.getPosX()] != ' ') && (mapmonster[Hero1.getPosY()-1][Hero1.getPosX()] != '/')) {
				 		return false;
			 }
		return true;
	}
	
	public static ArrayList<Monster> CreateMonster(char[][] mapmonster) {
		ArrayList<Monster> Monstre = new ArrayList<Monster>();
		 for(int y = 0;y < mapmonster.length; y += 1) {
			 for(int x = 0;x < mapmonster[y].length; x += 1) {
				 if(mapmonster[y][x] == 'S') {
					 Monstre.add(new Monster('S', "Slime", y, x, 10, 40, 0,10,0));
				 }
				 else if (mapmonster[y][x] == 'W') {
					 Monstre.add(new Monster('W', "Wolf", y, x, 20, 80, 10,20,40));
				 }
				 else if (mapmonster[y][x] == 'D') {
					 Monstre.add(new Monster('D', "Dragon1", y, x, 40, 200, 50,100,0));
				 }
				 else if(mapmonster[y][x] == 'M') {
					 Monstre.add(new Monster('M', "Mother of dead", y, x, 100, 1000, 200,999999,0));
				 }
			 }
		}
		return Monstre;
	}
}




		 
		 
		 
		 
		 