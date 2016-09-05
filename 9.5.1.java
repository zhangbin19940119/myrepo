import javax.swing.*;
class Greetings{
	public static void main(String[]args){
		String fullName;
		fullName = JOptionPane.showInputDialog(null,"请问输入你的名字：");
		JOptionPane.showMessageDialog(null,"欢迎:"+fullName+"开始梦幻的java旅程!");
		System.exit(0);
	}	
}