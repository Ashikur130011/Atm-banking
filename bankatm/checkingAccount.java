/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankatm;

/**
 *
 * @author shahe
 */
public class checkingAccount extends normaluser{
    String transfer_fee;
    public checkingAccount(){
    
    }
    public checkingAccount(int _userid, String _name,float _balance, String _accountType,String _transfer_fee){
        super(_userid, _name,_balance,_accountType);
        this.transfer_fee = _transfer_fee;
    }
    public String getinterest(){
        return transfer_fee;
    }
}
