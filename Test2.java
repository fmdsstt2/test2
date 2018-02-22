import java.io.*;

class Test2
{
  public static void main (String[] args) throws IOException
  {
     int sum = 0;
     int ans = 0;
     
     BufferedReader br =
       new BufferedReader (new InputStreamReader(System.in));
       
    String str = br.readLine();
    int num =Integer.parseInt(str);
     
     for(int i=1; ans<99;i++){
       ans = num * i;
       sum += ans;
       System.out.println(ans);
     }
     
     System.out.println(sum);
     
  }
}

   