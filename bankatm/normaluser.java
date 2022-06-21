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

public class normaluser{
    private int userid;
    private String name, accountType;
    private float balance;
    public normaluser(){
    
    }
    public normaluser(int _userid, String _name,float _balance ,String _accountType){
        this.userid = _userid;
        this.name = _name;
        this.accountType = _accountType;
        this.balance = _balance;
    }
    
    public int user_id(){
        return userid;
    }
    public String name(){
        return name;
    }
    public String accountType(){
        return accountType;
    }
    public float balance(){
        return balance;
    }
    
    public float deposite(int balance){
        return this.balance + balance;
    }
    public float withdraw(int balance){
        return this.balance - balance;
    }
}








