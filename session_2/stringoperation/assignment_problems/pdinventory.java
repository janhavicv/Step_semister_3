import java.util.Scanner;
class pdinventory{
    void parseInvetoryRecord(String csvLine){
        String[] fields= csvLine.split(",");
        if(fields.length==3){
            System.out.println("Product: "+fields[0]+"| SKU: "+fields[1]+"| Qty: "+fields[2]);
        }
        else{
            System.out.println("Invalid record");
        }
    }
    public static void main(String[] args) {
        pdinventory pd = new pdinventory();
        Scanner sc = new Scanner(System.in);
        String csvLine = sc.nextLine();
        pd.parseInvetoryRecord(csvLine);
    }
}