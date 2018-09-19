package tugaspapan;

/**
 *
 * @author Kiki Aulia
 */
public class UjiCobaTugasPapan {

    public static void main(String[] args) {
        TugasPapan bio = new TugasPapan();
        bio.setNamaAyah("Karya Hindartono");
        bio.setNamaIbu("Siti Nurul Mustabsyiroh");
        bio.setNamaSaudara1("Agus Faiz Gilang Romadhon");
        bio.setNamaSaudara2("Aulia Desindra Ramdhanti");
        bio.setNamaMu("Aulia Rizky Agustine");
        bio.setAlamat("Ds. Gumining Rejo No. 10, Tikung. Lamongan");
        bio.setTempatLahir("Lamongan");
        bio.setHobi("Dance, Menyanyi");
        bio.setCitaCita("Guru");
        bio.setNoTelepon("082120420431");
        bio.setTanggalLahir(07);

        System.out.println("Nama Ayah: " + bio.getNamaAyah());
        System.out.println("Nama Ibu: " + bio.getNamaIbu());
        System.out.println("Nama Saudara pertama: " + bio.getNamaSaudara1());
        System.out.println("Nama Saudara kedua: " + bio.getNamaSaudara2());
        System.out.println("Nama Ku: " + bio.getNamaMu());
        System.out.println("Alamat: " + bio.getAlamat());
        System.out.println("Tempat Lahir: " + bio.getTempatLahir());
        System.out.println("Hobi: " + bio.getHobi());
        System.out.println("Cita Cita: " + bio.getCitaCita());
        System.out.println("No. Telepon: " + bio.getNoTelepon());
        System.out.println("Tanggal Lahir: " + bio.getTanggalLahir());

    }
}
