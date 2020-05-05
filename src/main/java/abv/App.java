package abv;


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App
{
    public static void main( String[] args ) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer a = Integer.parseInt(br.readLine());
        Integer b = Integer.parseInt(br.readLine());
        System.out.print("The Output is : ");
        System.out.println(addition(a,b));
    }

    public static Integer addition(Integer a,Integer b){
        return a+b;
    }
}
