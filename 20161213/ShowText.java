import java.io.*
public class ShowText{
	public static void main(String[] args) {
		string filename = args[0];
		FileReader fr = null;
		BuffereReader in = null;
        System.out.println(args[0]);
        try{
        	fr = new FileReader(fileName);
        	in = BuffereReader(fr);
        	While(true){
        		String data= in.readLine();
        		if(data==null)
        	}
        }
	}
}