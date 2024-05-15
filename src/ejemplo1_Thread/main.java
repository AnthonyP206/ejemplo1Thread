package ejemplo1_Thread;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		proceso pc1=new proceso("Processo 1");
		proceso pc2=new proceso("Processo 2");
		proceso pc3=new proceso("Processo 3");
		
		pc1.start();
		pc2.start();
		pc3.start();

	}

}
