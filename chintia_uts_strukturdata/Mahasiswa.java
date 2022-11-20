/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chintia_uts_strukturdata;

/**
 *
 * @author Asus
 */
class Mahasiswa {
   
        int id;
        String name;
        String kelas;
        int tglmasuk;
        
        public Mahasiswa (int id,String name,String kelas,int tglmasuk){
            this.id=id;
            this.name=name;
            this.kelas=kelas;
            this.tglmasuk=tglmasuk;
        }

        public int getId(){
            return id;
        }
        public void setId(int id){
            this.id=id;
        }
        public String getName(){
            return name;
        }
         public void setName(String name){
            this.name=name;
        }
          public String getKelas(){
            return kelas;
        }
         public void setKelas(String kelas){
            this.kelas=kelas;
        }
           public int gettglmasuk(){
            return tglmasuk;
        }
         public void setTglmasuk(int tglmasuk){
            this.tglmasuk=tglmasuk;
        }
         public String toString(){
             return "mahasiswa{" + "id=" + id + ", name=" + name + ", kelas=" + kelas + ", tglMasuk=" + tglmasuk + '}';
         }}

