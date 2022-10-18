package OPC.IfStatmentsConvertsToClasses;
import OPC.interfacee.IGetOperationResult;

import java.util.ArrayList;
public class Multiplcation implements IGetOperationResult {
   @Override
    public int results (ArrayList<Integer> numbers){
    int result = 1;
            for (Integer number : numbers) {
        result *= number;
    }
            return result;
}
}
