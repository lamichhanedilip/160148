public class Aloha{
	 public static void main(String[] args) {
  for(int i=0; i<30; i++){
  	if (i%4 ==0){
  		System.out.println("Aloha");
  	
  }else{
	System.out.println("アロハ");
     }
	}
	String msg = args[0];
	System.out.println(msg);


	//String msg;
	System.out.print("入力してください >");
	msg = new java.util.Scanner(System.in).nextLine();
	System.out.println(msg);
    

    String data []= new String[3];
        for(int i=0;i<3;i++){
        	System.out.print("入力してください >");
        	data[i] = new java.util.Scanner(System.in).nextLine();
        }
		for(int i=0;i<3;i++){
			 System.out.println(data[i]);
		}
       


}
}