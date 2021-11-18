public class HangingMan
{
    private int numWrongGuesses;
    String[] hangmanImage = {"                @\n" +
			     "              @$$@\n" +
			     "             @$$$@\n" +
			     "            @$$@\n" +
			     "            @@\n\n" +

			     "        ***    ***\n" +
			     "    **%%%%***%***%%**\n" +
                             "  ********%%***********\n" +
                             " *****////*****%%%******\n" +
                             " *%%%\\\\\\\\\\\\%************\n" +
                             " **********%%%%*********\n" +
                             " *****%%****************\n" +
                             "  *********************\n" +
                             "   ***%********%%%***\n" +
                             "     ***%%*  ***%%*\n",

                             "                @\n" +
			     "              @$$@\n" +
			     "             @$$$@\n" +
			     "            @$$@\n" +
			     "            @@\n\n" +

			     "        ***    ***\n" +
			     "    **%%%%***%***%%**\n" +
                             "  ********%%***********\n" +
                             " *****////*****%%%*****\n" +
                             " *%%%\\\\\\\\\\\\%*********\n" +
                             " **********%%%%******\n" +
                             " *****%%**************\n" +
                             "  *********************\n" +
                             "   ***%********%%%***\n" +
                             "     ***%%*  ***%%*\n",
                        
                             "                @\n" +
			     "              @$$@\n" +
			     "             @$$$@\n" +
			     "            @$$@\n" +
			     "            @@\n\n" +

			     "        ***    ***\n" +
			     "    **%%%%***%***%%**\n" +
                             "  ********%%**********\n" +
                             " *****////*****%%%**\n" +
                             " *%%%\\\\\\\\\\\\%***\n" +
                             " **********%%%%*\n" +
                             " *****%%*********\n" +
                             "  ********************\n" +
                             "   ***%********%%%***\n" +
                             "     ***%%*  ***%%*\n",
                        
                             "                @\n" +
			     "              @$$@\n" +
			     "             @$$$@\n" +
			     "            @$$@\n" +
			     "            @@\n\n" +

			     "        ***    \n" +
			     "    **%%%%**\n" +
                             "  ********%%***\n" +
                             " *****////****\n" +
                             " *%%%\\\\\\\\\\\\\n" +
                             " **********%%%%*\n" +
                             " *****%%*********\n" +
                             "  ********************\n" +
                             "   ***%********%%%***\n" +
                             "     ***%%*  ***%%*\n",
                            
                            
                             "                @\n" +
			     "              @$$@\n" +
			     "             @$$$@\n" +
			     "            @$$@\n" +
			     "            @@\n\n" +

			     "        ***    \n" +
			     "    **%%%%**\n" +
                             "  ********%%***\n" +
                             " *****////****\n" +
                             " *%%%\\\\\\\\\\\\\n" +
                             " **********%%\n" +
                             " *****%%***\n" +
                             "  ********\n" +
                             "   ***%******\n" +
                             "     ***%%\n",
                            
                            
                             "                @\n" +
			     "              @$$\n" +
			     "             @$\n" +
			     "            @$\n" +
			     "            \n\n" +

			     "        \n" +
			     "    *\n" +
                             "  ***\n" +
                             " ****///\n" +
                             " *%%%\\\\\\\n" +
                             " *********\n" +
                             " *****%%***\n" +
                             "  ********\n" +
                             "   ***%******\n" +
                             "     ***%%\n",
                            
                            
                             "                \n" +
			     "              \n" +
			     "             \n" +
			     "            @\n" +
			     "            \n\n" +

			     "        \n" +
			     "    *\n" +
                             "  ***\n" +
                             " ****///\n" +
                             " *%%\\\\\\\n" +
                             " **\n" +
                             " **\n" +
                             "  ***\n" +
                             "   *\n" +
                             "     \n",
                             
                             "                \n" +
			     "              \n" +
			     "             \n" +
			     "            \n" +
			     "            \n\n" +

			     "        \n" +
			     "    \n" +
                             "  \n" +
                             " \n" +
                             " \n" +
                             " \n" +
                             " \n" +
                             "  *\n" +
                             "   \n" +
                             "     \n"
                        };
                            
    public void dieSomeMore()
    {
        numWrongGuesses++;
    }
    
    public boolean isntDead()
    {
        return numWrongGuesses < hangmanImage.length;
    }
    
    public void show()
    {
        System.out.println(hangmanImage[numWrongGuesses]);
    }
}