package OPC.IfStatmentsConvertsToClasses;

import OPC.interfacee.IGetOperationResult;

import java.util.ArrayList;
public class Count implements IGetOperationResult {
    @Override
    public int results (ArrayList<Integer> numbers){
        return numbers.size();
        
        
    }}