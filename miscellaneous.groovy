println "Hello, World!";
print "Hello, World!"

/* so println adds a \n at the end of the print - skips to a new line
whereas print does not. */


// Make a SQL connection, run query:
/* Full example code from jdbc website:
Statement st = conn.createStatement();
ResultSet rs = st.executeQuery("SELECT * FROM mytable WHERE columnfoo = 500");
while (rs.next()) {
    System.out.print("Column 1 returned ");
    System.out.println(rs.getString(1));
}
rs.close();
st.close();
*/