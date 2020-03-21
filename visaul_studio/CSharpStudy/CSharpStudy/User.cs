using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CSharpStudy
{
    public class User
    {
        //번호, 이름, 나이, 연락처
        //C# 3.0 이상의 기능
        public int No { get; set; }

        public string Name{ get; set; }

        public int Age { get; set; }

        public string Phone { get; set; }


        //private int _no;

        //private string _name;

        ////Java 형식 get set
        //public void setNo(int no)
        //{
        //    _no = no;
        //}

        //public int getNo()
        //{
        //    return _no;
        //}
    }
}
