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
public class savingAccount extends normaluser{
    String interest_rate;
    public savingAccount(){
    
    }
    public savingAccount(int _userid, String _name,float _balance, String _accountType,String _interest_rate){
        super(_userid, _name,_balance,_accountType);
        this.interest_rate = _interest_rate;
    }
    public String getinterest(){
        return interest_rate;
    }
}