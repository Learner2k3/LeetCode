class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> firstRow= new ArrayList<>();
        firstRow.add(1);
        result.add(firstRow);
        for(int i =1; i<numRows; i++){
            List<Integer> prevRow = result.get(i-1);
            List<Integer> otherRow = new ArrayList<>();
            otherRow.add(1);
            for(int j =0; j<i-1; j++){
                otherRow.add(prevRow.get(j)+prevRow.get(j+1));
            }
            otherRow.add(1);
            result.add(otherRow);
        }
        return result;
    }
}