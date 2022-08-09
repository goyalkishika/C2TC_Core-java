
ResultSet rs = Stmt.executeQuery(query);

while (rs.next()) {
	int ssn = rs.getInt("SSN");
	String name = rs.getString("NAME");
	int marks = rs.getInt("MARKS");

}
