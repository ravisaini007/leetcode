class Solution {
    public int firstUniqChar(String s) {
        char [] strtochar = s.toCharArray();

        for(int i =0 ; i<strtochar.length; i++)
        {
            for(int j =0 ; j<strtochar.length; j++)
            {
                if( i!=j && strtochar[i]==strtochar[j])
                {
                    break;
                }
                if (j == strtochar.length-1)
                {
                    return i;
                }
            }
        }
        return -1;
    }
}