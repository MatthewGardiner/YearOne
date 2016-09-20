using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace NetMessage.cs
{
    class BoxOffice
    {
        public static void Main()
        {
            String inData;
            int age;

            System.Console.WriteLine("Enter your age:");
            inData = System.Console.ReadLine();
            age = int.Parse(inData);

            if (age < 18)
            {
                System.Console.WriteLine("Child Rate.");
            }

            else
            {
                System.Console.WriteLine("Adult Rate.");

            }
            System.Console.WriteLine("Enjoy the show.");

        }
    }
}
