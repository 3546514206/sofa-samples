package edu.zjnu;

/**
 * @author 杨海波
 * @date 2024/1/23 16:31
 * @description CalculatorService
 */
public interface ICalculatorService {

    /**
     * add
     *
     * @param a a
     * @param b b
     * @return a+b
     */
    int add(int a, int b);

    /**
     * sub
     *
     * @param a a
     * @param b b
     * @return a - b
     */
    int sub(int a, int b);

    /**
     * multiply
     *
     * @param a a
     * @param b b
     * @return a*b
     */
    int multiply(int a, int b);

    /**
     * divide
     *
     * @param a a
     * @param b b
     * @return a/b
     */
    int divide(int a, int b);

}

