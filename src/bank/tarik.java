/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.JOptionPane;


/**
 *
 * @author ACER E5-471
 */
public class tarik {

private int saldo;
public void ambil (int tab, int t){
if(t%100!=0)JOptionPane.showMessageDialog(null,"Mesin ATM BRI tidak menerima uang koin \n Silahkan lakukan penyetoran","Transaksi Gagal",0);
else {
if (t>tab)JOptionPane.showMessageDialog(null,"Saldo ANda Tidak Mencukupi \n Silahkan lakukan penyetoran","Transaksi Gagal",0);
else if (t<50000)JOptionPane.showMessageDialog(null,"Besaran minimal pengambilan tunai adalah Rp 50000","Transaksi Gagal",0);
else{saldo = tab-t;JOptionPane.showMessageDialog(null,"Saldo Anda Saat Ini Sebesar :"+saldo);
    if (tab<=50000)JOptionPane.showMessageDialog(null,"Saldo minimal harus Rp 50000,00, Segera lakukan penyetoran untuk menghindari penutupan akun.","CAUTION",2);
}

}
}
public int getsaldo(){

return saldo;}
}

