package perpusCleine;

import java.util.ArrayList;

public class Siswa implements User{
    private ArrayList<String> namaSiswa = new ArrayList<String>();
    private ArrayList<Integer> IDSiswa = new ArrayList<Integer>();
    private ArrayList<String> alamatSiswa = new ArrayList<String>();
    private ArrayList<Boolean> statusPinjam = new ArrayList<Boolean>();
    private ArrayList<String> teleponSiswa = new ArrayList<String>();

    public Siswa (){
        namaSiswa.add("Adit");
        IDSiswa.add(12345);
        statusPinjam.add(false);

        namaSiswa.add("Naufal");
        IDSiswa.add(54321);
        statusPinjam.add(false);
    }
    
    public void setStatusPinjam(boolean statusAdd){
        statusPinjam.add(statusAdd);
    }
    public Boolean getStatusPinjam(int getStatus){
        return statusPinjam.get(getStatus);
    }
    public void replaceStatusPinjam(int index, Boolean repStats){
        statusPinjam.set(index, repStats);
    }

    @Override
    public void setNama(String addNama) {
        namaSiswa.add(addNama);
    }
    @Override
    public void setID(int addID) {
        IDSiswa.add(addID);
    }

    @Override
    public void setAlamat(String addAlamat){
        alamatSiswa.add(addAlamat);
    }

    @Override
    public void setTelepon(String addTelepon){
        teleponSiswa.add(addTelepon);
    }

    @Override
    public String getNama(int addNama) {
        return namaSiswa.get(addNama);
    }
    @Override
    public int getID(int ID){
        return IDSiswa.get(ID);
    }
    
    @Override
    public String getAlamat(int Alamat){
        return alamatSiswa.get(Alamat);
    }
    
    @Override
    public String getTelepon(int Telepon){
        return teleponSiswa.get(Telepon);
    }
}
