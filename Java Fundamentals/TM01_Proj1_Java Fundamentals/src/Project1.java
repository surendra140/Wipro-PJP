public class Project1 {
    
    public static void main(String[] args){

        int[] emp_id = {1001,1002,1003,1004,1005,1006,1007};
        String[] emp_name = {"Ashish","Shushma","Rahul","Chahat","Ranjan","Suman","Tanmay"};
        String[] join_date ={"01/04/2009","23/08/2012","12/11/2008","29/01/2013","16/07/2005","01/01/2000","12/06/2006"};
        char[] desig_code = {'e','c','k','r','m','e','c'};
        String[] department = {"R&D","PM","Acct","Front Desk","Engg","Manufacturing","PM"};
        int[] basic = {20000,30000,10000,12000,50000,23000,29000};
        int[] hra = {8000,12000,8000,6000,20000,9000,12000};
        int[] it = {3000,9000,1000,2000,20000,4400,10000};

        String[] designation ={"Engineer","Consultant","Clerk","Receptionist","Manager"};
        int[] DA = {20000,32000,12000,15000,40000};
    
        String desig = null;
        int dear = 0;

        int i, index=0;

        if(args.length == 0)
        {
            System.out.println("Please enter empid");
        }
        else {
               int empid =(int)(Integer.parseInt(args[0]));
               int count = 0;
               for( i = 0; i < emp_id.length; i++){

                  if(empid == emp_id[i]){
                      index = i;
                      count++;
                  }
               }

               if(count == 1) {
                   switch(desig_code[index]) {
                        case 'e': desig = designation[0];
                                dear = DA[0];
                                break;

                        case 'c': desig = designation[1];
                                dear = DA[1];
                                break;

                        case 'k': desig = designation[2];
                                dear = DA[2];
                                break;

                        case 'r': desig = designation[3];
                                dear = DA[3];
                                break;

                        case 'm': desig = designation[4];
                                dear = DA[4];
                                break;  
                   }

                   int salary = basic[index]+hra[index]+dear - it[index];

                    System.out.println("Emp No.    Emp Name    Department    Designation    Salary");
                    System.out.println(emp_id[index]+"\t"+emp_name[index]+"\t\t"+department[index]+"\t\t"+desig+"\t\t"+salary);
               }
               else{
                   System.out.println("There is no employee with empid "+args[0]);
               }
        }
    
    }
}
