class Solution {
    public boolean isPathCrossing(String path) {
        Set<String> visited = new HashSet<>();
        int x = 0, y = 0;
        visited.add(x+","+y);
        for(char ch : path.toCharArray()){
            switch(ch){
                case 'N':
                    y++;
                    break;
                case 'S':
                    y--;
                    break;
                case 'E':
                    x++;
                    break;
                case 'W':
                    x--;
                    break;
            }
            String curPos = x+","+y;
            if(!visited.add(curPos)){
                return true;
            }
        }
        return false;
        
    }
}