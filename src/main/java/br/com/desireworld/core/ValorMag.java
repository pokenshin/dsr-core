package br.com.desireworld.core;

public class ValorMag {
    private int valor;
    private int mag;

    public ValorMag(int valor, int mag) {
        this.valor = valor;
        this.mag = mag;
    }

    public ValorMag(){
        this.valor = 0;
        this.mag = 0;
    }

    public ValorMag(String texto) {
        if (texto != null && texto != ""){
            this.valor = Integer.parseInt(texto.split(",")[0]);
            this.mag = Integer.parseInt(texto.split(",")[1]);
        } else{
            this.valor = 0;
            this.mag = 0;
        }
    }

    public ValorMag(int inteiro) {
        int  magnitude;
        int valor;
        String numeroString = String.valueOf(inteiro);

        magnitude = numeroString.length();
        if (magnitude > 1){
            valor = Integer.parseInt(numeroString.substring(0, 2));
        }else{
            valor = Integer.parseInt(numeroString + "0");
        }
        this.valor = valor;
        this.mag = magnitude;
    }

    public ValorMag(double numero){
        int  magnitude;
        int valor;
        String numeroString = String.valueOf(numero);

        //Se o numero decimal for menor que 10
        if (numero < 10){
            //Se o numero decimal for maior que 1
            if (numero > 1){
                magnitude = 1;
                numeroString = Character.toString(numeroString.charAt(0)) + Character.toString(numeroString.charAt(2));
                int valorNumber = Integer.parseInt(numeroString);
                this.valor = valorNumber;
                this.mag = magnitude;
            }else{
                //Se o numero decimal for menor que 1
                magnitude = 0;

                if (numeroString.contains(",")){
                    numeroString = numeroString.split("\\,")[1];
                }else{
                    numeroString = numeroString.split("\\.")[1];
                }

                while (numeroString.startsWith("0", 0)){
                    magnitude = magnitude - 1;
                    numeroString = numeroString.substring(1, numeroString.length());
                }

                if (numeroString.length() > 3)
                    numeroString = numeroString.substring(2, numeroString.length() - 2);

                valor = Integer.parseInt(numeroString);

                if (valor < 10){
                    valor = valor * 10;
                }
                this.valor = valor;
                this.mag = magnitude;
            }
        }else{
            //Se o numero decimal for maior que 10, descarta quebrados
            numeroString = Integer.toString((int)numero);
            ValorMag result = new ValorMag(Integer.parseInt(numeroString));
            this.valor = result.getValor();
            this.mag = result.getMag();
        }
    }


    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getMag() {
        return mag;
    }

    public void setMag(int mag) {
        this.mag = mag;
    }

    public String toString(){
        return this.valor + "m" + this.mag;
    }

    public boolean equals(Object obj){
        if (obj == this){
            return true;
        }
        if (getClass() != obj.getClass()){
            return false;
        }
        ValorMag valorMag = (ValorMag) obj;

        if (valorMag.getValor() == this.valor && valorMag.getMag() == this.mag){
            return true;
        } else {
            return false;
        }
    }

    public ValorMag divide(ValorMag divisor){
        if (this.toString() == "0m0"){
            return new ValorMag();
        }
        if (divisor.toString() == "1m1" || divisor.toString() == "10m0"){
            return this;
        }
        int magFinal = ((this.mag - 2) - (divisor.getMag() - 2)) + 2;
        double valorFinal = (double)this.valor / (double)divisor.getValor();

        while (valorFinal < 10){
            valorFinal *= 10;
            magFinal -= 1;
        }
        return new ValorMag((int)Math.floor(valorFinal), magFinal);
    }

    public ValorMag divide(int divisor){
        if (divisor == 0){
            return new ValorMag();
        }
        if (divisor == 1){
            return this;
        }
        return this.divide(new ValorMag(divisor));
    }

    public ValorMag add(ValorMag valor){
        if (this.toString() == "0m0"){
            return valor;
        }
        double valorFinal;
        double magnitudeFinal;
        int valor1 = this.valor;
        int valor2 = valor.getValor();
        int mag1 = this.mag;
        int mag2 = valor.getMag();

        if (mag1 == mag2){
            magnitudeFinal = mag1;
            valorFinal = valor1 + valor2;

            if (valorFinal > 99)
            {
                valorFinal = valorFinal / 10;
                magnitudeFinal = magnitudeFinal + 1;
            }
        } else if (mag1 - mag2 == 1 || mag1 - mag2 == -1){
            magnitudeFinal = Math.max(mag1, mag2);

            if (magnitudeFinal == mag1)
                valorFinal = (double)valor1 + ((double)valor2 / 10);
            else
                valorFinal = (double)valor2 + ((double)valor1 / 10);
        }
        else{
            magnitudeFinal = Math.max(mag1, mag2);
            if (magnitudeFinal == mag1)
                valorFinal = valor1;
            else
                valorFinal = valor2;
        }
        return new ValorMag((int)Math.floor(valorFinal), (int)Math.floor(magnitudeFinal));
    }

    public ValorMag subtract(ValorMag valor){
        if (this.toString() == valor.toString()){
            return new ValorMag();
        }
        double valorFinal;
        int magnitudeFinal = 0;
        int valor1 = this.getValor();
        int valor2 = valor.getValor();
        int mag1 = this.getMag();
        int mag2 = valor.getMag();

        if (mag1 == mag2){
            magnitudeFinal = mag1;
            valorFinal = valor1 - valor2;
            if (valorFinal < 0){
                valorFinal *= 10;
                magnitudeFinal -= 1;
            }
        }else if (mag1 - mag2 == 1 || mag1 - mag2 == -1){
            magnitudeFinal = Math.max(mag1, mag2);

            if (magnitudeFinal == mag1)
                valorFinal = (double)valor1 - ((double)valor2 / 10);
            else
                valorFinal = (double)valor2 - ((double)valor1 / 10);
        }else{
            magnitudeFinal = Math.max(mag1, mag2);
            if (magnitudeFinal == mag1)
                valorFinal = valor1;
            else
                valorFinal = valor2;
        }

        return new ValorMag((int)Math.floor(valorFinal), (int)Math.floor(magnitudeFinal));
    }

    public int toInteger(){
        int result = 0;
        String zeros = "";
        int numeroLen = String.valueOf(this.valor).length();

        for (int i=0; i < this.mag - numeroLen; i++){
            zeros = zeros + "0";
        }

        result = Integer.parseInt(String.valueOf(this.valor) + zeros);

        return result;
    }

    public ValorMag multiply(ValorMag valor){
        if (this.toString() == "1m2" || this.toString() == "10m1"){
            return valor;
        } else if (valor.toString() == "1m2" || valor.toString() == "10m1"){
            return this;
        } else if (this.valor == 0 || valor.getValor() == 0){
            return new ValorMag();
        } else {
            int magFinal = (this.mag + valor.getMag()) -2;
            int valorFinal = (this.valor * valor.getValor());
            while(valorFinal > 99){
                valorFinal /=  10;
                magFinal += 1;
            }
            return new ValorMag(valorFinal, magFinal);
        }
    }

    public ValorMag multiply(int multiplicador){
        if (multiplicador == 1){
            return this;
        } else if (this == new ValorMag() || multiplicador == 0){
            return new ValorMag();
        } else{
            return this.multiply (new ValorMag(multiplicador));
        }
    }
}
