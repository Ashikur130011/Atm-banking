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
public class creditAccount extends normaluser{
    String credit;
    public creditAccount(){
    
    }

    public creditAccount(int _userid, String _name,  String _accountType,float _balance, String _credit){
        super(_userid, _name,_balance,_accountType);
        this.credit = _credit;
    }
    
    public String getcredit(){
        return credit;
    }
}