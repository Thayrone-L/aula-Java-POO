/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exaula05;

/**
 *
 * @author thayrone
 */
public final class ContaBanco {

    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public ContaBanco(int numConta, String tipo, String dono) {
        setNumConta(numConta);
        setTipo(tipo);
        setDono(dono);
        this.saldo = 0;
        this.status = false;
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

    /**
     *
     * @param tipo
     */
    public void setTipo(String tipo) {
        if (null == tipo) {

            System.out.println("Selecione um tipo válido: CC ou CP");

        } else {
            switch (tipo) {
                case "CC" -> {
                    this.tipo = tipo;
                }
                case "CP" -> {
                    this.tipo = tipo;
                }
                default ->
                    System.out.println("Selecione um tipo válido: CC ou CP");
            }
        }

    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void abrirConta(String t) {

        if (null == t) {

            System.out.println("Selecione um tipo válido: CC ou CP");

        } else {
            setTipo(t);
            setStatus(true);
            switch (t) {
                case "CC" -> {

                    setSaldo(50);
                }
                case "CP" -> {

                    setSaldo(150);
                }
                default ->
                    System.out.println("Selecione um tipo válido: CC ou CP");
            }
        }
    }

    public void fecharConta() {

        if (saldo > 0) {

            System.out.println("Você possui " + getSaldo() + " você deve sacar todo o valor antes de continuar");

        } else if (saldo < 0) {

            System.out.println("O seu saldo atual é: " + getSaldo() + " você deve depositar esse valor antes de continuar");

        } else {

            setStatus(false);

        }

    }

    public void depositar(float valor) {
        if (isStatus() == true) {

            setSaldo(getSaldo() + valor);
            System.out.println("Deposito efetuado com sucesso, o novo saldo é: " + getSaldo());
        } else {
            System.out.println("Não é possivel depositar em uma conta desativada");
        }
    }

    public void sacar(float valor) {
        if (isStatus() == true) {

            if (getSaldo() < valor) {
                System.out.println("Não foi possivel efetuar saque, seu saldo é: " + getSaldo());
            } else {

                setSaldo(getSaldo() - valor);
                System.out.println("Saque efetuado com sucesso, o novo saldo é: " + getSaldo());
            }
        } else {
            System.out.println("Não é possivel sacar de uma conta desativada");
        }
    }

    public void pagarMensal() {
        int mensal;
        if ("CC".equals(getTipo())) {
            mensal = 12;
        } else {

            mensal = 20;

        }
        if (isStatus() == true) {
            if (getSaldo() > mensal) {
                setSaldo(getSaldo() - mensal);
            } else {
                System.out.println("Não foi possivel efetuar o pagamento da mensalidade, seu saldo é: " + getSaldo());
            }
        } else {
            System.out.println("Não é possivel pagar a mensalidade de uma conta desativada, você precisa ativar a conta");
        }
    }

    public void mostraConta() {
        System.out.println("Numero: " + getNumConta());
        System.out.println("Tipo: " + getTipo());
        System.out.println("dono: " + getDono());
        System.out.println("Saldo: " + getSaldo());
        System.out.println("Status: " + isStatus());
    }

}
