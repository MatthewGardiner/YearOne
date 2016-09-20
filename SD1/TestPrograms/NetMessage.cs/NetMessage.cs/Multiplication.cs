using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;


namespace NetMessage.cs
{
    class Multiplication
    {
        public static void Main() 
    {

    
            string input = "";
            int currentNum;
            int multiplier = 0;
            int sum = 0;

            System.Console.WriteLine("Please input a number");
            input = System.Console.ReadLine();
            multiplier = int.Parse(input);

            for (int i = 1; i < 1001; i++)
            {
                currentNum = i;

                sum = currentNum * multiplier;

                System.Console.WriteLine(currentNum + " times " + multiplier + " is " + sum);
            }


            
        }
    }
}
