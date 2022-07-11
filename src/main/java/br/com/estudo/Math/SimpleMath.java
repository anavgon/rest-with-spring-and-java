package br.com.estudo.Math;

import br.com.estudo.Converter.NumberConverter;
import br.com.estudo.exceptions.UnsupportedMathOperationException;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class SimpleMath {
    //soma
    public double sum(Double numberOne,Double numberTwo){

        return numberOne + numberTwo;
    }
    //subtraçao
    public double sub(Double numberOne,Double numberTwo) {

        return numberOne - numberTwo;
    }
    //multiplicaçao
    public double mult(Double numberOne,Double numberTwo){

        return numberOne * numberTwo;
    }
    //divisao
    public double div(Double numberOne,Double numberTwo){

        return numberOne / numberTwo;
    }
    //media
    public double media(Double numberOne,Double numberTwo) {

        return (numberOne + numberTwo) / 2;
    }
    //raiz quadrada
    public double squareRoot(Double number){

        return Math.sqrt(number) ;
    }
}
