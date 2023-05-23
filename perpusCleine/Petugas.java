package perpusCleine;

import java.util.ArrayList;
public class Petugas implements User{
    private ArrayList<String> namaPetugas = new ArrayList<String>();
    private ArrayList<Integer> IDPetugas = new ArrayList<Integer>();
    private ArrayList<String> alamatPetugas = new ArrayList<String>();
    private ArrayList<String> teleponPetugas = new ArrayList<String>();

    public Petugas(){
        namaPetugas.add("Juan");
        IDPetugas.add(31313);
        alamatPetugas.add("Pakis");

        namaPetugas.add("Bima");
        IDPetugas.add(76845);
        alamatPetugas.add("Pakis");
        
    }
    

    @Override
    public void setNama(String addNama) {
        namaPetugas.add(addNama);
    }
    @Override
    public void setID(int addID) {
        IDPetugas.add(addID);
    }

    @Override
    public void setAlamat(String addAlamat){
        alamatPetugas.add(addAlamat);
    }

    @Override
    public void setTelepon(String addTelepon){
        teleponPetugas.add(addTelepon);
    }
    @Override
    public String getNama(int addNama) {
        return namaPetugas.get(addNama);
    }
    @Override
    public int getID(int ID){
        return IDPetugas.get(ID);
    }
    
    @Override
    public String getAlamat(int Alamat){
        return alamatPetugas.get(Alamat);
    }

    @Override
    public String getTelepon(int Telepon){
        return teleponPetugas.get(Telepon);
    }

    public int getSize(){
        return namaPetugas.size();
    }

    
}
