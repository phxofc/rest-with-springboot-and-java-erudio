package com.example.restwithspringbootandjavaerudio.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.RestController;

import com.example.restwithspringbootandjavaerudio.converters.NumberConverter;
import com.example.restwithspringbootandjavaerudio.exceptions.UnsupportedMathOperationMath;
import com.example.restwithspringbootandjavaerudio.operations.OperationsMath;

@RestController
public class MathController {

    private OperationsMath op = new OperationsMath();

    // soma
    @RequestMapping(value = "/sum/{numberOne}/{numberTwo}", method = RequestMethod.GET)

    public Double sum(@PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo) throws Exception {

        if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {

            throw new UnsupportedMathOperationMath("PLEASE SET A NUMERIC VALUE!");

        }

        return op.sum(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));

    }

    // subtração

    @RequestMapping(value = "/subtraction/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double subtraction(@PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo) {

        if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationMath("PLEASE SET A NUMERIC VALUE!");
        }
        return op.subtraction(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
    }

    // divisão

    @RequestMapping(value = "/division/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double division(@PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo) {

        if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationMath("PLEASE SET A NUMERIC VALUE!");
        }
        return op.division(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
    }

    // multiplicação

    @RequestMapping(value = "/multiplication/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double multiplication(@PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo) {

        if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationMath("PLEASE SET A NUMERIC VALUE!");
        }
        return op.multiplication(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
    }

    // média

    @RequestMapping(value = "/mean/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double mean(@PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo) {

        if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationMath("PLEASE SET A NUMERIC VALUE!");
        }
        return op.mean(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
    }

    // raiz quadrada

    @RequestMapping(value = "/squareroot/{numberOne}", method = RequestMethod.GET)
    public Double quareRoot(@PathVariable(value = "numberOne") String numberOne) {

        if (!NumberConverter.isNumeric(numberOne)) {
            throw new UnsupportedMathOperationMath("PLEASE SET A NUMERIC VALUE!");
        }
        return  op.squareRoot(NumberConverter.convertToDouble(numberOne));
    }

    


    

}
