package PackageHemat;

/*
 * NIM   : 10115088
 * Nama  : Fajar Abdi Nugraha
 * Kelas : ProLan - 12
 */

public class Soal01 {

    public static <T>void isiArray(T[] A, T isi) {
        for(Object a:A) {
            a=isi;
        }
    }
   
    public static <T>void tampilArray(T[] A) {
        for(Object a:A) {
            System.out.println(a);
        }
        
    }
    
    public static <T>void hapusSeluruhArray(T[] A){
        for(Object a:A) {
            a = null;
        }
    }
    
}
