package OPC.IfStatmentsConvertsToClasses;
import OPC.interfacee.IGetOperationResult;

import java.util.ArrayList;
public class Max implements IGetOperationResult {
    @Override
    public int results (ArrayList<Integer> numbers) {

        int max = Integer.MIN_VALUE;
        for (Integer number : numbers) {
            if (max < number){
                max = number;
            }
        }
        return max;
    }}
