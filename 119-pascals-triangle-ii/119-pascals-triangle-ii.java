class Solution {
    public List<Integer> getRow(int rowIndex) {
        ArrayList<Integer> res = new ArrayList<>(rowIndex+1);
        
        //as we know first term is alway 1
        long val = 1;
        
        for(int i = 0; i <= rowIndex; i++){
            //add val to the list first
            res.add((int)val);
            
            //find next term as --> val * factor. Here consider rowIndex = n(row) & i = r(column) 
            /**Imp: Make sure you dont write 
            
            (rowIndex - i) / (i+1) as  ((rowIndex - i) / (i+1)) -- > this will give asn as 0;
            Eg: 3 * (1/3) => 3* 0 = 0.
               Instead of this have => 3 * 1 / 3
            **/
            val = val * (rowIndex - i) / (i+1);
        }
        
        return res;
    }
}

/*
The idea is to calculate a common factor and multiply it with the n-1th term to get nth term.

Eg: We know nc0 & ncn = 1

    Suppose we want to find terms in 4th row. Then
    we know 4c0 = 1
    1) We find 4c1 = factor * 4c0
    2) 4c2 = factor * 4c1
    3) 4c3 = factor * 4c2 and so on until end of row
    
    
    Hence TC = 0(N)
    SP = O(1) wedont consider list that we have to return as answer to be extra space
*/