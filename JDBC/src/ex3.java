


Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
PreparedStatement stmt=con.createStatement(“insert into emp values(?,?,?)”);

Scanner sc=new Scanner(System.in);
while(true){
	System.out.println("Enter emp id");
	int eid = sc.nextInt();
	System.out.println("Enter emp name");
	int ename = sc.next();
	System.out.println("Enter emp sal");
	int esal = sc.nextDouble();
	stmt.setInt(1,eid);
	stmt.setString(2,ename);
	stmt.setDouble(3,esal);
	Stmt.executeUpdate();
	System.out.println("Values are added successfully you want one more(yes/no)");
	String option = sc.next();
	if(option.equals("no");
	break;

}
