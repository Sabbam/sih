import java.io.*;

class B { 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter Book Name");
        String name = br.readLine();

        System.out.println("Enter Book Price");
        float price=Float.parseFloat(br.readLine());

        System.out.println("Enter Book pages");
        int pages=Integer.parseInt(br.readLine());

        System.out.println("The Book Name : " +name);
        System.out.println("The Book price : " +price);
        System.out.println("The Book Pages : " +pages);   
            }
}
