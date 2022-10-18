package OPC.IfStatmentsConvertsToClasses;
import OPC.interfacee.IGetOperationResult;

import java.util.ArrayList;
public class Min implements IGetOperationResult {
    @Override
    public int results (ArrayList<Integer> numbers){

        int Min = Integer.MIN_VALUE;
        for (Integer number : numbers) {
            if (Min >number){
                Min = number;
            }
        }
        return Min;
    }
    }

