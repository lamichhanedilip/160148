public class Echo{
	public static void main(String[] args) {
		while(true){
			System.out.println("入力してください!");
			String data=new java.util.Scanner(System.in).nextLine();
			System.out.println(data);
			if(data.equals("Aoki")){
				break;
			}
		}	
	}
}
