using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Project1
{
    static class Class1
    {
        public static void Main()
        {
            int i = 0;

            Console.WriteLine("Beginning for loop execution");

            for (i = 0; i <= 10; i++)
            {
                Console.WriteLine("The integer i currently has a value of " + i);

            }

            Console.WriteLine("Exited from Loop Block");
            Console.WriteLine();
            Console.WriteLine("Beginning while loop execution");

            i = 0;

            while (i <= 10)
            {
                Console.WriteLine("The integer i currently has a value of " + i);

                i++;

            }

            Console.WriteLine("Exited while loop block");
            Console.WriteLine();
            Console.WriteLine("Beginning do-while loop execution");

            i = 0;

            do
            {
                Console.WriteLine("The integer i currently has a value of " + i);

                i++;
            }

            while (i <= 10);

            Console.WriteLine("Exited do-while loop block");
        }
    }
}