
public class Accumulator {
    double valueSoFar;//Calc knows to start at this at startup
    String currentOperator;//Number the calc reads that gets cleared

    Accumulator(){
        valueSoFar = 0.0;
        currentOperator = "CE";

    }
    void calculate(double numberOnDisplay, String nextOperator){
	//Button functionality
        if (currentOperator.equals("CE")) {
            valueSoFar = numberOnDisplay;
        }
        if (currentOperator.equals("+")){
            valueSoFar = valueSoFar + numberOnDisplay;
        }
        if (currentOperator.equals("-")) {
            valueSoFar = valueSoFar - numberOnDisplay;
        }
        if (currentOperator.equals("/")) {
            valueSoFar = valueSoFar / numberOnDisplay;
        }
        if (currentOperator.equals("*")) {
            valueSoFar = valueSoFar * numberOnDisplay;
        }
        if (currentOperator.equals("%")) {
            valueSoFar = valueSoFar % numberOnDisplay;

        }
        if (currentOperator.equals("SQR")) {
            valueSoFar =  Math.sqrt(valueSoFar);


        }
        currentOperator = nextOperator;
    }
	//Getvalue function
    double getValue(){
        return valueSoFar;
    }
	//Reset button
    void resetAcc(){
        valueSoFar = 0.0;
        currentOperator = "CE";
    }

}
