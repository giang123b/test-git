import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        ArrayList <KhachHang> dsKH = new ArrayList<KhachHang>();
//        dsKH.add(new KhachHang(1, "Giang"));
//        dsKH.add(new KhachHang(2, "Quynh"));
//        dsKH.add(new KhachHang(3, "Nam"));
//        dsKH.add(new KhachHang(4, "Ha"));
//        dsKH.add(new KhachHang(5, "Vinh"));
//
//        boolean kq = SerializeFileFactory.luuFile(dsKH, "D:\\KH.txt");
//        if(kq){
//            System.out.println("Save done!");
//        }
//        else {
//            System.out.println("Save fail!");
//        }
        Object data = SerializeFileFactory.docFile("D:\\KH.txt");
        ArrayList <KhachHang> dsKH = (ArrayList<KhachHang>) data;
        for (KhachHang k : dsKH){
            System.out.println(k.getMa() + " " + k.getTen());
        }
    }
}
