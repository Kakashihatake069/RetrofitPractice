#include<iostream.h>
#include<conio.h>
class employee
{
	int   emp_id;
	char  emp_name[100];
	char emp_role[100];
	int emp_salary;
	int emp_xp;
	char emp_add[100];
	int emp_cont;


	public:

		void get_emp_details();
		void show_emp_details();
};

void employee :: get_emp_details()
{
	cout<<"\nEnter employee id: ";
	cin>>emp_id;
	cout<<"\nEnter employee name: ";
	cin>>emp_name;
	cout<<"\nEnter employee role : ";
	cin>>emp_role;
	cout<<"\nEnter employee salary : ";
	cin>>emp_salary;
	cout<<"\nEnter employee experience: ";
	cin>>emp_xp;
	cout<<"\nEnter employee address: ";
	cin>>emp_add;
	cout<<"\nEnter employee contact: ";
	cin>>emp_cont;
}
void employee :: show_emp_details()
{
	cout<<"\n\n**** Details of  Employee ****";
	cout<<"\nEmployee Name        :  "<<emp_name;
	cout<<"\nEmployee number      :  "<<emp_id;
	cout<<"\nEmployee salary      :  "<<emp_salary;
	cout<<"\nEmployee role        :  "<<emp_role;
	cout<<"\nEmployee experience  :  "<<emp_xp;
	cout<<"\nEmployee address     :  "<<emp_add;
	cout<<"\nEmployee contact     :  "<<emp_cont;
	cout<<"\n-------------------------------\n\n";
}


void main()
{
    clrscr();
    employee emp;
    emp.get_emp_details();
    emp.show_emp_details();
    getch();
}