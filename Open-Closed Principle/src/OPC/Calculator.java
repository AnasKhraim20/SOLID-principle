package OPC;


import OPC.interfacee.IGetOperationResult;

import java.util.ArrayList;

public class Calculator {
    private ArrayList<Integer> numbers = null;
    public Calculator(){ numbers = new ArrayList<>();
    }

    public ArrayList<Integer> getNumbers() {
        return numbers;
    }

    public void addNumber(int number){
        numbers.add(number);
    }

    public void removeNumberAtIndex(int index){
        if (index < 0 || index >= numbers.size()){
            System.out.println("Invalid number: " + index);
            return;
        }
        numbers.remove(index);
    }
    private IGetOperationResult getOperationResult;
    public int getOperationResult(IGetOperationResult  getOperationResult) {
        getOperationResult.results(numbers);
        System.err.println("Invalid operation");
        return -1111111;
    }
}
