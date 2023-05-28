/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco;

/**
 *
 * @author Caetano
 */
public class contaBanco {
    //atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;
    
    
    //metodos personalizados
    
    public void estadoAtual(){
        System.out.println("------------------------------------");
        System.out.println("Conta: "+ this.getNumConta());
        System.out.println("Tipo: "+ this.getTipo());
        System.out.println("Dono: "+ this.getDono());
        System.out.println("Saldo: "+ this.getSaldo());
        System.out.println("Status: "+ this.getStatus());
    }
    
    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        
        if ("CC".equals(t)) {
            this.setSaldo(50);
        } else if ("CP".equals(t)){
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso!");
    }
    
    public void fecharConta(){
        if(this.getSaldo()>0){
            System.out.println("Não é possível fechar a conta, pois há dinheiro nela");
        } else if (this.getSaldo()<0){
            System.out.println("Não foi possível fechar a conta, pois você esta em dívida");
        } else {
            System.out.println("Conta encerrada");
            this.setStatus(false);
        }
    }
    
    public void depositar(double v){
        if(this.getStatus()==true){
           this.setSaldo(this.getSaldo()+v);
            System.out.println("Deposito realizado na conta de "+ this.getDono());
        } else{
            System.out.println("Sua conta não está aberta.");
        }
    }
    
    public void sacar(double v){
        if(this.getStatus()==true){
            if(this.getSaldo()>=v){
                this.setSaldo(this.getSaldo()-v);
                System.out.println("Saque realizado na conta de "+ this.getDono());
            } else{
                System.out.println("A conta não possui saldo suficiente");
            }
        } else{
            System.out.println("Sua conta não esta aberta.");  
        }
    }
    
    public void pagarMensalidade(){
        int v=0;
        if(this.getTipo()=="CC"){
            v = 12;
        }else if (this.getTipo()=="CP"){
            v=20;
        }
        if(this.getStatus()==true){
            this.setSaldo(this.getSaldo()-v); 
            System.out.println("Mensalidade paga.");
        } else {
            System.out.println("Sua conta não esta aberta");
        }
    }
    
    //metodos especiais

    public contaBanco() {
       this.setSaldo(0);
       this.setStatus(false); 
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    } 
}
