package OPC.IfStatmentsConvertsToClasses;

import OPC.interfacee.IGetOperationResult;

import java.util.ArrayList;
public class Add implements IGetOperationResult {
    @Override
    public int results(ArrayList<Integer> numbers){


        int result = 0;
        for (Integer number : numbers) {
            result += number;
        }
        return result;
    }
    }